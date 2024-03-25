package com;

public class Ram {
	private String marca;
	private String tipo;
	private double size;
	
	Ram(){
		
	}

	public Ram(String marca, String tipo, double size) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.size = size;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", tipo=" + tipo + ", size=" + size + "]";
	}
	
	
}
