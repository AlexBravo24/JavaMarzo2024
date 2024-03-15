package com.arrays;

public class arrays4_PAVE {
	
	public static void main(String [] args) {
		int [] arr1 = {1,2,3,4,5};
		int arr2 [] = new int[arr1.length];
		
		for (int i = (arr1.length-1),j = 0; i >= 0 ; i--,j++) {
			arr2[j] = arr1[i]; 
		}
		
		System.out.print("ARREGLO 1: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+"-");
		}
		System.out.println();
		
		System.out.print("ARREGLO 2: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"-");
		}
	}
}
