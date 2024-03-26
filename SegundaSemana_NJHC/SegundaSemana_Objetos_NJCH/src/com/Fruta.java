package com;

public class Fruta {

	private String name;
	private int cantidad;
	private double weight;
	private String estado;
	
	public Fruta() {}	//Constructor vacío
	
	public Fruta(String name, int cantidad, double weight, String estado) {
		super();
		this.name = name;
		this.cantidad = cantidad;
		this.weight = weight;
		this.estado = estado;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Fruta [name = " + name + ", cantidad = " + cantidad + ", weight = " + weight + ", estado = " + estado + "]";
	}
	
	

}
