package com.condicionales;

import java.util.Scanner;

public class condicionales5_PAVE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int nota = 0;
		int edad = 0;
		char sexo = ' ';
		
		System.out.println("Digite la edad: ");
		edad = read.nextInt();
		System.out.println("Digite el sexo, solo existen 2 (M/F): ");
		sexo = read.next().charAt(0);
		System.out.println("Digite la nota: ");
		nota = read.nextInt();
		
		if( (nota == 5) && (edad == 18) && (sexo == 'M' || sexo == 'm') ) {
			System.out.println("POSIBLE");
		}else if( (nota == 5) && (edad == 18) && (sexo == 'F' || sexo == 'f') ) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
	}

}
