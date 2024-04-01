package com;

public class Equipo {
 private String nombre;
 private String Pais;
 private int TitulosLocales ;
 

private Champions champions;
private Copa copa;

public Equipo() {
	super();
}

public Equipo(String nombre, String pais, int titulosLocales, Champions champions, Copa copa) {
	super();
	this.nombre = nombre;
	Pais = pais;
	TitulosLocales = titulosLocales;
	this.champions = champions;
	this.copa = copa;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getPais() {
	return Pais;
}

public void setPais(String pais) {
	Pais = pais;
}

public int getTitulosLocales() {
	return TitulosLocales;
}

public void setTitulosLocales(int titulosLocales) {
	TitulosLocales = titulosLocales;
}

public Champions getChampions() {
	return champions;
}

public void setChampions(Champions champions) {
	this.champions = champions;
}

public Copa getCopa() {
	return copa;
}

public void setCopa(Copa copa) {
	this.copa = copa;
}

@Override
public String toString() {
	return "Equipo [nombre=" + nombre + ", Pais=" + Pais + ", TitulosLocales=" + TitulosLocales + ", champions="
			+ champions + ", copa=" + copa + "]";
}
 
}
