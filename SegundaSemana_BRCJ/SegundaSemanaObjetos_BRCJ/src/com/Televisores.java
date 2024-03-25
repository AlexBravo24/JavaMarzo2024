package com;

public class Televisores {

	private String marca;
	private String modelo;
	private String tipo_pantalla;
	private int pulgadas;
	private double precio;

	public Televisores() {

	}

	public Televisores(String marca, String modelo, String tipo_pantalla, int pulgadas, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo_pantalla = tipo_pantalla;
		this.pulgadas = pulgadas;
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

	public String getTipo_pantalla() {
		return tipo_pantalla;
	}

	public void setTipo_pantalla(String tipo_pantalla) {
		this.tipo_pantalla = tipo_pantalla;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Televisores [marca=" + marca + ", modelo=" + modelo + ", tipo_pantalla=" + tipo_pantalla + ", pulgadas="
				+ pulgadas + ", precio=" + precio + "]";
	}

}