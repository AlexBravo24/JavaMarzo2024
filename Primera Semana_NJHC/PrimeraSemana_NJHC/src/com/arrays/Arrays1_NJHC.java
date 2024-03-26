package com.arrays;

import java.util.Scanner;

public class Arrays1_NJHC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = new int [10];
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Programa que recibe 10 numeros");
		for(int i = 0 ; i < numeros.length; i++) {
			System.out.println("Ingrese el valor " + (i+1));
			numeros[i] = leer.nextInt();
		}
		
		System.out.println("El array que ingresó es: ");
		
		for(int i = 0 ; i < numeros.length; i++) {
			System.out.println("num["+ i +"]: " + numeros[i]);
//			if(i<numeros.length - 1) {
//				System.out.print(", ");
//			}
//			if(i == 4) {
//				System.out.println("");
//			}
		}

	}// cierre del metodo main

	   
}// cierre de la clase Arrays