package com.condicionales;

import java.util.Scanner;

public class Condicionales4_PEJM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		
		Scanner texto= new Scanner (System.in);
		System.out.println("introduce un texto");
		cadena= texto.nextLine();
		
		String cadenaF = cadena.toLowerCase();//cambia todo a minuscula
    	
    	if(cadena.equals(cadenaF)==true)
    	{
    		System.out.println("el texto no contiene mayusculas");
    	}
    	else
    		System.out.println("el texto contiene mayusculas");
	}

}
