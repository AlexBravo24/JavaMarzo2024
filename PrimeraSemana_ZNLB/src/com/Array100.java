package com; 

public class Array100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numeros = new int [100];
		
		for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
		
		int suma = 0;
		for (int num: numeros) {
			suma +=num;
		}
		
		double media= (double) suma/numeros.length;
		
		System.out.println("La suma de todos los numeros es" + suma);
		System.out.println("La media de todos los numeros es" + media);
		
		
	}

}
