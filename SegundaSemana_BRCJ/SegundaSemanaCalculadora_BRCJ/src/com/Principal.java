package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);
//
//		int a, b;
//
//		System.out.println("Introduce el primer número:");
//		a = entrada.nextInt();
//
//		System.out.println("Introduce el segundo numero:");
//		b = entrada.nextInt();

		Cientifica canon = new Cientifica();

		canon.suma(20, 5);
		canon.resta(20, 5);
		canon.multiplicacion(20, 5);
		canon.division(20, 0);

		System.out.println("Operaciones Normales");
		canon.suma(20.0, 5.0);
		canon.resta(20.0, 5.0);
		canon.multiplicacion(20.0, 5.0);
		canon.division(20.0, 5.0);

		canon.tomarTemperatura();

		// ¿De donde toman comportamientos nuestras clases u objetos?
		// 1.- Métodos propios
		// 2.- De otras clases heredandolos incluyendo clases abstractas
		// 3.- De interfaces

	}

}
