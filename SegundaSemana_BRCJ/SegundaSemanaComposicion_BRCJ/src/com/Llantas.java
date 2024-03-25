package com;

public class Llantas {

	private String marca;
	private String modelo;
	private int numeroRin;
	private String medidas;

	public Llantas() {

	}

	public Llantas(String marca, String modelo, int numeroRin, String medidas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroRin = numeroRin;
		this.medidas = medidas;
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

	public int getNumeroRin() {
		return numeroRin;
	}

	public void setNumeroRin(int numeroRin) {
		this.numeroRin = numeroRin;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", modelo=" + modelo + ", numeroRin=" + numeroRin + ", medidas=" + medidas
				+ "]";
	}

}