package entities;

public class Estudiante {
	private int id;
	private String nombre;
	private int year;
	
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

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", year=" + year + "]";
	}
	
	
	
}
