package com;

public class Computadoras {

	private String marca;
	private String modelo;
	private String color;
	private int almacenamiento;
	private int ram;
	private double precio;

	public Computadoras() {

	}

	public Computadoras(String marca, String modelo, String color, int almacenamiento, int ram, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.almacenamiento = almacenamiento;
		this.ram = ram;
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

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Computadoras [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", almacenamiento="
				+ almacenamiento + ", ram=" + ram + ", precio=" + precio + "]";
	}

}