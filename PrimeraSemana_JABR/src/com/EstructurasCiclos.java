package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS - Tambi�n son conocidas como bucles
		//Nos ayudan a ejecutar "n" veces un acci�n
		//o tarea o bloque de codigo de acuerdo a 
		//una condicion
		
		//Casi siempre nos apoyamos en que esta condicion
		//se cumpla de acuerdo al cambio de una variable
		//Muchas de las veces es num�rica
		
		//while - mientras
		//mientras algo se cumpla, se ejecuta un codigo
		
		/*
		 * mientras (esto se cumpla){
		 * esto se ejecuta
		 * }
		 */
		
		int x = 1;
		
//		while (x<5) {
//			System.out.println("Hola mundo");
//			//El ciclo while es un ciclo indeterminado
//			//Pero podemos agregar un incremento para detener
//			//la condicion en algun momento
//			x = x + 1;
		// x++;
//		}
		
		//Ciclo do - while
		//Similar al ciclo while, pero aseguramos que nuestro
		//c�digo se ejecute por lo menos 1 vez, en caso de caer
		//en una condici�n que se imposible de cumplir
		//Es decir, primero se ejecuta el codigo y despu�s se evalua
		//si se debe seguir ejecutando
		
//		do { //Haz o ejecuta lo siguiente
//			System.out.println("Hola mundo");
//		}while (x>2);
		
		//for - ciclo determinado - Se utiliza cuando conocemos
		//o tenemos una idea de cu�ntas veces queremos que
		//se ejecute o realice una acci�n
		
		/*
		 * para (estos argumentos){
		 * se ejecuta este codigo
		 * }
		 * 
		 * para (una variable de control; una condicion; un incremento)
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".- Hola G161 Remoto");
		}

	}

}
