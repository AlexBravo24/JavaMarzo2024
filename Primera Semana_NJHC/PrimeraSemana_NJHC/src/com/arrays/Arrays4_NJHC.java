package com.arrays;

public class Arrays4_NJHC {

	public static void main(String[] args) {
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
		 * Guardar los valores de este array en otro array distinto pero con los valores invertidos, 
		 * es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.
		 */
		
		int [] num_a = {1,2,3,4,5};
		int [] num_b = new int[5];
		int help = 0;
		
		System.out.println("Programa de Array invertido.");
		
		for(int i = 4 ; i >= 0 ; i--) {
//			System.out.print("\nhelp: " + help);
			num_b[help] = num_a[i];
//			System.out.println("num_a: " + num_a[i]);
//			System.out.println("num_b: " + num_b[help]);
			help++;
		}
		System.out.print("\nArray normal: ");
		printArray(num_a);
		System.out.print("\nArray invertido: ");
		printArray(num_b);
		
	}
	
	static void printArray(int [] array) {
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}

	}// cierre del metodo main
}// cierre de la clase Arrays
