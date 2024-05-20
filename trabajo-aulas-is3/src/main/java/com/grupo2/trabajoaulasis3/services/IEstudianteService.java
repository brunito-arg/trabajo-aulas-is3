package com.grupo2.trabajoaulasis3.services;

import com.grupo2.trabajoaulasis3.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {

    public List<Estudiante>getAll();

    public Estudiante insertOrUpdate(Estudiante e);

    public void removeEstudiante(int idEstudiante);

    public Estudiante findByIdEstudiante(int idEstudiante);
}
