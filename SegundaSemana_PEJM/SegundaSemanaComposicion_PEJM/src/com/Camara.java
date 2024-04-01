package com;

public class Camara {
 
	private String marca;
	private double tama�oLente;
	private double megapixeles;
	public Camara() {}
	public Camara(String marca, double tama�oLente, double megapixeles) {
		super();
		this.marca = marca;
		this.tama�oLente = tama�oLente;
		this.megapixeles = megapixeles;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTama�oLente() {
		return tama�oLente;
	}
	public void setTama�oLente(double tama�oLente) {
		this.tama�oLente = tama�oLente;
	}
	public double getMegapixeles() {
		return megapixeles;
	}
	public void setMegapixeles(double megapixeles) {
		this.megapixeles = megapixeles;
	}
	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", tama�oLente=" + tama�oLente + ", megapixeles=" + megapixeles + "]";
	}
	
}
