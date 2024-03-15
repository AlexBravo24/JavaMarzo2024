package com;

public class Arrays {

	public static void main(String[] args) {
		
		//Los arrays son una estructura que nos permite almacenar una cantidad de elementos de un tipo de datos en común
		//Una de las desventajas de los arrays es que estos no pueden crecer en timepo de ejecución
		
		//Ejemplo de declaración de un ARRAY de números enteros, sin tamaño ni valores asignados
		int [] numeros;
		
		//Ejemplo de declaración de un ARRAY con tamaño iniciado
		int [] numeros2 = new int [5]; //Los ARRAYS comienzan a almacenar valores desde la posisicón "0", por lo cual la ultima posición 
		//a almacenar en este ejemplo es la "4"
		numeros2 [0] = 101;
		numeros2 [1] = 102;
		numeros2 [2] = 103;
		numeros2 [3] = 104;
		numeros2 [4] = 105;
		
		//Ejemplo - impresión de una determinada posición en consola
		System.out.println(numeros2 [3]);
		
		//Ejemplo - Declarando ARRAYS de numeros enteros asignando valores desde el inicio
		int [] numeros3 = {101,102,103,104,105,106};
		
		//Ejemplo de otros ARRAYS con otro tipo de datos
		char [] letras = {'A','L','E','X',' '};
		
		String [] nombres = {"Nadia", "Sebastian", "Brandon"};
		
		//Ejemplo - Recorrer un array con ciclo FOR
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(i + ".-" + nombres[i]);
		}
	}

}
