package com;

public class Asientos {

	private String material;
	private String color;
	private String estado;
	
	public Asientos() {}
	public Asientos(String material, String color, String estado) {
		this.material = material;
		this.color = color;
		this.estado = estado;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Asientos [material = " + material + ", color = " + color + ", estado = " + estado + "]";
	}
	
	
}
