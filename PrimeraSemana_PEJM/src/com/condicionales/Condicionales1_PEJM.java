package com.condicionales;

import java.util.Scanner;

public class Condicionales1_PEJM {

	public static void main(String[] args) {
	//1.-.Realiza un programa que reciba dos números por teclado e indique cuál es
	//	mayor o si son iguales
		int numero1;
		int numero2;
		
		Scanner numeros = new Scanner (System.in);
		System.out.println("introduce el primer numero: ");
		numero1= numeros.nextInt();
	    System.out.println("ingresa el segundo numero: ");
	    numero2= numeros.nextInt();
	    
	    if (numero1==numero2)
	    {
	    	System.out.println("los numeros son iguales");
	    }
	    else if (numero1>numero2)
	    {
	    	System.out.println("el primer numero cuyo valor es:" 
	    	+ " "+numero1+" es mayor que: "+numero2+" valor del segundo numero");
	    }
	    else
	    	System.out.println("el segundo numero cuyo valor es:" 
	    	    	+ " "+numero2+" es mayor que: "+numero1 + " valor del primer numero");
	
	}

}
