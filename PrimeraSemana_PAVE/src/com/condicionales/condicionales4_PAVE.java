package com.condicionales;

import java.util.Scanner;

public class condicionales4_PAVE {

	public static void main(String[] args) { 
		
		String sentence = "";
		System.out.println("Digita una frase: ");
		sentence = new Scanner(System.in).nextLine();
		
		if(!sentence.equals(sentence.toLowerCase())) {
			System.out.println("Si tienen letras mayúsculas");
		}else {
			System.out.println("No tiene letras mayúsculas");
		}
	}

}
