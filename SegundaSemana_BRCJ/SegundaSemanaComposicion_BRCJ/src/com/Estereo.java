package com;

public class Estereo {

	private String marca;
	private String modelo;
	private int tama�o;
	private String conectividad;
	private String caracteristicaPrincipal;

	public Estereo() {

	}

	public Estereo(String marca, String modelo, int tama�o, String conectividad, String caracteristicaPrincipal) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tama�o = tama�o;
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "Estereo [marca=" + marca + ", modelo=" + modelo + ", tama�o=" + tama�o + ", conectividad="
				+ conectividad + ", caracteristicaPrincipal=" + caracteristicaPrincipal + "]";
	}

}