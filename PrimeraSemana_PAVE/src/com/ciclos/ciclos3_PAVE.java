package com.ciclos;

import java.util.Scanner;

public class ciclos3_PAVE {
	
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		
		String word = "";
		String aux = "";
		String msg = "";
		
		System.out.println("Ingresa una palabra:");
		word = read.nextLine().toLowerCase().replace(" ", "").trim();
		
		for (int i = word.length()-1; i >= 0; i--) {
			aux += word.charAt(i);
		}
		
		System.out.println(word);
		System.out.println(aux);
		
		msg = (word.equals(aux)) ? "La palabra '"+word+"' es un PALINDROMO" : "La palabra '"+word+"' NO es un PALINDROMO";
		
		System.out.println(msg);
		
	}
}
