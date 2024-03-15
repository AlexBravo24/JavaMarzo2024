package com.ciclos;

import java.util.Scanner;

public class Ciclos3_BRCJ {

	public static void main(String[] args) {
		// 3.- Realiza un programa para determinar si un String es palíndromo

		Scanner entrada = new Scanner(System.in);

		String palabra = "";
		String aux = "";

		System.out.println("Ingresa una palabra:");
		palabra = entrada.nextLine();

		for (int i = palabra.length() - 1; i >= 0; i--) {
			aux += palabra.charAt(i);
		}

		System.out.println(palabra);
		System.out.println(aux);

		if (palabra.equals(aux)) {
			System.out.println("La palabra " + palabra + ": es un PALINDROMO");
		} else {
			System.out.println("La palabra " + palabra + ": NO es un PALINDROMO");
		}

	}

}
