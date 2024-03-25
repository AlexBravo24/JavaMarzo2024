package com;

public class Botas extends Calzado {

	private String tipo;
	private String modelo;
	private String tipoSuela;
	private int numero;

	public Botas() {

	}

	public Botas(String tienda, String marca, String color, String tipo, String modelo, String tipoSuela, int numero) {
		super(tienda, marca, color);
		this.tipo = tipo;
		this.modelo = modelo;
		this.tipoSuela = tipoSuela;
		this.numero = numero;
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

	public String getTipoSuela() {
		return tipoSuela;
	}

	public void setTipoSuela(String tipoSuela) {
		this.tipoSuela = tipoSuela;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Botas [tipo=" + tipo + ", modelo=" + modelo + ", tipoSuela=" + tipoSuela + ", numero=" + numero
				+ ", toString()=" + super.toString() + "]";
	}

}