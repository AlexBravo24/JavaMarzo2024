package com.condicionales;

import java.util.Scanner;

public class Condicionales6_PEJM {

	public static void main(String[] args) {
		// 6.-El director de una escuela est� organizando un viaje de estudios y requiere
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada
//		alumno por el viaje
		int alumnos,total;
		Scanner escuela = new Scanner (System.in);
		System.out.println("�cuantos alumnos van?: ");
		alumnos= escuela.nextInt();
		if(alumnos>=100)
		{
			total=alumnos*65;
			System.out.println("el total a pagar por el servicio es de: "+ total);
		}
		if(alumnos<100 && alumnos>=50)
		{
			total=alumnos*70;
			System.out.println("el total a pagar por el servicio es de: "+ total);
		}
		if(alumnos<50 && alumnos>=30)
		{
			total=alumnos*95;
			System.out.println("el total a pagar por el servicio es de: "+ total);
		}
		if (alumnos<30)
			{
			total=4000/alumnos;
			System.out.println("el monto a pagar por alumno es de: "+ total);
			}
		
	   
	}

}
