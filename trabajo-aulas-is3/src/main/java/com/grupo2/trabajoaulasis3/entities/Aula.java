package com.grupo2.trabajoaulasis3.entities;

import jakarta.persistence.*;

@Entity
public class Aula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String edificio;
	private int numero;
	private boolean esLaboratorio;
	private boolean tieneProyector;
	private int capacidad;
	//
	public Aula() {}

	public Aula(int id, String edificio, int numero, boolean esLaboratorio, boolean tieneProyector, int capacidad) {
		this.id = id;
		this.edificio = edificio;
		this.numero = numero;
		this.esLaboratorio = esLaboratorio;
		this.tieneProyector = tieneProyector;
		this.capacidad = capacidad;
	}

	public int getId() {
		return id;
	}

	public String getEdificio() {
		return edificio;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isEsLaboratorio() {
		return esLaboratorio;
	}

	public boolean isTieneProyector() {
		return tieneProyector;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setEsLaboratorio(boolean esLaboratorio) {
		this.esLaboratorio = esLaboratorio;
	}

	public void setTieneProyector(boolean tieneProyector) {
		this.tieneProyector = tieneProyector;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", edificio=" + edificio + ", numero=" + numero + ", esLaboratorio=" + esLaboratorio
				+ ", tieneProyector=" + tieneProyector + ", capacidad=" + capacidad + "]";
	}
	

	
}
