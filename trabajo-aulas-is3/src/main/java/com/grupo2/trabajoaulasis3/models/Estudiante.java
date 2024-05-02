package com.grupo2.trabajoaulasis3.models;

import java.util.List;

import com.grupo2.trabajoaulasis3.entities.Materia;

public class Estudiante {
	private String nombre;
	private int year;
	private List<Materia> materias;

	public Estudiante() {}

	public Estudiante(String nombre, int year) {
		this.nombre = nombre;
		this.year = year;
	}

	public String getNombre() {
		return nombre;
	}

	public int getYear() {
		return year;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	
	
}
