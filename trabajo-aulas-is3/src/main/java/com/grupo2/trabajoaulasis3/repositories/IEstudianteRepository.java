package com.grupo2.trabajoaulasis3.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.trabajoaulasis3.entities.Estudiante;

@Repository("estudianteRepository")
public interface IEstudianteRepository extends JpaRepository <Estudiante, Serializable>{
	
	public abstract Estudiante findById(int id);
	
	public abstract Estudiante findByNombre(String nombre);
	
	public abstract Estudiante findByYearAndNombre(int year, String nombre);
	
	public abstract List<Estudiante> findByYear(int year);
	
}
