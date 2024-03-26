package com.ciclos;

import java.util.Scanner;

public class Ciclos2_NJHC {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
		//hasta la iteraci�n deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		
		Scanner leer = new Scanner (System.in); 

        System.out.print("Ingrese el n�mero para la tabla de multiplicar: ");
        float numero = leer.nextFloat();

        System.out.print("Ingrese el l�mite de la iteraci�n: ");
         float limite = leer.nextFloat();

        System.out.println("Tabla de multiplicar del " + numero + " hasta la iteraci�n " + limite + ":");

        for (float i = 1; i <= limite; i++) {
        	float resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
	}// cierre del metodo main

}// cierre de la clase Ciclos
