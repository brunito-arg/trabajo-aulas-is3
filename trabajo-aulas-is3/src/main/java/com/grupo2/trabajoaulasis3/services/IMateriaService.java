package com.grupo2.trabajoaulasis3.services;

import com.grupo2.trabajoaulasis3.entities.Materia;

import java.util.List;


public interface IMateriaService {

    public List<Materia> findAll();

    public Materia insertOrUpdate(Materia m);

    public Materia findByIdMateria(int idMateria);

    public void removeMateria(int idMateria);
    
    public void asignarAula(Materia m);
    
    public void asignarAulas();
    
  
    
}
