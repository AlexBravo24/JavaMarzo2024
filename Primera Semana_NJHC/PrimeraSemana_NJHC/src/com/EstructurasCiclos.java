package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS -Tambien conocidad como bucles, nos ayudan a ejecutar "n" veces una accion 
		//o tare o bloue de codigo deacuerdo a una condicion
		//Casi siempre nos apoyamos en que esta condicion se cumpla de acuerdo al cambio de un variable
		//muchas de las veces es numerica
		
		// Ciclo while -Mientras
		//Mientras algo se cumpla, se ejecuta un codigo
		
		//estructura
		/*
		 * Mientras (esto se ejecuta){
		 * esto se ejecuta 
		 */
		int x = 1;   
//		while (x<5) {
//			System.out.println("Hola mundo");
//			// en este ejemplo vamos a ver que tiende al infinitas veces ejecutarse por que X siempre siempre va a ser menor a 5
//		/*
//		 * El ciclo while es un ciclo indeterminado pero podemos agregar un incrememento para detener la
//		 * condicion en algun momento
//		 */
//		x = x + 1;// puede ser igual x++ , este incremente se va a repetir hasta ue x+1 sea  5
//		//x+1= 1 imprime, x+1=2 imprime,... x+1=3 imprime, x+1=4 imprime solo 4 veces el ciclo
//	}
		//Ciclo do - while
		/*
		 * Similr al ciclo while, pero aseguramos que nuestro codigo se ejecute por lo menos 1 vez, en caso de caer 
		 * en una condicion que sea impodible de cumplir es decir, primero se ejecuta el codigo y despues se evalua
		 * si se debe seguir jecutando
		 */
//		do {//haz o ejecuta lo siguiente
//			System.out.println("Hola mundo");
//			
//		}while (x>2);// mientras x sea mayor a 2, x vale 1 para nosotros, es imposible que se cumpla
//		//con este podemos determinar hasta cuando se cuampla
//		
		
		//Ciclo for- ciclo determinado - se utiliza cuando conocemos o tenemos una idea de cuantas veces queremos
		//que se ejecute o realice una accion 
		
		/*
		 * para (estos argumentos){
		 * se ejecuta este codigo
		 * }
		 * para (una variable de control; una condicion ; un incremento)
		 *
		 */
//		
//		for (int i = 0; i < 5; i++) {// i vale 0 se imprime , i+1 se imprime, ... hasta que i vale 4 termina, se imprime 5 veces
//			System.out.println("Hola G161 Remoto");//  
//		}
//		
//		for (int i = 0; i < 5; i++) {// i vale 0 se imprime , i+1 se imprime, ... hasta que i vale 4 termina, 
//			System.out.println(i + " .- Hola G161 Remoto");//  nos va ir dando el valor de i cada que imprime
//			}
		
		
		for (int i = 0; i <= 5; i++) {// i vale 0 se imprime , i+1 se imprime, ... hasta que i es menor o igual a 5 termina, se imprime 6 veces
			System.out.println(i + " .- Hola G161 Remoto");//  nos va ir dando el valir de i cada que imprime
			}
		
		
	}// cierre del metodo main

}// cierre de la clase EstructurasCiclos
