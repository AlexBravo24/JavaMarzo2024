package com.condicionales;

import java.util.Scanner;

public class Condicional6_NJHC {
/*
 * El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar 
 * a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
 *  * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, el costo es de 
 *  70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos, el costo de la renta del autobús
 *   es de 4000 euros, sin importar el número de alumnos. Realiza un algoritmo que permita determinar el pago a la 
 *   compañía de autobuses y lo que debe pagar cada alumno por el viaje.
 */
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int alumnos; 
		
        System.out.print("Ingrese numero de alumnos: ");
        alumnos = leer.nextInt();
		
		if(alumnos>=30) {
			if(alumnos>=50) {
				if(alumnos>=99) {
					int pago_autobus = 65*alumnos;
					System.out.println("El pago del autobu: "+pago_autobus+ " euros");
					System.out.print("El pago de cada alumno es : 65 euros");
				}else {
					int pago_autobus = 70*alumnos;
					System.out.println("El pago del autobu: "+pago_autobus+ " euros");
					System.out.print("El pago de cada alumno es : 70 euros");
				}
			}else {
				int pago_autobus = 95*alumnos;
				System.out.println("El pago del autobu: "+pago_autobus+ " euros");
				System.out.print("El pago de cada alumno es : 95 euros");
			}
		}else {
			int pago = 4000/alumnos;
			System.out.println("El pago del autobu: 4000 euros");
			System.out.print("El pago de cada alumno es : "+pago + " euros");
		}
			
	}// cierre del metodo main

}// cierre de la clase condicionales6
