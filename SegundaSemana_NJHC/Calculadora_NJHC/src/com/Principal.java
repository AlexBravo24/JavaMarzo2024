package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		char opc = 0;
		int num_a, num_b, res = 0;
		
		/*
		 * ACTIVIDAD.
		 * Crear otro proyecto llamado Calculadora_AKVB
		 * Crear una clase principal con el m�todo main()
		 * Clase abstracta llamada calculadora.
		 * A�adir atributos (modelo, etc)
		 * Declarar cuatro m�todos abstractos (Suma, resta, multiplicaci�n, divisi�n)
		 * Crear otra clase llamada cient�fica que ser� la encargada de implementar
		 * los m�todos.
		 * Una vez hecho esto, instanciar a un objeto de cient�fica en la clase 
		 * principal, y llaman al m�todo que gusten
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
		System.out.println("Elegir Opci�n...");
		System.out.println("1. Suma.");
		System.out.println("2. Resta.");
		System.out.println("3. Multiplicaci�n.");
		System.out.println("4. Divisi�n.");
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
			System.out.println("Multiplicaci�n");
			printMenu();
			break;
		case '4':
			System.out.println("Divisi�n");
			printMenu();
			break;
		case 'x':
			System.out.println("Salir.");
			break;
		default:
			System.out.println("Opci�n inv�lida.");
			printMenu();
			break;
		}
		
		
	}
}

