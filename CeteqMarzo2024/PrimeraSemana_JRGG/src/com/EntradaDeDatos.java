package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Vamos a aprender a introducir valores por teclado usando Scanner

		// Ejemplo, creamos una variable de tipo entero para almacenar la edadd de una
		// persona
		int edad;
		// decka��larar un objeto de la clase Scanner para almacenar o asignar los
		// valores por teclado

		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce tu edad");
		edad = entrada.nextInt();

		System.out.println("introduce tu estatura");
		double altura = entrada.nextDouble();

		System.out.println("TU EDAD ES " + edad + " a�os" + " Y TU ESTATURA ES DE " + altura + " METROS");

	}

}
