package com.arrays;

import java.util.Scanner;

public class arrays1_PAVE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa el n�mero "+(i+1)+" :");
			numeros[i] = read.nextInt();
		}
		
		System.out.println("Valores con su respectivo �ndice");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("["+i+"] => "+numeros[i]);
		}
	}

}
