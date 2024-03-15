package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays3_PEJM {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres
		
		Scanner tamaño = new Scanner(System.in);
		System.out.println("por favor ingrese la cadena");
		String texto=tamaño.nextLine();
		String [] vector = texto.split(" ");
		System.out.println(Arrays.asList(vector));
	}

}
