package com;

import java.util.Scanner;

public class Pal�ndromo {
	public static void main (String[] args) {
		Scanner scanner=new Scanner (System.in);	
		System.out.println("Escriba una palabra");
		String cadena = scanner.nextLine().toLowerCase();
		String cadenaInvertida = "";
		for (int i = cadena.length() - 1; i >=0; i--) {
			cadenaInvertida+= cadena.charAt(i);
			System.out.println(cadenaInvertida);
		}
		
		System.out.println(cadenaInvertida);
		if (cadena.equals(cadenaInvertida)) {
			System.out.println("Es un pal�ndromo");
		} else {
			System.out.println("No es un pal�ndromo");
		}
	}
}
	
	
	
	
	
	
	


	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

