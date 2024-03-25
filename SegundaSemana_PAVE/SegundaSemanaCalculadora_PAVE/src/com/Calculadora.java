package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	private double precio;
	
	Calculadora(){
		
	}

	public Calculadora(String marca, String color, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	public abstract void sumar (int n1, int n2);
	
	public abstract void restar (int n1, int n2);
	
	public abstract void multiplicar (int n1, int n2);
	
	public abstract void dividir (int n1, int n2);
}
