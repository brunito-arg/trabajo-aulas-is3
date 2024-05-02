package com.grupo2.trabajoaulasis3.models;

import java.time.LocalTime;
import com.grupo2.trabajoaulasis3.entities.Aula;
import com.grupo2.trabajoaulasis3.entities.Docente;

public class Materia {
	private String nombre;
	private int year;
	private Aula aula;
	private String dia;
	private LocalTime horario;
	private Docente docente;
	
	public Materia() {}

	public Materia(String nombre, int year, String dia, LocalTime horario, Aula aula, Docente docente) {
		this.nombre = nombre;
		this.year = year;
		this.dia = dia;
		this.horario = horario;
		this.aula = aula;
		this.docente = docente;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getYear() {
		return year;
	}

	public Aula getAula() {
		return aula;
	}

	public String getDia() {
		return dia;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	
}
