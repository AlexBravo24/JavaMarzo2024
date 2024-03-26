package com.condicionales;

import java.util.Scanner;

public class Condiconales8_NJHC {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
		//Si introducimos otro número nos da un error.

		Scanner leer = new Scanner (System.in);  
	    
        System.out.print("Ingrese el día de la semana (del 1 al 7): ");
       int dia = leer.nextInt();
       
		switch (dia) {
		
		case 1:
			System.out.println ("El día correspondiente a :" +dia+" es Lunes");
			break;
		case 2:
			System.out.println ("El día correspondiente a :" +dia+" es Martes");
			break;
		case 3:
			System.out.println ("El día correspondiente a :" +dia+" es Miercoles");
			break;
		case 4:
			System.out.println ("El día correspondiente a :" +dia+" es Jueves");
			break;
		case 5:
			System.out.println ("El día correspondiente a :" +dia+" es viernes");
			break;
		case 6:
			System.out.println ("El día correspondiente a :" +dia+" es sabado");
			break;
		case 7:
			System.out.println ("El día correspondiente a :" +dia+" es domingo");
			break;
		default:
			System.out.println ("Error");
			break;
		
		}
		
		
		
	}// cierre del metodo main

}// cierre de la clase condicionales8
