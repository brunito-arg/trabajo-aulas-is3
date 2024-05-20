package com.grupo2.trabajoaulasis3.entities;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private int year;
	
	private String dia;
	
	private LocalTime horario;
	
	private boolean necesitaLaboratorio;
	
	@ManyToOne
	private Aula aula;
	
	@OneToOne
	private Docente docente;
	
	@ManyToMany
	@JoinTable(name = "materia_estudiante",
		joinColumns = @JoinColumn(name = "materia_id"),
		inverseJoinColumns = @JoinColumn(name = "estudiante_id")
			)
	private List<Estudiante> estudiantes;
	
	public Materia() {}

	public Materia(int id, String nombre, int year, String dia, LocalTime horario, boolean necesitaLaboratorio, Aula aula, Docente docente) {
		this.id = id;
		this.nombre = nombre;
		this.year = year;
		this.dia = dia;
		this.horario = horario;
		this.necesitaLaboratorio = necesitaLaboratorio;
		this.aula = aula;
		this.docente = docente;
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

	public Aula getAula() {
		return aula;
	}

	public String getDia() {
		return dia;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public boolean isNecesitaLaboratorio() {
		return necesitaLaboratorio;
	}
	
	public Docente getDocente() {
		return docente;
	}
	
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
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

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public void setNecesitaLaboratorio(boolean necesitaLaboratorio) {
		this.necesitaLaboratorio = necesitaLaboratorio;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", year=" + year + ", aula=" + aula + ", dia=" + dia
				+ ", horario=" + horario + "]";
	}

	

	

	
	
}
