package com.arrays;

public class Arrays5_JRGG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos

		// Arrays para nombres de productos y precios
		String[] productos = { "Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5" };
		double[] precios = { 10.99, 20.49, 15.75, 8.99, 12.50 };

		// Mostrar la lista de productos y sus precios
		System.out.println("Lista de Productos y Precios:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i] + ": $" + precios[i]);
		}

	}

}
