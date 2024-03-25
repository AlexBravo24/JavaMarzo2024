package com;

public class Celular {
	
	private String marca;
	private String modelo;
	private String color;
	
	private Camara cam;
	private Procesador pu;
	private Ram ram;
	
	Celular(){
		
	}

	public Celular(String marca, String modelo, String color, Camara cam, Procesador pu, Ram ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cam = cam;
		this.pu = pu;
		this.ram = ram;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	public Procesador getPu() {
		return pu;
	}

	public void setPu(Procesador pu) {
		this.pu = pu;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cam=" + cam + ", pu=" + pu
				+ ", ram=" + ram + "]";
	}
	
	
	
}
