package com.grupo2.trabajoaulasis3.entities;

import jakarta.persistence.*;

@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	public Docente() {}

	public Docente(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Docente [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
