package com;

public class perro {
	
	private String nombre;
	private String raza;
	private int edad;
	
	public perro() {
		
	}
	
	public perro(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}
	
}
