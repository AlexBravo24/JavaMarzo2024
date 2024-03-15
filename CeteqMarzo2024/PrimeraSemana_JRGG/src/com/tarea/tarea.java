package com.tarea;

import java.util.Scanner;

public class tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.Realiza un programa que reciba dos números por teclado e indique cuál es 
//		mayor o si son iguales
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int numero1 = entrada.nextInt();
		
		System.out.println("introduce el primer numero");
		int numero2 = entrada.nextInt();
		
		if(numero1>numero2){
			System.out.println("El es el mayor "+numero1);
		}else if(numero1<numero2) {
			System.out.println("El es el mayor "+numero2);
		}else if(numero1==numero2) {
			System.out.println("Ambos numeros son iguales");
		}

	}

}
