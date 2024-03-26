package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char opc = 0;
		int num_a, num_b, res = 0;
		
		/*
		 * ACTIVIDAD.
		 * Crear otro proyecto llamado Calculadora_AKVB
		 * Crear una clase principal con el método main()
		 * Clase abstracta llamada calculadora.
		 * Añadir atributos (modelo, etc)
		 * Declarar cuatro métodos abstractos (Suma, resta, multiplicación, división)
		 * Crear otra clase llamada científica que será la encargada de implementar
		 * los métodos.
		 * Una vez hecho esto, instanciar a un objeto de científica en la clase 
		 * principal, y llaman al método que gusten
		 */
		Scanner leer = new Scanner (System.in);
		
		
		printMenu();
		
		do {
			opc = leer.next().charAt(0);
			menu(opc);
		}while(opc!= 'x');
		System.out.println("\nMe despido, saludos cordiales.");
		
	}

	public static void printMenu() {
		System.out.println("Elegir Opción...");
		System.out.println("1. Suma.");
		System.out.println("2. Resta.");
		System.out.println("3. Multiplicación.");
		System.out.println("4. División.");
		System.out.println("x. Salir");
	}
	public static void menu(char opc) {
		
		switch(opc) {
		case '1':
			System.out.println("Suma.");
			
			printMenu();
			
			break;
		case '2':
			System.out.println("Resta");
			printMenu();
			break;
		case '3':
			System.out.println("Multiplicación");
			printMenu();
			break;
		case '4':
			System.out.println("División");
			printMenu();
			break;
		case 'x':
			System.out.println("Salir.");
			break;
		default:
			System.out.println("Opción inválida.");
			printMenu();
			break;
		}
		
		
	}
}

