package com.grupo2.trabajoaulasis3.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.trabajoaulasis3.entities.Aula;

@Repository("aulaRepository")
public interface IAulaRepository extends JpaRepository <Aula, Serializable>{

	public abstract Aula findById(int id);
	
	public abstract List<Aula> findByEdificio(String edificio);
	
	public abstract List<Aula> findByCapacidad(int capacidad);

	public abstract Aula findByEdificioAndNumero(String edificio, int numero);
	
	public abstract List<Aula> findByEsLaboratorioTrue();
	
	public abstract List<Aula> findByTieneProyectorTrue();
	
	public abstract List<Aula> findByEsLaboratorioFalse();
	
	public abstract List<Aula> findByTieneProyectorFalse();
	
	public abstract List<Aula> findByEdificioAndEsLaboratorioTrue(String edificio);

	public abstract List<Aula> findByEdificioAndTieneProyectorTrue(String edificio);

	public abstract List<Aula> findByEdificioAndEsLaboratorioFalse(String edificio);

	public abstract List<Aula> findByEdificioAndTieneProyectorFalse(String edificio);

	public abstract List<Aula> findByEdificioAndCapacidadGreaterThanEqual(String edificio, int capacidad);

	public abstract List<Aula> findByEdificioAndCapacidadLessThanEqual(String edificio, int capacidad);
	
	public abstract List<Aula> findByEsLaboratorioTrueAndCapacidadGreaterThanEqual(int capacidad);

	public abstract List<Aula> findByTieneProyectorTrueAndCapacidadLessThanEqual(int capacidad);

	public abstract List<Aula> findByTieneProyectorFalseAndCapacidadLessThanEqual(int capacidad);

	public abstract List<Aula> findByEdificioAndEsLaboratorioTrueAndCapacidadGreaterThanEqual(String edificio, int capacidad);

	public abstract List<Aula> findByEdificioAndTieneProyectorTrueAndCapacidadLessThanEqual(String edificio, int capacidad);

	public abstract List<Aula> findByEdificioAndTieneProyectorFalseAndCapacidadLessThanEqual(String edificio, int capacidad);
}
