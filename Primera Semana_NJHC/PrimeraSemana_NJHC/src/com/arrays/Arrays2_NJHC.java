

package com.arrays;

public class Arrays2_NJHC {

	public static void main(String[] args) {
		/*
		 * Crea un array de números de 100 posiciones, que contendrá los números del
		 *  1 al 100. Obtén la suma de todos ellos y la media.
		 */
		int [] numeros = new int [100];
		double suma = 0;
		double media = 0;
		System.out.println("Array 1-100, suma, media.");
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = i + 1;
//			System.out.println(numeros[i]);
			suma = suma + numeros[i];
		}
		media = suma/100;
		System.out.printf("\n100! = " + "%.0f",suma);
		System.out.printf("\nMedia = " + media);

		
		
	}// cierre del metodo main
}// cierre de la clase Arrays
