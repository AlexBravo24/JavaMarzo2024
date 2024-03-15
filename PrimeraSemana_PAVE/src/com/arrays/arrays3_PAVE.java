package com.arrays;

import java.util.Scanner;

public class arrays3_PAVE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String frase = "";
		char caracteres [];

		System.out.println("Ingresa una frase: ");
		frase = read.nextLine();
		
		caracteres = new char[frase.length()];
		
		for (int i = frase.length()-1; i >= 0; i--) {
			 caracteres[i] = frase.charAt(i);
		}
		
		System.out.println("FRASE: "+frase);
		System.out.println("Frase en pedacitos");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.print(caracteres[i]+"-");
		}
	}

}
