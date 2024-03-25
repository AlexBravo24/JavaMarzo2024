package com;

public class NintendoSwitch {

	

	private String modelo;
	private String color;
	
	private Tama�o tama�o;
	private SalidaAudio salidaAudio;
	private double ConsumoEnergia;
	
	public NintendoSwitch () {}

	
	
	public NintendoSwitch(String modelo, String color, Tama�o tama�o, SalidaAudio salidaAudio, double consumoEnergia) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.tama�o = tama�o;
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

	public Tama�o getTama�o() {
		return tama�o;
	}

	public void setTama�o(Tama�o tama�o) {
		this.tama�o = tama�o;
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
		return "NintendoSwitch [modelo=" + modelo + ", color=" + color + ", tama�o=" + tama�o + ", salidaAudio="
				+ salidaAudio + ", ConsumoEnergia=" + ConsumoEnergia + "]";
	}

	
	
	
	
	
	
	
}
