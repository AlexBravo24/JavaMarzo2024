package com;

public class Calzado {

	private String tienda;
	private String marca;
	private String color;

	public Calzado() {

	}

	public Calzado(String tienda, String marca, String color) {
		super();
		this.tienda = tienda;
		this.marca = marca;
		this.color = color;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
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

	@Override
	public String toString() {
		return "Calzado [tienda=" + tienda + ", marca=" + marca + ", color=" + color + "]";
	}

}