package com;

public class Estereo {

	private String marca;
	private String modelo;
	private String estado;
	
	public Estereo() {}
	
	public Estereo(String marca, String modelo, String estado) {
		this.marca = marca;
		this.modelo = modelo;
		this.estado = estado;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Estereo [marca = " + marca + ", modelo = " + modelo + ", estado = " + estado + "]";
	}
	
	

}

