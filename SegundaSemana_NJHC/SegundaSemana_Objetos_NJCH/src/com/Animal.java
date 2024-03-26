package com;

public class Animal {

	private String especie;
	private String nombre;
	private int edad;
	private double peso;
	private String tipo;
	private String color;
	
	public Animal() {};	//Constructor vacio
	
	public Animal(String especie, String nombre, int edad, double peso, String tipo, String color) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.tipo = tipo;
		this.color = color;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [especie = " + especie + 
				", nombre = " + nombre + ", edad = " + edad + 
				", peso = " + peso + ", tipo = " + tipo +
				", color = " + color + "]";
	}
	
	
}