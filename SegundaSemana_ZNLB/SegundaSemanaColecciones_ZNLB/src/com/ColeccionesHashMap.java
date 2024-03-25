package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declarar un Map y la clase HashMap
		//para almacenar claves de tipo Integer y elementos de tipo string
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregamos elementos a nuestro HashMap
		
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir HashMap en consola 
		System.out.println(usuarios);
		//imprimir en pantalla un solo valor almacenado en
		//una determinada clave
		
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de HashMap
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//mandar a imprimir cada una de las llaves con ciclo for each
		
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//imprimir llaves y valores
		
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave:" + i + " " + " Valor: " + usuarios.get(i));
		}
			
	
		
		
		
	}

}
