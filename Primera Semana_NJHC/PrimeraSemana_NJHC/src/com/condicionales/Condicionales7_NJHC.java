package com.condicionales;

import java.util.Scanner;

public class Condicionales7_NJHC {

	public static void main(String[] args) {
		
		
		/*7. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado 
		 * de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		 *  Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		 *  Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
		 *  “ERROR: número incorrecto”.
		 * 
		 */
		Scanner leer = new Scanner (System.in);  
		    
	        System.out.print("Ingrese el resultado obtenido al lanzar un dado de seis caras: ");
	       int resultado = leer.nextInt();
	        	// int resultado = leer.nextLine(); //string
	       String cadena=""; 
	       
	        switch (resultado) {
	            case 1:
	            	cadena = "Seis";
	                System.out.println("La cara opuesta al resultado obtenido es: "+cadena);
	                break;
	                
	            case 2:
	            	cadena = "cinco";
	                System.out.println("La cara opuesta al resultado obtenido es: "+cadena);
	                break;
	            case 3:
	            	cadena = "cuatro";
	                System.out.println("La cara opuesta al resultado obtenido es: "+cadena);
	                break;
	            case 4:
	            	cadena = "tres";
	                System.out.println("La cara opuesta al resultado obtenido es: "+cadena);
	                break;
	            case 5:
	            	cadena = "dos";
	                System.out.println("La cara opuesta al resultado obtenido es: "+cadena);
	                break;
	            case 6:
	            	cadena = "uno";
	                System.out.println("La cara opuesta al resultado obtenido es: "+cadena);
	                break;
	            default:
	                System.out.println("ERROR: número incorrecto.");
	                break;
	        }
	       
		
		
	}// cierre del metodo main

}// cierre de la clase condicionales7
