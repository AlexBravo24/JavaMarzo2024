package com;

public class Juguete {
	private String tipo;
	private String modelo;
	private String marca;
	private String estado;
	
	public Juguete() {};	//Constructor vacío
	
	public Juguete(String tipo, String modelo, String marca, String estado) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.marca = marca;
		this.estado = estado;		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Juguete [tipo = " + tipo + ", modelo = " 
				+ modelo + ", marca = " + marca 
				+ ", estado = " + estado + "]";
	}
	
	

}

