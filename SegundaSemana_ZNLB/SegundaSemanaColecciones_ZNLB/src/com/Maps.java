package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> usuarios = new HashMap <Integer, String>();
		
		//Agregar datos a mi HashMap .put(clave, valor)
 
		usuarios.put(1, "Marcos");
		usuarios.put(2, "Enrique");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Elias");
		usuarios.put(5, "Alexis");
		
		
		//Imprimir en consola un determinado valor contenido en una llave
		System.out.println(usuarios.get(5));
		
		usuarios.put(5, "Arasandi");
		System.out.println(usuarios.get(5));
		
		//Declarar un HashMap con llaves string y guardar elemenentos double
		Map<String, Double> decimales = new HashMap<String, Double>(); 
		
		decimales.put("A", 1200.59);
		decimales.put("B", 200.59);
		
		System.out.println(decimales.get("B"));
		
		//para remover un elemento .remove
		decimales.remove("B");
		
		
		
		
		
		
		
		
		
		
		
	}

}
