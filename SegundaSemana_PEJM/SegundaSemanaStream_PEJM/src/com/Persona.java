package com;

public class Persona {
 private String nombre;
 private String genero;
 private int Edad;
public Persona() {
	super();
}
public Persona(String nombre, String genero, int edad) {
	super();
	this.nombre = nombre;
	this.genero = genero;
	Edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}
@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", genero=" + genero + ", Edad=" + Edad + "]";
}
 
}
