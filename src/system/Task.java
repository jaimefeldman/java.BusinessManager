package system;

import cronometro.Cronometro;

public class Task {
	
	public enum estados {CORRIENDO, DENTENIDO, DURMIENDO};
	
	private String 		nombre;
	private Cronometro  tiempoVida;
	private estados		estado;
	
	public Task(String nombre) {
		this.nombre = nombre;
		this.tiempoVida.start();
	}

	public estados getEstado() {
		return this.estado;
	}
	
	public void setEstado(estados nuevoEstado) {
		this.estado  = nuevoEstado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
}
