package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();
		
		//ejemplo de una lista con elementos de tipo entero
		
		//las listas solo admiten tipos de datos estructurados (objeto)
		List<Integer> numeros = new ArrayList <Integer>();
		
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marco");
		lista.add("Rafael");
		lista.add("Elias");
		
		//visualizar el conjunto de elementos de mi lista
		System.out.println(lista);
		
		//si quiero mostrar un elemento especifico en consola
		System.out.println(lista.get(3));
		
		//.contains () - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//.indexOF-  devuelve la posicion en la que se encuentra por primera vez a elias
		System.out.println(lista.indexOf("Elias"));
		
		//.lastIndexOf- devuelve el indice donde encuentra el elemento por ultima vez
		System.out.println(lista.lastIndexOf("Elias"));
		
		//.remove() elimina el elemento mediante la posicion o mediante el objeto 
		lista.remove(3);
		System.out.println(lista);
		
		lista.remove(3);
		System.out.println(lista);
		
		//si yo quiero agregar un nuevo elemento en la posicion 3
		//el elemento que ocupaba es desplazado a la siguiente mas no eliminado o remplazado
		lista.add(3,"Enrique");
		System.out.println(lista);
		
		lista.set(4, "Alexis");
		System.out.println(lista);
		
		//mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//podemos declara una lista sin parametrizar
		List <Object> elementos = new ArrayList<Object>() ;
		
		//Esto me va a permitir guardar diferentes tipos de datos
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
		
		
	}

}
