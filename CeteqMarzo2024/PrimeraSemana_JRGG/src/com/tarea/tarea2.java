package com.tarea;

import java.util.*;

public class tarea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		.Realiza un programa que pida un n�mero por teclado y nos indique si es par 
//		o impar.

		Scanner entrada = new Scanner(System.in);
		System.out.println("INGRESE EL NUMERO PARA SABER SI ES PAR O IMPAR");
		int numero = entrada.nextInt();
		if ((numero % 2) == 0) {
			System.out.println("el numero " + numero + " es par");
		} else {
			System.out.println("el numero " + numero + " es impar");
		}

	}

}
