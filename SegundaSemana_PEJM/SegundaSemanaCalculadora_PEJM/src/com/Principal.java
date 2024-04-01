package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		
		Scanner menu = new Scanner(System.in);
	do {
		 Cientifica Prueba= new Cientifica("acer", "cd-4000", "gris", 2350.10, 4);
	        
	        System.out.println("Bienvenidos al menu de operaciones de una calculadora basica\n"
	        + "Primeramente se proporcionara una pequeña descripcion de la calculadora en uso:\n"
	        + Prueba+"\n"+ "seleccione una operacion\n 1.- suma\n 2.- resta \n 3.- multiplicacion"
	        		+ "\n 4.- division \n 5.- suma de 3 numeros\n 6.- resta de 3 numeros"
	        		+ "\n 7.- multiplicacion de 3 numeros \n 8.- division ingresando valores\n9.- tomar temperatura\n" + " 10.- salir");
			cadena= menu.nextLine();
		switch (cadena) {
		case "1":
			Prueba.suma(10,11);
			break;
		case "2": Prueba.resta(10,11);
			break;
		case "3":Prueba.multiplicacion(10, 11);
			break;	
		case "4": Prueba.division(10, 4);
			break;
		case "5":
			Prueba.suma(10,11,13);
			break;
		case "6": Prueba.resta(10,11,21);
			break;
		case "7":Prueba.multiplicacion(10, 11, 3);
			break;	
		case "8": Prueba.division();
			break;
		case "9":
			Prueba.tomarTemperatura();
			break;
		case "10":
			System.out.println("Gracias por utilizarme");
			
			break;
		default:
			System.out.println("seleccione una opcion valida");
			break;
		}
	       
	} while (cadena!="9");	
        
       
       
        
       
	}

}
