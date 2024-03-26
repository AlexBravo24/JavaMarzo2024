package com;

public class Arrays {

	public static void main(String[] args) {
		/* Los Arrays son una estructura o coleccion de datos 
		 * de un mismo tipo, es decir, tienen un tipo de datos en
		 * comun, y una vez declarado su tamaño, este no puede cambiar.
		 * Los arrys son una estructura que nos permite almacenar una cantidad de elementos de un tipo de
		 * datos en comun, Una de las desventajas de los arrays es que estos no pueden crecer en tiempo de ejecucion
		 * 
		 *///Ejemplo de declaracion de un array de  numeros enteros
		//Declarando un array.
		int [] numeros ;
		
		int [] numeros2 = new int [5]; 	//Array de numeros enteros con 
										//su tamaño declarado.
		
		/* Arrays inician en 0 
		 * Los arrays comienzan a almacenar valores desde la posicion "0", por lo cual la
		 * ultima posicion a alamcenar en este ejemplo es la "4"
		 * */
		numeros2 [0] = 101;	//Los corchetes[] indican la posicion.
		numeros2 [1] = 102;
		numeros2 [2] = 103;
		numeros2 [3] = 104;
		numeros2 [4] = 105;
		
		/* Tratar de meter valores fuera del array lo desborda.
		 * Al declarar numeros[5] no llega hasta la posicion 5,
		 * sino que son las posiciones 0-4 y un total de 5.
		 */
	
		//Ejemplo  de mostrar o mandar a imprimir una determinada posicion en consola
		System.out.println(numeros2[3]); // manda a imprimir la posicion 3 ----104
		//IMPRIMIR POSICIONES DEL ARRAY
		System.out.println("Numeros[4]: " + numeros2[4]);
		
		//Ejemplo de declarar un array de numeros enteros pero con sus valores 
		//asignados desde un inicio 
		
		int [] numeros3 = {101,102,103,104,105,106}; //101 seria la posision 0
		//Ejemplos de otros array de otro tipo de datos
		char [] letras = {'A', 'L', 'E', 'X', ' ' };
		
						//Otra forma de declarar arrays:
		
				 		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//Array declarado e inicializado.
		
				 		
		String[] nombres = {"Nadia", "Sebastian", "Brandon"};		
		
		
		//Ejemplo de recorre un array con un ciclo for 
		
		//Imprimir un array completo usando un ciclo.
		System.out.println("\nImprimir un array completo usando un ciclo.");
		for(int i  = 0 ; i < nombres.length ; i++) {
			System.out.println("num["+ i +"]: " + nombres[i]);
			System.out.println(i +".-" + nombres[i]);
			
		}
		System.out.println("Nombres[1]: " +nombres[1]);
		
		char [] letra = {'N','a','d','i','a'};
		
		System.out.println(letra);	//System out puede imprimir un array 
									//de caracteres.
		
		
		
		//for each
		
		for(String i : nombres) {	//Para cada uno de los elementos realiza la accion.
			System.out.println("Nombres (for each): " +i);
		}
		
		//for each numeros
		System.out.println("");
		for(int i: num) {
			System.out.println("Numeros (for each): " + i);
		}
		
		
	}


	}

