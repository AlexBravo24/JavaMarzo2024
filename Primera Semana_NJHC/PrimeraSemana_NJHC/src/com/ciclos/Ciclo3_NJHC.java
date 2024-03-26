package com.ciclos;

import java.util.Scanner;

public class Ciclo3_NJHC {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		Scanner leer = new Scanner (System.in); 

        System.out.print("Ingrese una cadena: ");
        String cadena = leer.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La cadena \"" + cadena + "\" es un palíndromo.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" no es un palíndromo.");
        }

    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;

    }// cierre del metodo main

   
}// cierre de la clase Ciclos
