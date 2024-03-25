package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		//La interfaz Map se asocia claves a valores
		//Esta interface no puede contener claves duplicadas pero si valores duplicados
		//Cada clave puede tener asociado un valor como maximo
		//HashMap: Esta implementacion almacena las claves en una tabla
		//hash: es la que mejor rendimiento tiene en los maps, pero esto no garantiza un orden al momento de realizar iteraciones
		
		
		//Declarando un HashMap
		//El primero valor es el tipo de dato que funcionara como clave o llave (key), el segundo valor es el tipo de dato a almacenar en dicha clave
		
		Map<Integer,String> usuarios = new HashMap<Integer,String>();
		usuarios.put(1,"Sirius");
		usuarios.put(2,"Karen");
		usuarios.put(3,"Mayra");
		usuarios.put(4,"Arely");
		usuarios.put(5,"Andrea");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llave: "+i+" Valor: "+usuarios.get(i));
		}
		

		for(String i: usuarios.values()) {
			System.out.println(i);
		}
	}
}