package com.grupo2.trabajoaulasis3.services;

import com.grupo2.trabajoaulasis3.entities.Aula;

import java.time.LocalTime;
import java.util.List;

public interface IAulaService {

    public List<Aula> getAll();

    public Aula insertOrUpdate(Aula a);

    public Aula findByIdAula(int id);
    
    public List<Aula> findAllOrderByOrderByCapacidadAsc();
    
    public boolean estaOcupada(Aula aula, String dia, LocalTime horario);
}
