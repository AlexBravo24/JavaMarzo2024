package com.condicionales;

import java.util.Scanner;

public class Condicionales7_PEJM {

	public static void main(String[] args) {
		//Realiza un programa que pida por teclado el resultado (dato entero)
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
//		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
//		mostrará el mensaje: “ERROR: número incorrecto”.

int numero;
		
		Scanner numeros = new Scanner (System.in);
		System.out.println("introduce el numero del dado: ");
		numero= numeros.nextInt();
		switch (numero) {
		case 1:
			System.out.println("uno-seis");
			break;
		case 2:
			System.out.println("dos-cinco");
			break;
		case 3:
			System.out.println("tres-cuatro");
			break;
		case 4:
			System.out.println("cuatro-tres");
			break;
		case 5:
			System.out.println("cinco-dos");
			break;
		case 6:
			System.out.println("seis-uno");
			break;
		default:
			System.out.println("INGRESE UN NUMERO ENTRE EL 1 Y EL 6");
			break;
		}
	}

}
