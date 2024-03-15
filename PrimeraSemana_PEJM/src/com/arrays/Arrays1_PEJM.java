package com.arrays;

import java.util.Scanner;

public class Arrays1_PEJM {

	public static void main(String[] args) {
		//Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
   int vector [] = new int [10];
   int numero;
	
	Scanner mult = new Scanner (System.in);
	
		   for (int i = 0; i < vector.length; i++) {
			System.out.println("ingrese un numero: ");
			numero= mult.nextInt();		
			System.out.println("estamos en la posicion: "+i+
			" del vector y el numero: "+numero+ " fue guardado correctamente");
		}
		   
	}

}
