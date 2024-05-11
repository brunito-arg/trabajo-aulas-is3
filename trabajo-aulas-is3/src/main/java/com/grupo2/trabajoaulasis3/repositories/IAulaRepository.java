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
	
	
}
