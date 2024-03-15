package com;

import java.util.Scanner;

public class Array10Posiciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Ingresa 10 numeros");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.println("Indice/tvalor");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(i + "\t" + numeros[i]);
	        }
		
		
		
		 
		
		
		
		
		
		
		
		
	}

}
