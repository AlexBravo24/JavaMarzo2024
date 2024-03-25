package com;

public class Camara {

	private String marca;
	private double sizelente;
	private double megapixeles;
	
	Camara(){
		
	}

	public Camara(String marca, double sizelente, double megapixeles) {
		super();
		this.marca = marca;
		this.sizelente = sizelente;
		this.megapixeles = megapixeles;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getSizelente() {
		return sizelente;
	}

	public void setSizelente(double sizelente) {
		this.sizelente = sizelente;
	}

	public double getMegapixeles() {
		return megapixeles;
	}

	public void setMegapixeles(double megapixeles) {
		this.megapixeles = megapixeles;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", sizelente=" + sizelente + ", megapixeles=" + megapixeles + "]";
	}
	
	
}
