package com;

public class Camara {
 
	private String marca;
	private double tamañoLente;
	private double megapixeles;
	public Camara() {}
	public Camara(String marca, double tamañoLente, double megapixeles) {
		super();
		this.marca = marca;
		this.tamañoLente = tamañoLente;
		this.megapixeles = megapixeles;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamañoLente() {
		return tamañoLente;
	}
	public void setTamañoLente(double tamañoLente) {
		this.tamañoLente = tamañoLente;
	}
	public double getMegapixeles() {
		return megapixeles;
	}
	public void setMegapixeles(double megapixeles) {
		this.megapixeles = megapixeles;
	}
	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", tamañoLente=" + tamañoLente + ", megapixeles=" + megapixeles + "]";
	}
	
}
