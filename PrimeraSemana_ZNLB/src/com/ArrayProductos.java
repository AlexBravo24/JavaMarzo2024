package com;

public class ArrayProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String[] productos = {"Producto A", "Producto B", "Producto C", "Producto D", "Producto E"};
		        
		        double[] precios = {12.99, 28.50, 17.75, 33.25, 19.99};
		    
		        System.out.println("Lista de productos y precios:");
		        for (int i = 0; i < productos.length; i++) {
		            System.out.println(productos[i] + ": $" + precios[i]);
		        }
		    
		}	
	}
