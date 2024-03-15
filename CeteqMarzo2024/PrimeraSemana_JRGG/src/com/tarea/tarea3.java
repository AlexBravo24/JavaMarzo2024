package com.tarea;

import java.util.Scanner;

public class tarea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.Crea un programa que pida al usuario dos números y muestre el resultado 
//		de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("INGRESE EL NUMERO 1");
		
		double num1 = entrada.nextInt();
		System.out.println("INGRESE EL NUMERO 2");
		double num2 = entrada.nextInt();
		
		if(num2!=0) {
			double resultado = (num1/num2);
			System.out.println("LA DIVISION DE AMBOS NUMEROS ES = " + resultado);
		}else {
			System.out.println("ERROR !!!! NO SE PUEDE DIVIDIR ENTRE EL NUMERO CERO 0");
		}


	}

}
