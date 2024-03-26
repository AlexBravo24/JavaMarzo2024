package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// vamos a aprender a introducir valores por teclado
		//haciendo uso de la clase Scanner
		
		//Ejemplo, creamos una variable de tipo entero
		//para almacenar la edad de una persona
		int edad;
		
	     //Declarar un objto de la clase Scanner para almacenarrnar
		// o asignar los valores por teclado
		Scanner entrada = new Scanner (System.in);
		
		//podemos enviar una impresion en consola que indique
		//que se esta solicitando
		System.out.println("Introduce tu edad:");
		edad = entrada.nextInt();
		
		//podemos seguir utilizando el mismo objeto Scanner
		//y guardar mas variables
		System.out.println("Introduce tu estatura: ");
		double altura = entrada.nextDouble();
		
		//Finalmente haceo uso de los valores almacenados
		System.out.println("Tienes " + edad + "años. " + " Y mides:" + altura + "metros");
		
		
	}

}
