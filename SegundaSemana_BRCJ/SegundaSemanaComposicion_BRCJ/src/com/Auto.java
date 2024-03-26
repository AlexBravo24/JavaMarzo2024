package com;

public class Auto {

	private String marca;
	private String modelo;
	private String color;
	private int capacidadPersonas;
	private String vestidura;

	private Motor motor;
	private Llantas ruedas;
	private Estereo radio;

	public Auto() {

	}

	public Auto(String marca, String modelo, String color, int capacidadPersonas, String vestidura, Motor motor,
			Llantas ruedas, Estereo radio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.capacidadPersonas = capacidadPersonas;
		this.vestidura = vestidura;
		this.motor = motor;
		this.ruedas = ruedas;
		this.radio = radio;
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

	public int getCapacidadPersonas() {
		return capacidadPersonas;
	}

	public void setCapacidadPersonas(int capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	public String getVestidura() {
		return vestidura;
	}

	public void setVestidura(String vestidura) {
		this.vestidura = vestidura;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Llantas getRuedas() {
		return ruedas;
	}

	public void setRuedas(Llantas ruedas) {
		this.ruedas = ruedas;
	}

	public Estereo getRadio() {
		return radio;
	}

	public void setRadio(Estereo radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", capacidadPersonas="
				+ capacidadPersonas + ", vestidura=" + vestidura + ", motor=" + motor + ", ruedas=" + ruedas
				+ ", radio=" + radio + "]";
	}

}