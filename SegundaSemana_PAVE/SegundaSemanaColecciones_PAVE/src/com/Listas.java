package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		//Lista = Colecccion o conjunto de elementos 
		//Admite elementos duplicados
		//Se implementa a través de la clase ArrayList
		//Se basa en un array redimensionable
		//Es de las que mejor redimiento tiene sobre la mayoria de las situaciones
		//Puede almacenar tipos de datos en común incluyendo objetos
		
		List<String> lista = new ArrayList<String>();
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("cuatro");
		lista.add("cinco");
		
		System.out.println(lista);
		System.out.println(lista.get(2));
		
		//.contains devuelte true si el elemento existe en la lista
		System.out.println(lista.contains("dos"));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Elemento: "+i+".-"+lista.get(i));
		}
		
        List<Object> elementos = new ArrayList<Object>();
		
        elementos.add("uno");
        elementos.add(2);
        elementos.add(false);
        
        for (int i = 0; i < elementos.size(); i++) {
			System.out.println("Elemento: "+i+".-"+elementos.get(i));
		}
	
	}
}