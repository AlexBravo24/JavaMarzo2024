package com.condicionales;

import java.util.Scanner;
/*
public class Condicionales4_NJHC {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene letras may�sculas.
		
		Scanner leer = new Scanner (System.in);

	        System.out.print("Ingrese una cadena: ");
	        String cadena = leer.nextLine();

	        boolean contieneMayusculas = false;

	        for (int i = 0; i < cadena.length(); i++) { // Devuelve la longitud de esta cadena. La longitud es igual al n�mero de unidades de c�digo Unicode en la cadena.
	            char caracter = cadena.charAt(i);// Devuelve el valor del car�cter en el �ndice especificado. Un �ndice oscila entre 0 y el valor length() de la secuencia est� en el �ndice 0, el siguiente en el �ndice 1, y as� sucesivamente, como para la indexaci�n de matrices. Si el valor de car�cter especificado por el �ndice es un sustituto, se devuelve el valor sustituto. Especificado por: 1. El primer car�cter
	            if (Character.isUpperCase(caracter)) {
	                contieneMayusculas = true;
	                break;
	            }
	        }

	        if (contieneMayusculas) {
	            System.out.println("La cadena contiene letras may�sculas.");
	        } else {
	            System.out.println("La cadena no contiene letras may�sculas.");
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
            System.out.println("La cadena " + cadena + " contiene " + contadorMayusculas + " letras may�sculas.");
        } else {
            System.out.println("La cadena " + cadena + " no contiene letras may�sculas.");
        }
    }// cierre del metodo main

}// cierre de la clase condicionales3