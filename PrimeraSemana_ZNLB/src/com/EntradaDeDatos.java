package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Vamos a aprender a introducir valores por teclado
		//Hacienco uso de la clase Scanner
		
		//Ejemplo, creamos una variable de tipo entero
		//para almacenar la edad de una persona
		
		int edad;
		
		//Declarar un objeto de la clase Scanner para almacernas
		//o asignar los valores por teclado
		
		Scanner entrada = new Scanner (System.in);
		
		//Podemos enviar una impresión en consola que indique
		//que se esta solicitando
		System.out.println("Introduce tu edad:");
		edad = entrada.nextInt();

		
		System.out.println("Introduce tu estatura:");
		double altura = entrada.nextDouble();
		
		//Finalmente hacemos uso de los valores almacenados
		System.out.println("Tienes" + edad + " años " + "Y mides:" + altura + "metros");
		
	}

}
