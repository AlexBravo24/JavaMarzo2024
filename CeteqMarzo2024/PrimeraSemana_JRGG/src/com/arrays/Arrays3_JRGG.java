package com.arrays;

import java.util.Scanner;

public class Arrays3_JRGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//		caracteres.
		
		Scanner entrada = new Scanner (System.in);
		String frase = entrada.nextLine();
		char [] caracteres= new char[frase.length()];
		
	
		for (int i = 0; i < frase.length(); i++) {
			caracteres [i] = frase.charAt(i);
			
			
		}
        System.out.println("Los caracteres de la frase son:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i] + " ");
        }

	}

}
