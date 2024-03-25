package com;

public class Teclado {

	private String porcentaje;
	private String marca;
	private String color;
	private double precio;
	
	public Teclado () {
		
	}

	public Teclado(String porcentaje, String marca, String color, double precio) {
		super();
		this.porcentaje = porcentaje;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	
	public String getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getcolor() {
		return color;
	}

	public void setRGB(String color) {
		color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Teclado [porcentaje=" + porcentaje + ", marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
