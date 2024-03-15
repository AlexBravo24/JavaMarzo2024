package com.arrays;

public class arrays5_PAVE {

	public static void main(String[] args) {
		String productos [] = {"Coquita","Valentones","Maruchan","Salsa Valentina","Galletas"};
		int precio [] = {20,50,20,35,18};
		
		System.out.println("/********** Tienda de la Señorita Tutsi :3 **********/ \n");
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Producto: "+productos[i]);
			System.out.println("Precio: "+precio[i]);
			System.out.println("--------------------------");
		}

	}

}
