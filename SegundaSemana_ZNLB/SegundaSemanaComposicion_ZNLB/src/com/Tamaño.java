package com;

public class Tamaño {


	private double alto;
	private double ancho;
	private double largo;
	
	public Tamaño () {}

	public Tamaño(double alto, double ancho, double largo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Tamaño [alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + "]";
	}
	
	
	
}
