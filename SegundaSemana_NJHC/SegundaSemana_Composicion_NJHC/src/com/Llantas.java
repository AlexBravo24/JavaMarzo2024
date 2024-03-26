package com;

public class Llantas {

	private String marca;
	private int medida;
	private double presion;
	private String estado;
	
	public Llantas() {}
	
	public Llantas(String marca, int medida, double presion, String estado) {
		this.marca = marca;
		this.medida = medida;
		this.presion = presion;
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Llantas [marca = " + marca + ", medida = " + medida + ", presion = " + presion + ", estado = " + estado + "]";
	}
	
	
	

}
