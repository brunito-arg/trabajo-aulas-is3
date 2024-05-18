package com.grupo2.trabajoaulasis3.services.implementation;

import com.grupo2.trabajoaulasis3.entities.Materia;
import com.grupo2.trabajoaulasis3.repositories.IEstudianteRepository;
import com.grupo2.trabajoaulasis3.repositories.IMateriaRepository;
import com.grupo2.trabajoaulasis3.services.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class MateriaService implements IMateriaService {

    @Autowired
    @Qualifier("materiaRepository")
    private IMateriaRepository materiaRepository;

    @Override
    public List<Materia> getAll() {
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
}
