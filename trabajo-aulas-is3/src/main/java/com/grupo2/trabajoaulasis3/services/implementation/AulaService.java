package com.grupo2.trabajoaulasis3.services.implementation;

import com.grupo2.trabajoaulasis3.entities.Aula;
import com.grupo2.trabajoaulasis3.entities.Materia;
import com.grupo2.trabajoaulasis3.repositories.IAulaRepository;
import com.grupo2.trabajoaulasis3.repositories.IMateriaRepository;
import com.grupo2.trabajoaulasis3.services.IAulaService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service("aulaService")
public class AulaService implements IAulaService {

    @Autowired
    @Qualifier("aulaRepository")
    private IAulaRepository aulaRepository;

    @Autowired
    private IMateriaRepository materiaRepository;
    
    @Override
    public List<Aula> getAll() {
        return aulaRepository.findAll();
    }

    @Override
    public Aula insertOrUpdate(Aula a) {
        return aulaRepository.save(a);
    }

    @Override
    public Aula findByIdAula(int id){
        return aulaRepository.findById(id);
    }
    
    @Override
    public List<Aula> findAllOrderByOrderByCapacidadAsc(){
    	return aulaRepository.findAllOrderByOrderByCapacidadAsc();
    }
    
    public boolean estaOcupada(Aula aula, String dia, LocalTime horario) {
    	boolean estaOcupada = false;
    	int count = 0;
    	List <Materia> materias = materiaRepository.findAll();
    	Materia materia;
    
    	while (!estaOcupada && count < materias.size()) {
    		materia = materias.get(count);
    		
    		if (materia.getAula() != null) {
    			if (materia.getAula().getId() == aula.getId() && 
    	    			materia.getDia().compareTo(dia) == 0 &&
    	    			materia.getHorario().equals(horario)
    	    			)
    				{
    	    			estaOcupada = true;
    				}
    		}
    		
    		count++;
    	}
    	
    	return estaOcupada;
    }
    
}
