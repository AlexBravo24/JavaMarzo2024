package com;

import java.util.Scanner;

public class EntradaDeDatos {
	
	public static void main(String [] perros) {
		Scanner read = new Scanner(System.in);	
		
		char c;
		int i;
		String s;
		double d;
		
		System.out.println("Digita un caracter");
		c = read.nextLine().charAt(0);
		System.out.println("Caracter: "+c);
		System.out.println("Digita un número: ");
		i = read.nextInt();
		System.out.println("Numero: "+i);
		System.out.println("Digita un numero con decimales: ");
		d = read.nextDouble();
		System.out.println("Numero Decimal: "+d);
		System.out.println("Digita una frase: ");
		s = read.nextLine();
		System.out.println("Frase: "+s);
		
		
	}
}
