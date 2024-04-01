package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//una lista es una coleccion o conjunto de elementos
//que adminte elementos duplicados
//se implementa a traves de la clase arrayList
//se basa en un array redimensionable 
//de de las que mejor rendimiento tiene sobre la mayoria de situaciones
		
		//ejemplo de como declarar una lista de elementos String
		//estas colecciones se encuentran en el paquete java.util
		//por lo que hay que importarlas
		
		List<String> lista = new ArrayList<String>();
		//ejemplo de una lista con elementos de tipo entero 
		//en vez de usar variable de tipo primitivo int 
		//usamos tipos de dato estructurado, es decir de tipo
		//objeto
		List<Integer> numeros = new ArrayList<Integer>();
		//Agregar valores a una lista
		lista.add("Elias");
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos");
		lista.add("Rafael");
		lista.add("Elias");
		
		//visualizar conjunto de elementos de mi lista
		System.out.println(lista);
		
		//si quiero mostrar un elemento especifico en consola
		System.out.println(lista.get(3));
		
		//.contains()- devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael"));
		
		//indexOf - devuelve la posicion en la que encuentra por primera vez 
		//al elemento
		System.out.println(lista.indexOf("Elias"));
	    //indexOf - devuelve la posicion en la que encuentra por ultima vez 
		//al elemento
		System.out.println(lista.lastIndexOf("Elias"));
		//.remove - elimina al elemento de la posicion
		lista.remove("Elias");
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
		lista.add(2,"Enrique");
		System.out.println(lista);
		lista.set(4,"oli");
		//mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		//podemos declarar una lista sin parametrizar los tipos de datos
		//a utlizar unicamente con el tipo Object
		List<Object> elementos = new ArrayList<Object>();
		elementos.add("alex");
		elementos.add(12.821712);
		elementos.add(true);
		
		System.out.println(elementos);
	}

}
