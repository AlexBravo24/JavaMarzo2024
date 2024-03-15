package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS - Tambien son conocidos como bucles
		//Nos ayudan a ejecutar "n" veces una acci�n, tarea o bloque de c�digo de a cuerdo a una condici�n
		//casi siempre nos apoyamos en que esta condici�n se cumpla de acuerdo al cambio de una variable, muchas veces es n�merica
		
		//CICLO WHILE- Mientras algo se cumpla, se ejecuta un c�digo
		
		/*
		 * mientras (esto se cumpla){
		 * esto se ejecuta
		 * }
		 */
		
		int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola Mundo"); //El ciclo WHILE es un ciclo indeterminado, pero podemos agregar un incremento para detener la condici�n
//			x = x + 1;
//		}
		
		//CICLO DO WHILE - Similar al ciclo WHILE, pero aseguramos que nuestro c�digo se ejecute al menos 1 vez en caso de caer en una
		//condici�n que sea imposible de cumplir; es decir, primero se ejecuta el c�digo y despu�s se evalua si se debe seguir ejecutando
		
//		do { //has o ejecuta lo siguiente
//			System.out.println("Hola Mundo");
//		}while (x>2);
		
		//CICLO FOR - ciclo determinado y se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos que se ejecute o realice una acci�n
		
		/*
		 * para (estos argumentos){
		 * se ejecuta este c�digo
		 * }
		 * 
		 * para (una variable de control; una condici�n; un incremento)
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".-Hola G161 Remoto");
		}

	}

}
