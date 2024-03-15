package com.condicionales;

import java.util.Scanner;

public class Condicionales5_PEJM {

	public static void main(String[] args) {
//		5.-Realiza un programa que calcule la aceptación de una solicitud en base a
//		los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		int nota;
		int edad;
		char sexo;
		
		Scanner solicitud = new Scanner (System.in);
		System.out.println("introduce tu nota (del 0-10): ");
		nota= solicitud.nextInt();
	    System.out.println("ingresa tu edad: ");
	    edad= solicitud.nextInt();
	    System.out.println("ingresa tu sexo:\n M=mascuino \n F=Femenino");
	    sexo= solicitud.next().charAt(0);
	    
	    	if(nota>=5 && edad>=18 && sexo== 'M')
	    	{
	    		System.out.println("es posible que su solicitud sea aceptada");
	    	}
	    	else if(nota>=5 && edad>=18 && sexo=='F')
	    	{
	    		System.out.println("su solicitud ha sido aceptada");
	    	}
	    	else 
	    		System.out.println("su solicitud fue rechazada");
	    	
	    	
	    
	}

}
