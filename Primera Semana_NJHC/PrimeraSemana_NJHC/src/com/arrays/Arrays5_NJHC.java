package com.arrays;

public class Arrays5_NJHC {

	public static void main(String[] args) {
		/*
		 * 
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus respectivos precios. 
		 * Muestra en consola la lista de productos y sus precios. Por lo menos 5 productos o artículos.
		 */
		String[] prod = {"Mango", "Cereal", "Manzana", "Pescado", "Carne"};
		String[] price = {"$17.79/pz", "$39.99/bx", "$15.49/kg", "$79.99/kg", "$110.997kg"};
		System.out.println("Programa que imprime 5 productos y su precio.");
		printPrice(prod, price);
	}
	
	static void printPrice(String [] product, String [] prices) {
		System.out.println("PRODUCTO:");
		for(int i = 0; i < product.length; i ++) {
			System.out.println(product[i] + "........" + prices[i]);
		}

		
		
		
	}// cierre del metodo main
}// cierre de la clase Arrays
