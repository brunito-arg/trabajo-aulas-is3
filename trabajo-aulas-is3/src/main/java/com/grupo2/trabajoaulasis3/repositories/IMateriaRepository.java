package com.grupo2.trabajoaulasis3.repositories;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.trabajoaulasis3.entities.Aula;
import com.grupo2.trabajoaulasis3.entities.Docente;
import com.grupo2.trabajoaulasis3.entities.Materia;

@Repository("materiaRepository")
public interface IMateriaRepository extends JpaRepository <Materia, Serializable>{

	public abstract Materia findById(int id);
	
	public abstract Materia findByNombre(String nombre);
	
	public abstract List<Materia> findByAula(Aula aula);
	
	public abstract List<Materia> findByHorario(LocalTime horario);
	
	public abstract Materia findByNombre(Docente docente);
	
	public abstract List<Materia> findAll();
	
	
	
}
