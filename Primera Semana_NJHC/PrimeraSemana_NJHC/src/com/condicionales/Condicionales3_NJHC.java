package com.condicionales;

import java.util.Scanner;

public class Condicionales3_NJHC {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.

		Scanner leer = new Scanner (System.in);
		
		System.out.print("Ingrese el primer número: ");
        double numero1 = leer.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = leer.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por 0.");
      }
		
        
	}// cierre del metodo main

}// cierre de la clase condicionales2
