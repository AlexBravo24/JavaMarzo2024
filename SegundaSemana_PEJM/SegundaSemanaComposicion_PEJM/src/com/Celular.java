package com;

public class Celular {
private String modelo;
private String marca;
private String color;

private Camara cam;
private Procesador cpu;
private Ram memoria;

public Celular() {}

public Celular(String modelo, String marca, String color, Camara cam, Procesador cpu, Ram memoria) {
	super();
	this.modelo = modelo;
	this.marca = marca;
	this.color = color;
	this.cam = cam;
	this.cpu = cpu;
	this.memoria = memoria;
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

public Procesador getCpu() {
	return cpu;
}

public void setCpu(Procesador cpu) {
	this.cpu = cpu;
}

public Ram getMemoria() {
	return memoria;
}

public void setMemoria(Ram memoria) {
	this.memoria = memoria;
}

@Override
public String toString() {
	return "Celular [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", cam=" + cam + ", cpu=" + cpu
			+ ", memoria=" + memoria + "]";
}

}
