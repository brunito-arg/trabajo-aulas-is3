package com.grupo2.trabajoaulasis3.services;

import com.grupo2.trabajoaulasis3.entities.Docente;

import java.util.List;

public interface IDocenteService {

    public List<Docente>getAll();

    public Docente insertOrUpdate(Docente d);

    public void removeDocente(int idDocente);

    public Docente findByIdDocente(int idDocente);
}
