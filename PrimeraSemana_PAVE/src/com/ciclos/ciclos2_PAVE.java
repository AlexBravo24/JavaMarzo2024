package com.ciclos;

import java.util.Scanner;

public class ciclos2_PAVE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero = 0;
		int i = 0;
		System.out.println("Ingresa un número");
		numero = read.nextInt();
		System.out.println("Ingresa la iteración: ");
		i = read.nextInt();
		
		System.out.println("Tabla de multiplicar de "+numero);
		for (int j = 0; j <= i ; j++) {
			System.out.println(j+" X "+numero+" = "+(j*numero));
		}
	}

}
