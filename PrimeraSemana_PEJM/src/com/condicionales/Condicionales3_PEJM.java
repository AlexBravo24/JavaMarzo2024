package com.condicionales;

import java.util.Scanner;

public class Condicionales3_PEJM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		double resultado;
		Scanner numeros = new Scanner (System.in);
		System.out.println("introduce el numero que quiere dividir: ");
		numero1= numeros.nextInt();
	    System.out.println("ingresa el valor sobre el que quiere dividir: ");
	    numero2= numeros.nextInt();
	    
	   
	    if (numero2==0)
	    {
	    	System.out.println("error, no se puede dividir entre 0");
	    }
	    else {
	    	 resultado=numero1/numero2;
	    	System.out.println("el resultado de la divicion es: " + resultado );
	    }
	}
	}
