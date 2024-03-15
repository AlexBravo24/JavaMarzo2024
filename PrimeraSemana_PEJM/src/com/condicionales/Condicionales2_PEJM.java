package com.condicionales;

import java.util.Scanner;

public class Condicionales2_PEJM {
	public static void main(String[] args) {
		//2.-Realiza un programa que pida un número por teclado y nos indique si es par
		//o impar
		int numero1;
		Scanner numeros = new Scanner (System.in);
		System.out.println("introduce el primer numero: ");
		numero1= numeros.nextInt();
		
		if(numero1%2==0)
		{
			System.out.println("es par");
		}
		else
			System.out.println("es impar");
	}
}
