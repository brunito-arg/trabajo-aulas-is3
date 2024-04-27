package models;

public class Estudiante {
	private String nombre;
	private int year;
	
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
