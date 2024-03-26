package com;

public abstract class Calculadora {
	private String modelo;
	private int año;
	
	public Calculadora() {}
	
	public Calculadora(String modelo, int año) {
		this.modelo = modelo;
		this.año = año;	
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Calculadora [modelo=" + modelo + ", año=" + año + "]";
	}
	
	public abstract void suma(double num_a,double num_b);
	public abstract void resta(double num_a, double num_b);
	public abstract void multiplicacion(double num_a, double num_b);
	public abstract void division(double num_a, double num_b);

	


}
