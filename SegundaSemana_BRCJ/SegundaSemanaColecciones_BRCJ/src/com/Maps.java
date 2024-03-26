package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		// La interfaz Map asocia claves a valores
		// Esta interface no puede contener calves duplicadas (ID); Pero si valores
		// duplicados
		// Cada clave puede tener asociado un valor como máximo

		// HashMap: esta implementación almacena las claves en una tabla hash. Es la que
		// mejor rendimiento tiene en
		// los maps, pero esto no garantiza un orden al momento de realizar iteraciones

		// Declarando un HashMap
		// El primer valor es el tipo de dato que funcionara como clave o llave (Key)
		// El segundo valor sera el tipo de dato a almacenar en dicha clave
		// Ejemplo: Vamos a eclarar un HashMap para guardar elementos de tipo String
		// 1, "Adrian"
		// 2, "Rafael"
		// 5, "Miguel"
		// 3, "Arasandi"
		// 3, "Alexis" - Las llaves no pueden repetirse

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		// Agregar datos a HashMap - .put(clave, valor)
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");

		System.out.println(usuarios);

		// Imprimir en consola determinado valor contenido en una llave
		System.out.println(usuarios.get(5));

		// Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);

		// Imprimir en consola las llaves de mi Hashmap
		System.out.println(usuarios.keySet());

		// Imprimir en consola los valores contenidos en el HashMap
		System.out.println(usuarios.values());

		// Mandar a imprimir cada una de las llaves con un ciclo for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}

		// Mandar a imprimir cada una de los valores
		for (String i : usuarios.values()) {
			System.out.println(i);
		}

		// Imprimir llaves y valores
		for (Integer i : usuarios.keySet()) {
			System.out.println("Llave: " + i + " Valor: " + usuarios.get(i));
		}
	}

}