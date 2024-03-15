package com.condicionales;

import java.util.Scanner;

public class condicionales6_PAVE {

	public static void main(String[] args) {
		
		int alumnos = 0;
		System.out.println("¿Cuantos alumnos son?");
		alumnos = new Scanner(System.in).nextInt();
		
		if(alumnos >= 100) {
			System.out.println("Costo por alumno: $65");
		}else if( alumnos >= 55 && alumnos <= 99) {
			System.out.println("Costo por alumno: $70");
		}else if(alumnos >= 30 && alumnos <= 49) {
			System.out.println("Costo por alumno: $95");
		}else {
			System.out.println("Costo de renta del autobus: $4000");
		}
	}

}
