package com;

public abstract class Calculadora {
	private String modelo;
	private int a�o;
	
	public Calculadora() {}
	
	public Calculadora(String modelo, int a�o) {
		this.modelo = modelo;
		this.a�o = a�o;	
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Calculadora [modelo=" + modelo + ", a�o=" + a�o + "]";
	}
	
	public abstract void suma(double num_a,double num_b);
	public abstract void resta(double num_a, double num_b);
	public abstract void multiplicacion(double num_a, double num_b);
	public abstract void division(double num_a, double num_b);

	


}
