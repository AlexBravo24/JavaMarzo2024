package com;

public class EstructurasCondicionales {
	public static void main (String [] args) {
		//Ccondicionales
		//Estructuras de decision que evualuan valores boleanos
		
		//si se cumple esto se ejecuta este bloque si nno se ejecuta este otro bloque
		int x = 9;
		
		
		
//		if(x<9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//			
		
		//CONDICIONES COMPUESTAS
		
		//AND - && DEVUELVA EL BLOQUE O VALOR TRUE CUANDO SE CUMPLEN TODAS LAS CONDICIONES
		
//		if(x>1 && x<9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
		
		//OR - || DEVUELVE EL VALOR TRUE CUANDO SE CUMPLE ALMENOS UNA CONDICION
//		if(x>1 || x<9) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
		
		//IGUALDAD - ==
		
//		if(x==10) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		//DIFERENTE DE !=
		
//		if(x!=10) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
		
		//NOT ! NIGEEGA UNA CONDICION
//		if(!(x>1)) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
		
		
		int dia = 5;
//		if(dia ==1) {
//			System.out.println("lunes");
//			
//		}else if (dia==2) {
//			System.out.println("martes");
//		}else if (dia==3) {
//			System.out.println("miercoles");
//		}else if (dia==4) {
//			System.out.println("jueves");
//		}else if (dia==5) {
//			System.out.println("vieeernnes");
//		}else if (dia==6) {
//			System.out.println("sabado");
//		}else if (dia==7) {
//			System.out.println("domingo");
//		}else {
//			System.out.println("error");
//		}
		
		
		//switch - case
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("Marrtes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		
		default:
			System.out.println("Error!!!!");
			break;
		}
		
		
		
	}

}
