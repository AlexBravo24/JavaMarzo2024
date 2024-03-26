package com;

public class Automovil {

	private String modelo;
	private int a�o;
	private String fabricante;
	private String placas;
	
	private Estereo estereo;
	private Llantas llantas;
	private Asientos asientos;
	
	public Automovil() {}
	
	public Automovil(String modelo, int a�o, String fabricante, String placas, Estereo estereo, Llantas llantas, Asientos asientos) {
		this.modelo = modelo;
		this.a�o = a�o;
		this.fabricante = fabricante;
		this.placas = placas;
		this.estereo = estereo;
		this.llantas = llantas;
		this.asientos = asientos;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}

	public Estereo getEstereo() {
		return estereo;
	}

	public void setEstereo(Estereo estereo) {
		this.estereo = estereo;
	}

	public Llantas getLlantas() {
		return llantas;
	}

	public void setLlantas(Llantas llantas) {
		this.llantas = llantas;
	}

	public Asientos getAsientos() {
		return asientos;
	}

	public void setAsientos(Asientos asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return "Automovil [modelo = " + modelo + ", a�o = " + a�o + ", fabricante = " + fabricante + ", placas = " + placas
				+ ", estereo = " + estereo + ", llantas = " + llantas + ", asientos = " + asientos + "]";
	}
	
	
}
