package com.tarea;

import java.util.Scanner;

public class tarea4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. Realiza un programa que lea una cadena por teclado y compruebe si 
//		contiene letras may�sculas.
		

		        Scanner entrada = new Scanner(System.in);
		        
		        System.out.println("Ingrese una cadena:");
		        String cadena = entrada.nextLine();
		        
		        String cadena2 = cadena.toLowerCase();
		        
		        System.out.println(cadena2);
		        if(cadena.contains("ABCDEFGHIJKLMN�OPQRSTUVWXYZ")) {
		        //if (cadena.equals(cadena2)==false) {
		            System.out.println("La cadena contiene letras may�sculas.");
		        } else {
		            System.out.println("La cadena no contiene letras may�sculas.");
		        }
		    }
	}


