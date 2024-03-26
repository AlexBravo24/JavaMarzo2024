package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		

		
		
		
		
		
		
		
		
	
		int x = 9;
/*		
		if (x<9) { //Si x es menor a 10
			//imprimimos Si en consola
			System.out.println ("Si");
		}else { // Si no
			//imprimimos No en consola 
			System.out.println ("No");
		}
*/
/*
		if (x>1 && x<9) {
			System.out.println ("Si");
		}else {
			System.out.println ("No");
		}
*/	
		
		//OR - ||  -Devuelve el valor tru cuando se cumple almenos
		// una condicion
/*	
		if (x>1 || x<9) {
			System.out.println ("Si");
		}else {
			System.out.println ("No");
		}
*/
		//operador de IGUALDAD - ==- compara el valor contra otro ue indiuemos
		//Si los valores son iguales. devuelve true
/*	
		if (x == 10) {
			System.out.println ("Si");
		}else {
			System.out.println ("No");
		}
*/
/*
		if (x == 10 || x>5) {
			System.out.println ("Si");
		}else {
			System.out.println ("No");
		}
*/
		//Operador DIFERENTE DE - != - Si el valor contra el ue se compara
		//la condicion es difernte, devuelve un valor true
/*
		if (x != 20) {
			System.out.println ("Si");
		}else {
			System.out.println ("No");
		}
*/
		// Operador NOT - ! - Niega una condicio /ambia el valor de true a false
		// o viceversa segun sea conveniente 
/*	
		if (!(x>1)) {
			System.out.println ("Si");
		}else {
			System.out.println ("No");
		}
*/
		//TEMA if  else concatenado o anidado
		
		int dia = 3;
		
/*		if (dia == 1 ) {
			System.out.println ("Lunes");
		}else if (dia == 2) {
			System.out.println ("Martes");
		}else if (dia == 3) {
			System.out.println ("Miercoles");
		}else if (dia == 4) {
			System.out.println ("Jueves");
		}else if (dia == 5) {
			System.out.println ("Viernes");
		}else {
			System.out.println ("Error");
     	}
     */	
		//switch - case
		switch (dia) {
		
		case 1:
			System.out.println ("Lunes");
			break;
		case 2:
			System.out.println ("Martes");
			break;
		case 3:
			System.out.println ("Miercoles");
			break;
		case 4:
			System.out.println ("Jueves");
			break;
		case 5:
			System.out.println ("viernes");
			break;
		default:
			System.out.println ("Error");
			break;
		
		}
		
		
	}//cierre del main
		

}//cierre de la clase

