package com;

import java.util.Scanner;

public class ArraydeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escriba una frase");
		String frase = scanner.nextLine();
		
		
		char[] caracteres = frase.toCharArray();
		
		System.out.println("Los caracteres de la frase son");
		for (char caracter : caracteres) {
			System.out.println(caracter + " ");
		}
		
		
		
		
		
		
		
		
	}
	

}
