package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		
		
		
		// Ciclos- tambien conocidos como bucles
		//Los ciclos ayudan a ejecutar "Numero de veces" una acci�n
		//por tarea o bloque de codigo a una condici�n
		
		//Casi siempre nos apoyamos en que esta condici�n
		//se cumpla de acuerdo a una variable
		//muchas de las veces es numerica|
		
		//while - mientras
		//mientras algo se cumpla, se ejecuta un codigo
		
		/*
		 * mientras (esto se cumpla) {
		 * esto se ejecuta
		 * }
		 */
		
		int x = 1;
		
//		while (x<5) {
//		||	System.out.println("hola mundo");
//			//while es un ciclo indeterminado
//			//pero podemos agregar un incremento para detener 
//			//la condici�n en algun momento
//			x = x + 1;	
		//x++;
//		}
		
		//Ciclo do-while
		//similar al ciclo while, pero aseguramos que nuestro
		//codigo se ejecute por lo menos 1 vez en caso de caer
		// en una condici�n que sea imposible de cumplir
		//Es decir, primero se ejecuta el codigo y despues se evalua
		//si se debe seguir ejecutando
		
		
//		do { //Haz o ejecuta lo siguiente
//			System.out.println("Hola mundo");
//		} while (x>2);
		
		//for - ciclo determinado y este se utiliza
		//cuando conocemos o tenemos 1 idea de cuantas veces
		//queremos que se ejecute o realice una acci�n
		
		/*
		 *  for significa para (estos argumentos) { 
		 *  se ejecuta este codigo
		 *  }
		 *  
		 *  para (un|a variable de control; una condici�n y un incremento
		 *  
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".- Hola generaci�n G161 remoto");
		}
		
		
		

	}

}
