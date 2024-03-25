package com;

public abstract class Escuela extends Persona{

	private String Escuela;
	private String Estado;
	private String Calle;
	
	public Escuela(String nombre, String genero, int edad, String escuela, String estado, String calle) {
		super(nombre, genero, edad);
		Escuela = escuela;
		Estado = estado;
		Calle = calle;
	}

	public String getEscuela() {
		return Escuela;
	}

	public void setEscuela(String escuela) {
		Escuela = escuela;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getCalle() {
		return Calle;
	}

	public void setCalle(String calle) {
		Calle = calle;
	}

	@Override
	public String toString() {
		return "Escuela [Escuela=" + Escuela + ", Estado=" + Estado + ", Calle=" + Calle + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
}
