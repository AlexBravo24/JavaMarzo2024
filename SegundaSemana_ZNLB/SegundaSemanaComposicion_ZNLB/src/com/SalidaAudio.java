package com;

public class SalidaAudio	 {

	
	private double Calidad;
	private String Entrada;
	private double HD;
	
	public SalidaAudio () {}

	public SalidaAudio(double calidad, String entrada, double hD) {
		super();
		Calidad = calidad;
		Entrada = entrada;
		HD = hD;
	}

	public double getCalidad() {
		return Calidad;
	}

	public void setCalidad(double calidad) {
		Calidad = calidad;
	}

	public String getEntrada() {
		return Entrada;
	}

	public void setEntrada(String entrada) {
		Entrada = entrada;
	}

	public double getHD() {
		return HD;
	}

	public void setHD(double hD) {
		HD = hD;
	}

	@Override
	public String toString() {
		return "SalidaAudio [Calidad=" + Calidad + ", Entrada=" + Entrada + ", HD=" + HD + "]";
	}

	
	
}
