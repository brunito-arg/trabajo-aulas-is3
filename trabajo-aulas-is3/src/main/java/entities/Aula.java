package entities;

public class Aula {
	
	private int id;
	private String edificio;
	private int numero;
	private boolean esLaboratorio;
	private boolean tieneProyector;
	private int capacidad;
	
	public Aula() {}

	public Aula(int id, String edificio, int numero, boolean esLaboratorio, boolean tieneProyector, int capacidad) {
		this.id = id;
		this.edificio = edificio;
		this.numero = numero;
		this.esLaboratorio = esLaboratorio;
		this.tieneProyector = tieneProyector;
		this.capacidad = capacidad;
	}
	

	
}
