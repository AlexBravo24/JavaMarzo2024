package com.arrays;

public class Arrays2_JRGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2. Crea un array de números de 100 posiciones, que contendrá los números del 
//		1 al 100. Obtén la suma de todos ellos y la media.
		double total = 0;
		int[] numeros = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			total = total + numeros[i];
			System.out.println("posicion " + i + "-> " + numeros[i]);

		}
		System.out.println("LA SUMA DEL 1-100 ES " + total);
		System.out.println("la media es " + total / 100);

	}

}
