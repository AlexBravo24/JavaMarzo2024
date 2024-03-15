package com.condicionales;

import java.util.Scanner;

public class condicionales3_PAVE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		
		System.out.println("Digita el número 1: ");
		num1 = read.nextDouble();
		System.out.println("Digita el número 2: ");
		num2 = read.nextDouble();
		
		if(num2 == 0 ) {
			System.out.println("ERROR: No es posible división por 0");
		}else {
			System.out.println("Resultado: "+(num1/num2));
		}
	}

}
