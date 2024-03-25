package com;

public class heroe {
	
	private String nombre;
	private String poder;
	private String genero;
	
	heroe(){
		
	}
	
	public heroe(String nombre, String poder, String genero) {
		super();
		this.nombre = nombre;
		this.poder = poder;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "heroe [nombre=" + nombre + ", poder=" + poder + ", genero=" + genero + "]";
	}
	
}
