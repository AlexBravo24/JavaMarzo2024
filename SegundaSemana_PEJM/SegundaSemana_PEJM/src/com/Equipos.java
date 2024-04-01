package com;

public class Equipos {
	
private String nombre;
private int titulos;
private String pais;
private static final int temporada=2024;// se genera para mantener predeterminado un
//valor de la variable , que afecta y es igual para todos los objetos que creen

//esta forma de proteccion con encapsulamiento sirve para asignar un valor general
//para todos los objetos que se creen pero este aun se puede modificar desde la clase
//principal con el comando Equipos.setTemporada(2022);
//private static  int temporada=2024;
public Equipos() {
	super();
}


public Equipos(String nombre) {
	super();
	this.nombre = nombre;
}


public Equipos(String nombre, int titulos, String pais) {
	super();
	this.nombre = nombre;
	this.titulos = titulos;
	this.pais = pais;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getTitulos() {
	return titulos;
}


public void setTitulos(int titulos) {
	this.titulos = titulos;
}


public String getPais() {
	return pais;
}


public void setPais(String pais) {
	this.pais = pais;
}


public static int getTemporada() {
	return temporada;
}




@Override
public String toString() {
	return "Equipos [nombre=" + nombre + ", titulos=" + titulos + ", pais=" + pais +" + temporada= "+ temporada+"]";
}





   

}
