package com;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros;
		
		int [] numeros2 = new int [5];
		numeros2 [0] = 101;
		numeros2 [1] = 102;
		numeros2 [2] = 103;
		numeros2 [3] = 104;
		numeros2 [4] = 105;
		
		System.out.println(numeros2[4]);
		
		int [] numeros3 = {101,102,103,104,105,106};
		
		
		char [] letras = {'A', 'L'};
		
		String [] nombres = {"Nadia", "Sebastian", "Brandon"};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(i + ".- "+ nombres[i]);
		}

}
}
