package com.grupo2.trabajoaulasis3.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private int year;
	
	@ManyToMany(mappedBy = "estudiantes")
	private List<Materia> materias;
	
	public Estudiante() {}

	public Estudiante(int id, String nombre, int year) {
		this.id = id;
		this.nombre = nombre;
		this.year = year;
		
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", year=" + year + "]";
	}
	
	
	
}
