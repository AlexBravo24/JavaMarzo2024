package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS - Tambien son conocidos como bucles
		//Nos ayudan a ejecutar "n" veces una acción, tarea o bloque de código de a cuerdo a una condición
		//casi siempre nos apoyamos en que esta condición se cumpla de acuerdo al cambio de una variable, muchas veces es númerica
		
		//CICLO WHILE- Mientras algo se cumpla, se ejecuta un código
		
		/*
		 * mientras (esto se cumpla){
		 * esto se ejecuta
		 * }
		 */
		
		int x = 1;
//		
//		while (x<5) {
//			System.out.println("Hola Mundo"); //El ciclo WHILE es un ciclo indeterminado, pero podemos agregar un incremento para detener la condición
//			x = x + 1;
//		}
		
		//CICLO DO WHILE - Similar al ciclo WHILE, pero aseguramos que nuestro código se ejecute al menos 1 vez en caso de caer en una
		//condición que sea imposible de cumplir; es decir, primero se ejecuta el código y después se evalua si se debe seguir ejecutando
		
//		do { //has o ejecuta lo siguiente
//			System.out.println("Hola Mundo");
//		}while (x>2);
		
		//CICLO FOR - ciclo determinado y se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos que se ejecute o realice una acción
		
		/*
		 * para (estos argumentos){
		 * se ejecuta este código
		 * }
		 * 
		 * para (una variable de control; una condición; un incremento)
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".-Hola G161 Remoto");
		}

	}

}
