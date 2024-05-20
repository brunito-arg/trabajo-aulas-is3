package com.grupo2.trabajoaulasis3.services.implementation;

import com.grupo2.trabajoaulasis3.entities.Docente;
import com.grupo2.trabajoaulasis3.repositories.IDocenteRepository;
import com.grupo2.trabajoaulasis3.services.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class DocenteService implements IDocenteService {

    @Autowired
    @Qualifier("docenteRepository")
    private IDocenteRepository docenteRepository;

    @Override
    public List<Docente> getAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente insertOrUpdate(Docente d) {
        Docente docenteNuevo=docenteRepository.save(d);
        return docenteNuevo;
    }

    @Override
    public void removeDocente(int idDocente) {
        docenteRepository.deleteById(idDocente);
    }

    @Override
    public Docente findByIdDocente(int idDocente) {
        return docenteRepository.findById(idDocente);
    }
}
