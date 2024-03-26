package com.condicionales;

import java.util.Scanner;

public class Condicionales5_NJHC {
 // Realiza un programa que calcule la aceptaci�n de una solicitud en base a los siguientes par�metros: edad, nota y sexo.
 //	* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
 //	* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
 //	* Otros casos -> NO ACEPTADA
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);

        System.out.print("Ingrese la nota: ");
        double nota = leer.nextDouble();

        System.out.print("Ingrese la edad: ");
        int edad = leer.nextInt();

        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = leer.next().charAt(0);

        if (nota >= 5 && edad >= 18 && (sexo == 'M' || sexo == 'F')) {
            if (sexo == 'M') {
                System.out.println("POSIBLE");
            } else{
                System.out.println("ACEPTADO");
            }
        } else {
            System.out.println("NO ACEPTADO");
        }

	}// cierre del metodo main

}// cierre de la clase condicionales5
