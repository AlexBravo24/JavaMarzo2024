package com.condicionales;

import java.util.Scanner;

public class Condicionales1_NJHC {

	public static void main(String[] args) {
		// 1.-.....Realiza un programa que reciba dos números por teclado 
		//e indique cuál es mayor o si son iguales.
		int num1 ;
		int num2 ;
		Scanner leer = new Scanner (System.in);// 
		//Casa housealexis = new Asignar (chica,blanco,dos pisos)
		//
		System.out.println("Escribe el primer numero 1.- :");
		num1 = leer.nextInt();
		
		System.out.println("Escribe el segundo numero 2.-:");
		num2 = leer.nextInt();
		
		if (num1 == num2) {
			System.out.println ("Son iguales");
		}else {
			//System.out.println ("Son diferentes");
			if(num1 > num2 ) {
				System.out.println("El primer numero ingresado: " + num1 + " es mayor que el segundo numero: "+ num2);	
			}else {
				System.out.println("El segundo numero ingresado: "+ num2 +" es mayor que el primer numero ingresado: "+ num1);	
			}	
		}
	}// cierre del metodo main

}// cierre de la clase condicionales1
