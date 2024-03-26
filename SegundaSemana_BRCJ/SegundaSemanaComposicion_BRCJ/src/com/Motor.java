package com;

public class Motor {

	private String version;
	private int potencia;
	private String tipoCaja;
	private double cilindraje;
	private String combustible;

	public Motor() {

	}

	public Motor(String version, int potencia, String tipoCaja, double cilindraje, String combustible) {
		super();
		this.version = version;
		this.potencia = potencia;
		this.tipoCaja = tipoCaja;
		this.cilindraje = cilindraje;
		this.combustible = combustible;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getTipoCaja() {
		return tipoCaja;
	}

	public void setTipoCaja(String tipoCaja) {
		this.tipoCaja = tipoCaja;
	}

	public double getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor [version=" + version + ", potencia=" + potencia + ", tipoCaja=" + tipoCaja + ", cilindraje="
				+ cilindraje + ", combustible=" + combustible + "]";
	}

}