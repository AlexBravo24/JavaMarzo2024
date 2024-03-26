package com;

public class Estereo {

	private String marca;
	private String modelo;
	private int tamaño;
	private String conectividad;
	private String caracteristicaPrincipal;

	public Estereo() {

	}

	public Estereo(String marca, String modelo, int tamaño, String conectividad, String caracteristicaPrincipal) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.conectividad = conectividad;
		this.caracteristicaPrincipal = caracteristicaPrincipal;
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

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public String getCaracteristicaPrincipal() {
		return caracteristicaPrincipal;
	}

	public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
		this.caracteristicaPrincipal = caracteristicaPrincipal;
	}

	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño + ", conectividad="
				+ conectividad + ", caracteristicaPrincipal=" + caracteristicaPrincipal + "]";
	}

}