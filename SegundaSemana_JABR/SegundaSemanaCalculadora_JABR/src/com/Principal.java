package com;

public class Principal {

	public static void main(String[] args) {
	
		Cientifica casio = new Cientifica();
		
		casio.dividir(6, 3);
		
		casio.tomarTemperatura();
		
		//¿De donde toman comportamientos nuestras clases
		//objetos?
		//1.- De métodos propios
		//2.- De otras clases heredandolos, incluyendo clases
		//abstractas
		//3.- De interfaces

	}

}
