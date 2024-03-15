package com.arrays;

import java.util.Scanner;

public class Arrays1_BRCJ {

	public static void main(String[] args) {

		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.

		Scanner entrada = new Scanner(System.in);

		int i;
		int[] numeros = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = entrada.nextInt();
		}

		for (int i1 = 0; i1 < numeros.length; i1++) {
			System.out.println("Indice: " + i1 + " Valor: " + numeros[i1]);
		}

	}

}
