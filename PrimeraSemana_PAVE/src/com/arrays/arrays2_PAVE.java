package com.arrays;

public class arrays2_PAVE {

	public static void main(String[] args) {
		
		int numeros [] = new int[100];
		int suma = 0, media = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (i+1);
		}
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		
		media = suma / numeros.length;
		
		System.out.println("SUMA: "+suma);
		System.out.println("MEDIA: "+media);
	}

}
