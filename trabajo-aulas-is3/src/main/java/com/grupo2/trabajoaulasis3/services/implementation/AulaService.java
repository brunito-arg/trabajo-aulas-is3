package com.grupo2.trabajoaulasis3.services.implementation;

import com.grupo2.trabajoaulasis3.entities.Aula;
import com.grupo2.trabajoaulasis3.repositories.IAulaRepository;
import com.grupo2.trabajoaulasis3.services.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaService implements IAulaService {

    @Autowired
    @Qualifier("aulaRepository")
    private IAulaRepository aulaRepository;

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
}
