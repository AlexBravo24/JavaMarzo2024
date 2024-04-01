package com;

public class Champions {
private String Temporada;
private String grupo;
private int Titulos;
public Champions() {
	super();
}
public Champions(String nombre, String grupo, int titulos) {
	super();
	this.Temporada = nombre;
	this.grupo = grupo;
	Titulos = titulos;
}
public String getNombre() {
	return Temporada;
}
public void setNombre(String nombre) {
	this.Temporada = nombre;
}
public String getGrupo() {
	return grupo;
}
public void setGrupo(String grupo) {
	this.grupo = grupo;
}
public int getTitulos() {
	return Titulos;
}
public void setTitulos(int titulos) {
	Titulos = titulos;
}
@Override
public String toString() {
	return "Champions [nombre=" + Temporada + ", grupo=" + grupo + ", Titulos=" + Titulos + "]";
}

}
