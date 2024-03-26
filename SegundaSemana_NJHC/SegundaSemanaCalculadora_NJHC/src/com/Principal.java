package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica();
		
		casio.suma(3, 6);
		casio.resta(5, 10);
		casio.multiplicacion(5, 10);
		casio.division(3, 6);
		
		casio.tomarTemperatura();
		
		//Pregunta
		//de donde toman comportamiento nuestras clases u objetos?
		/*
		 * 1.- De metodos propios
		 * 2.- De otras clases heredandolos, incluyendo clases abstractas 
		 * 3.- De interfaces
		 * 
		 */
	}

}
