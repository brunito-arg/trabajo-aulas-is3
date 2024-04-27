package models;

import java.time.LocalTime;

import entities.Aula;

public class Materia {
	private String nombre;
	private int year;
	private Aula aula;
	private String dia;
	private LocalTime horario;
	
	public Materia() {}

	public Materia(String nombre, int year, Aula aula, String dia, LocalTime horario) {
		this.nombre = nombre;
		this.year = year;
		this.aula = aula;
		this.dia = dia;
		this.horario = horario;
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
	
	
}
