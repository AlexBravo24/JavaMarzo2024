package com.ciclos;

import java.util.Scanner;

public class Ciclos2_JRGG {
	public static void main(String []args) {
		
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		Scanner numero = new Scanner (System.in);
		System.out.println("introduce el numero de la tabla a multiplicar");
		int multiplicando = numero.nextInt();
		System.out.println("introduce el numero hasta la iteracion deseada");
		int multiplicador = numero.nextInt();
		for (int i = 0; i <= multiplicador; i++) {
			System.out.println(multiplicando+"x"+i+"="+(multiplicando*i));
			
		}
	}
}
