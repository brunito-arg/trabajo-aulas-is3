package com.grupo2.trabajoaulasis3.services.implementation;

import com.grupo2.trabajoaulasis3.entities.Estudiante;
import com.grupo2.trabajoaulasis3.repositories.IEstudianteRepository;
import com.grupo2.trabajoaulasis3.services.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class EstudianteService implements IEstudianteService {

    @Autowired
    @Qualifier("estudianteRepository")
    private IEstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> getAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante insertOrUpdate(Estudiante e) {
        Estudiante estudianteNuevo=estudianteRepository.save(e);
        return estudianteNuevo;
    }

    @Override
    public void removeEstudiante(int idEstudiante) {
        estudianteRepository.deleteById(idEstudiante);
    }

    @Override
    public Estudiante findByIdEstudiante(int idEstudiante) {
        return estudianteRepository.findById(idEstudiante);
    }
}
