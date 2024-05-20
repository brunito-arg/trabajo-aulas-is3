package com.grupo2.trabajoaulasis3.services.implementation;

import com.grupo2.trabajoaulasis3.entities.Aula;
import com.grupo2.trabajoaulasis3.entities.Materia;
import com.grupo2.trabajoaulasis3.repositories.IAulaRepository;
import com.grupo2.trabajoaulasis3.repositories.IMateriaRepository;
import com.grupo2.trabajoaulasis3.services.IAulaService;
import com.grupo2.trabajoaulasis3.services.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("materiaService")
public class MateriaService implements IMateriaService {

    @Autowired
    @Qualifier("materiaRepository")
    private IMateriaRepository materiaRepository;
    
    @Autowired
    private IAulaService aulaService;
    
    @Override
    public List<Materia> findAll() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia insertOrUpdate(Materia m) {
       Materia materiaNueva=materiaRepository.save(m);
       return materiaNueva;
    }

    @Override
    public Materia findByIdMateria(int idMateria) {
        return materiaRepository.findById(idMateria);
    }

    @Override
    public void removeMateria(int idMateria) {
        materiaRepository.deleteById(idMateria);
    }
    
    
    public void asignarAula(Materia m) {
    	List<Aula> aulas = aulaService.findAllOrderByOrderByCapacidadAsc();
    	int cantEstudiantes = m.getEstudiantes().size();
    	boolean asignada = false;
    	int count = 0;
    	Aula aula;
    	boolean aulaEstaOcupada;
    	
    	while (!asignada && count < aulas.size()) {
    		aula = aulas.get(count);
    		aulaEstaOcupada = aulaService.estaOcupada(aula, m.getDia(), m.getHorario());
    		
    		if (!aulaEstaOcupada && aula.getCapacidad() >= cantEstudiantes) {
    			System.out.println(aula.getId());
    			if (!m.isNecesitaLaboratorio() || (m.isNecesitaLaboratorio() && aula.isEsLaboratorio())) {
        			m.setAula(aula);
        			insertOrUpdate(m);
        			asignada = true;
    			}
    		}
    		count++;
    	}
    }
    
    
    public void asignarAulas() {
    	List <Materia> materias = findAll();
  
    	for (Materia materia: materias) {
    		if (materia.getAula() == null)
    			asignarAula(materia);
    	}
    	
    }
    
   
    
}
