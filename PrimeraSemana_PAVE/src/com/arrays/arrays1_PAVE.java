package com.arrays;

import java.util.Scanner;

public class arrays1_PAVE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingresa el número "+(i+1)+" :");
			numeros[i] = read.nextInt();
		}
		
		System.out.println("Valores con su respectivo índice");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("["+i+"] => "+numeros[i]);
		}
	}

}
