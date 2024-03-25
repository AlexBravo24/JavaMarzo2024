package com;

public class Perro {

	
	private String raza;
	private String color;
	private String vacunado;
	private double precio;
	
	public Perro () {
		
	}

	public Perro(String raza, String color, String vacunado, double precio) {
		super();
		this.raza = raza;
		this.color = color;
		this.vacunado = vacunado;
		this.precio = precio;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVacunado() {
		return vacunado;
	}

	public void setVacunado(String vacunado) {
		this.vacunado = vacunado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", vacunado=" + vacunado + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
