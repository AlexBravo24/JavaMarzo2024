package com;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] originalArray={1,2,3,4,5};
		
		int[] invertedArray = new int [originalArray.length];
		
		for (int i=0; i < originalArray.length; i++) {
			invertedArray[i] = originalArray[originalArray.length - 1];
		}
		
		System.out.println("El array invertido es: ");
		
		for (int i=0; i <invertedArray.length; i++) {
			System.out.println(invertedArray[i]);
			if (i < invertedArray.length - 1) {
				System.out.println(",");
			}
		}
		
		System.out.println("");
		
		
		
		
		
	}

}
