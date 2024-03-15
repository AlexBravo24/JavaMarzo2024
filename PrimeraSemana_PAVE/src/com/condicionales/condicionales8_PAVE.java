package com.condicionales;

import java.util.Scanner;

public class condicionales8_PAVE {

	public static void main(String[] args) {
		
		int day = 0;
		
		System.out.println("Digita un día de la semana:");
		day = new Scanner(System.in).nextInt();
		
		switch (day) {
		case 1:
			System.out.println("El dia "+day+" es Lunes");
			break;
		case 2:
			System.out.println("El dia "+day+" es Martes");
			break;
		case 3:
			System.out.println("El dia "+day+" es Miércoles");
			break;
		case 4:
			System.out.println("El dia "+day+" es Jueves");
			break;
		case 5:
			System.out.println("El dia "+day+" es Viernes");
			break;
		case 6:
			System.out.println("El dia "+day+" es Sábado");
			break;
		case 7:
			System.out.println("El dia "+day+" es Domingo");
			break;
		default:
			System.out.println("ERROR: Estas a punto de salir de la Matriz o.O");
			break;
		}
	}

}
