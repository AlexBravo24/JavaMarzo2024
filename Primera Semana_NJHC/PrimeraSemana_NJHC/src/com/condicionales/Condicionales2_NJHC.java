package com.condicionales;

import java.util.Scanner;

public class Condicionales2_NJHC {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		int numero;
		Scanner leer = new Scanner (System.in); 
		
		System.out.print("Ingrese un n�mero: " );
		numero = leer.nextInt();
	      
	    if (numero % 2 == 0) {
	                System.out.println("El numero " + numero + " es un n�mero par.");
	            } else {
	                System.out.println(numero + " es un n�mero impar.");
	            }       
	
	}// cierre del metodo main

}// cierre de la clase condicionales2
