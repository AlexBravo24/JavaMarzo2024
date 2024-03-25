package com;

public class NintendoSwitch {

	

	private String modelo;
	private String color;
	
	private Tamaño tamaño;
	private SalidaAudio salidaAudio;
	private double ConsumoEnergia;
	
	public NintendoSwitch () {}

	
	
	public NintendoSwitch(String modelo, String color, Tamaño tamaño, SalidaAudio salidaAudio, double consumoEnergia) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.tamaño = tamaño;
		this.salidaAudio = salidaAudio;
		ConsumoEnergia = consumoEnergia;
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

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public SalidaAudio getSalidaAudio() {
		return salidaAudio;
	}

	public void setSalidaAudio(SalidaAudio salidaAudio) {
		this.salidaAudio = salidaAudio;
	}

	public double getConsumoEnergia() {
		return ConsumoEnergia;
	}

	public void setConsumoEnergia(double consumoEnergia) {
		ConsumoEnergia = consumoEnergia;
	}

	@Override
	public String toString() {
		return "NintendoSwitch [modelo=" + modelo + ", color=" + color + ", tamaño=" + tamaño + ", salidaAudio="
				+ salidaAudio + ", ConsumoEnergia=" + ConsumoEnergia + "]";
	}

	
	
	
	
	
	
	
}
