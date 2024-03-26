package com.condicionales;

import java.util.Scanner;
/*
public class Condicionales4_NJHC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		
		Scanner leer = new Scanner (System.in);

	        System.out.print("Ingrese una cadena: ");
	        String cadena = leer.nextLine();

	        boolean contieneMayusculas = false;

	        for (int i = 0; i < cadena.length(); i++) { // Devuelve la longitud de esta cadena. La longitud es igual al número de unidades de código Unicode en la cadena.
	            char caracter = cadena.charAt(i);// Devuelve el valor del carácter en el índice especificado. Un índice oscila entre 0 y el valor length() de la secuencia está en el índice 0, el siguiente en el índice 1, y así sucesivamente, como para la indexación de matrices. Si el valor de carácter especificado por el índice es un sustituto, se devuelve el valor sustituto. Especificado por: 1. El primer carácter
	            if (Character.isUpperCase(caracter)) {
	                contieneMayusculas = true;
	                break;
	            }
	        }

	        if (contieneMayusculas) {
	            System.out.println("La cadena contiene letras mayúsculas.");
	        } else {
	            System.out.println("La cadena no contiene letras mayúsculas.");
	        }
	       

	}// cierre del metodo main

}// cierre de la clase condicionales3
*/

//version 2

public class Condicionales4_NJHC {
    public static void main(String[] args) {
    	Scanner leer = new Scanner (System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = leer.nextLine();

        int contadorMayusculas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'A' && caracter <= 'Z') {
                contadorMayusculas++;
            }
        }

        if (contadorMayusculas > 0) {
            System.out.println("La cadena " + cadena + " contiene " + contadorMayusculas + " letras mayúsculas.");
        } else {
            System.out.println("La cadena " + cadena + " no contiene letras mayúsculas.");
        }
    }// cierre del metodo main

}// cierre de la clase condicionales3