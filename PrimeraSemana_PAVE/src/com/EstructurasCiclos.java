package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		int x = 0;
		
		System.out.println("Estructura Ciclica WHILE");
		while(x<10) {
			System.out.println("Vuelta "+(x+1));
			x++;
		}
		
		x = 0;
		System.out.println("Estructura Ciclica DO-WHILE");
		do {
			System.out.println("Vuelta "+(x+1));
			x++;
		} while (x<10);
		
		System.out.println("Estructura FOR");
		for (int i = 0; i < 10; i++) {
			System.out.println("Vuelta "+(i+1));
		}

	}

}
