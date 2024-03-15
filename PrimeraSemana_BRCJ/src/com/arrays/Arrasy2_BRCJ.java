package com.arrays;

public class Arrasy2_BRCJ {

	public static void main(String[] args) {
		
		//2.- Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
		
		int media, suma = 0;
        int [] numeros = new int[100];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i+1;
            System.out.println(numeros[i]);
            suma += i+1;
        }
        media = suma / numeros.length;
        System.out.println("La suma de los números es: "+suma);
        System.out.println("La media de los números es: "+media);

	}

}
