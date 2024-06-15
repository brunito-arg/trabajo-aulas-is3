package com.grupo2.trabajoaulasis3.repositories;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
	
	@Query ("SELECT m from Materia m")
	public abstract List<Materia> findAll();
	
	@Query("SELECT m FROM Materia m " +
	           "WHERE (:nombre IS NULL OR m.nombre LIKE %:nombre%) " +
	           "AND (:dia IS NULL OR m.dia = :dia) " +
	           "AND (:horario IS NULL OR m.horario = :horario) " +
	           "AND (:edificio IS NULL OR m.aula.edificio LIKE %:edificio%)")
	    List<Materia> findByCriterios(
	            @Param("nombre") String nombre,
	            @Param("dia") String dia,
	            @Param("horario") LocalTime horario,
	            @Param("edificio") String edificio);

}
