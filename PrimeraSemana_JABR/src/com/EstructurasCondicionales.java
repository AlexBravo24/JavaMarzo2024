package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decisión if - evaluan valores booleanos
		
		/*
		 * si (se cumple esto){
		 * Se ejecuta este bloque}
		 * }si no{
		 * ejecutamos es otro bloque
		 * }
		 */
		
		int x = 9;
		
		
//		if (x<9) { //Si x es menor a 10
//			//Imprimimos Si en consola
//			System.out.println("Si");
//		}else { //Si no
//			//Imprimimos No en consola
//			System.out.println("No");
//		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//AND - && - Devuelva el bloque o valor true cuando se cumplen
		//todas las condiciones
		
//		if (x>1 && x<9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//OR - || - Devuelve el valor true cuando se cumple al menos
		//una condicion
		
//		if (x>1 || x<9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//IGUALDAD - == - Compara el valor contra otro que indiquemos
		//Si los valores son iguales, devuelve true
		
//		if (x == 10 || x>5) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//DIFERENTE DE - != - Si el valor contra el que se compara
		//la condicion es diferente, devuelve un valor true
		
//		if (x != 20) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//NOT - ! - Niega una condicion/Cambia el valor de true a false
		//o viceversa según sea conveniente
		
//		if (!(x>1)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
		
		//if - else concatenado o anidado
		
		int dia = 7;
		
//		if (dia == 1) {
//			System.out.println("Lunes");
//		}else if (dia == 2) {
//			System.out.println("Martes");
//		}else if (dia == 3) {
//			System.out.println("Miércoles");
//		}else if (dia == 4) {
//			System.out.println("Jueves");
//		}else if (dia == 5) {
//			System.out.println("Viernes");
//		}else {
//			System.out.println("Error");
//		}

		//switch - case
		
		switch (dia) {
		
		case 1:
			System.out.println("Lunes");
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
			System.out.println("Viernes");
			break;
		default:
			System.out.println("Error");
			break;
		}
		

	}

}
