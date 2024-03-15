package com.condicionales;

import java.util.Scanner;

public class Condicionales8_PEJM {

	public static void main(String[] args) {
		//.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		//correspondiente. Si introducimos otro número nos da un error. 
         int dia;
		
		Scanner semana = new Scanner (System.in);
		System.out.println("introduce un numero del 1-7");
		dia= semana.nextInt();
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("ingrese un numero de la semana valido");
			break;
		}
	}

}
