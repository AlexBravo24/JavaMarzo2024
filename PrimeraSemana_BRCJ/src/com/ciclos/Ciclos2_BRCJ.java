package com.ciclos;

import java.util.Scanner;

public class Ciclos2_BRCJ {

	public static void main(String[] args) {
		//2.- Programa un algoritmo que realice la tabla de multiplicar de un n�mero introducido desde teclado, 
		//hasta la iteraci�n deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		Scanner entrada = new Scanner (System.in);
		
		int num;
		
		System.out.println("Introduce un n�mero:");
		num = entrada.nextInt();
		
		for(int i = 1; i<=95; i++){
            System.out.println(num + " * " + i + " = " + num*i);                                                     
       }

	}

}
