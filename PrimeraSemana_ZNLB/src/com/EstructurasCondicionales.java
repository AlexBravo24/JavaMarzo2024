package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decisión If -evaluan valores booleanos
		
		/*
		 * si (se cumple esto) {
		 * Se ejectua este bloque }
		 *}si no{
		 *ejecutamos este otro bloque
		 *}
		 */
		
		int x = 9;
		
		
		
		if (x<10) { //Si x es menor a 10
			//imprimimos Si en consola
			System.out.println("Si");
		}else { //Si no
			//Imprimimos No en consola
			System.out.println("No");
		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - &&
		
//		if (x>1 && x<9) {
//			System.out.println("Si");
//		} else {
//		
//			System.out.println("No");
//		}
		
		//OR -||- Devuelve el valor true cuando se cunple al menos
		// una condición
		
//		if (x>1 || x<9) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		//IGUALDAD - == - Compara el valor contra otro que indiquemos
		//Si losa valores sin iguales, devuelve true
		
//		if (x == 10 || x>5) {
//			System.out.println("Si");	
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != -Si el valor contra el que se compara
		//la condición es diferente, devuelve un valor true
		
//		if (x !=20) {
//			System.out.println("Si");
//		} else {
//			System.out.println("No");
//		}
		
		
		//NOT - ! - Niega una condicion/cambia el valor de true a false
		//o viceversa segun sea conveniente
		
//		if (!(x>1)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		
//		int dia = 4;
//		
//		if (dia ==1) {
//			System.out.println("Lunes");
//		} else if (dia==2) {
//			System.out.println("Martes");
//		} else if (dia==3) {
//			System.out.println("Miercoles");
//		} else if (dia ==4) {
//			System.out.println("Jueves");
//		} else if (dia ==5 ) {
//			System.out.println("Viernes");
//		} else {
//			System.out.println("Error");
//		}
		
		
		//Switch case
		
//		switch (dia) {
//		
//		case 1:
//			System.out.println("Lunes");
//			break;
//		case 2:
//			System.out.println("Martes");
//			break;
//		case 3:
//			System.out.println("Miercoles");
//			break;
//		case 4:
//			System.out.println("Jueves");
//			break;
//		case 5:
//			System.out.println("Viernes");
//			break;
//
//		default:
//			System.out.println("Error");
//			break;
//		}
		
		
		
		
	}

}
