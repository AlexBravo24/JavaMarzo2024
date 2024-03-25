package com;

public class Procesador {

	private String marca;
	private String modelo;
	private double frecuencia;
	
	public Procesador () {}
	
	public Procesador(String marca, String string, double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = string;
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getModelo() {
		return modelo;
	}

	public void setModelo(double modelo) {
		this.modelo = modelo;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", frecuencia=" + frecuencia + "]";
	}

	
	
	
	
	
	
	
}
