package com;

public class Tenis {

	private String marca;
	private String modelo;
	private String color;
	private int numero;
	private double precio;

	public Tenis() {

	}

	public Tenis(String marca, String modelo, String color, int numero, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numero = numero;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tenis [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numero=" + numero + ", precio="
				+ precio + "]";
	}

}