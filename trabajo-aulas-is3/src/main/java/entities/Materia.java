package entities;

import java.time.LocalTime;

public class Materia {
	private int id;
	private String nombre;
	private int year;
	private Aula aula;
	private String dia;
	private LocalTime horario;
	
	public Materia() {}

	public Materia(int id, String nombre, int year, Aula aula, String dia, LocalTime horario) {
		this.id = id;
		this.nombre = nombre;
		this.year = year;
		this.aula = aula;
		this.dia = dia;
		this.horario = horario;
	}
	
	
}
