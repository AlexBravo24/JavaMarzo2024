package com;

public class Copa {
	private String nombre;
	private String fase;
	private String Rival;
	private int titulos;
	public Copa() {
		super();
	}
	public Copa(String nombre, String fase, String rival, int titulos) {
		super();
		this.nombre = nombre;
		this.fase = fase;
		Rival = rival;
		this.titulos = titulos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public String getRival() {
		return Rival;
	}
	public void setRival(String rival) {
		Rival = rival;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	@Override
	public String toString() {
		return "Copa [nombre=" + nombre + ", fase=" + fase + ", Rival=" + Rival + ", titulos=" + titulos + "]";
	}
	
	
}
