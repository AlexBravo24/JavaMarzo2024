package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		/*
		 * La interfaz Map asocia claves a valoes
		 * Esta interface no puede contener claves duplicadas
		 * pero si valores duplicados
		 * cada clave puede tener asiciado un valor como maximo
		 * 
		 */
		/*
		 * usamos clase HashMap : esta implementacion almacena las claves en una tabla
		 * hash.Es la que mejor rendimiento tiene en los maps, pero esto no
		 * garantiza un orden al momento de realizar iteraciones
		 * 
		 */
		
		/*
		 * Declando un HashMap
		 * El primer valor es el tipo de dato que funcionaraa como clave o llave key
		 * El segundo valor sera el tipo de dato a almacenar en dicha clave
		 * ejemplo, vamos a declarar un HashMap para guardar elementos de tipo String
		 * en la llave 1 vamos a alamacenar "Adrian"
		 * en la llave 2 vamos a alamacenar "Rafael"
		 * en la llave 5 vamos a alamacenar "Miguel"
		 * en la llave 3 vamos a alamacenar "Aradandi"
		 * en la llave 3 vamos a alamacenar "Alexis" - las llaves no pueden repetirse
		 *
		 */
		Map<Integer, String> usuarios = new HashMap<Integer, String>(); 
		
		//Agregar datos a mi HashMap --- con el metodo .put(Clave y valor)
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		//imprimir en consola determinando valor contenido en una llave 
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "Araasandi");// remplaza a alexis y coloca el nombre de arasandi
		System.out.println(usuarios.get(5));
		
		//Declarar un HashMap con llaves String y guardar elementos Double
		
		Map<String, Double> decimales = new HashMap<String, Double>();
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		
		System.out.println(decimales.get("B"));
		
		//para remover un elemento = .remove
		
		decimales.remove("B");
		
		
		
		
	}

}
