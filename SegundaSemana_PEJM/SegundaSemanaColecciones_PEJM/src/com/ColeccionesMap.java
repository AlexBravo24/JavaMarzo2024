package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {
	public static void main(String[] args) {
//	la interfaz Map Asocia o alamcena los datos
//	en pares(clave - valor a almacenar)
//	las claves no pueden duplicarse
//	
//	Es decir, la clave actua como un idenfificador unico
//	para cada elemento a almacenar (ID)
//	
//	Declaracion de un MAp y la clase HAshMap
//	para almacenar claves de tipo integer y elementos de tipo string

		Map<Integer, String> usuarios = new HashMap<Integer, String>();

		usuarios.put(1, "Angel");
		usuarios.put(5, "Karla");
		usuarios.put(2, "Pedro");

		System.out.println(usuarios);
		// mandar a imprimir solo un dato especifico
		System.out.println(usuarios.get(2));
		// remover o eliminar un dato dentro de la lista
		usuarios.remove(5);
		System.out.println(usuarios);
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		for (String i : usuarios.values()) {
			System.out.println(i);
		}
		
		for (Integer i : usuarios.keySet()) {
			System.out.println("llave: "+i+ ""+ " valor: "+ usuarios.get(i));
		}
	}
}
