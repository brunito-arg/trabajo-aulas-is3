package com.grupo2.trabajoaulasis3.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.trabajoaulasis3.entities.Docente;

@Repository("docenteRepository")
public interface IDocenteRepository extends JpaRepository <Docente, Serializable>{

	public abstract Docente findById(int id);
	
	public abstract Docente findByNombre(String nombre);
	
}
