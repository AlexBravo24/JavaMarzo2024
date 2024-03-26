package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// Una lista es una coleccion o conjunto de elementos
		//que admite elementos duplicados
		//se implementa a traves de la clase ArrayList
		//se basa en un array redimensionable
		//es de la qu mejor rendimiento tiene sobre la mayoria de situaciones
		
		/*
		 * puede almacenar un tipo de datos en comun incluyendo objetos
		 * 
		 * 
		 * Ejemplo de como declarar una Lista de elementos String
		 * 
		 * Estas colecciones se encuentran en el paquete java.util
		 * por lo que hay que importalas
		 * 
		 */
		List<String> lista = new ArrayList<String> ();
		
		//Ejemplo de una lista con elementos de tipo entero
		//las lista solo admiten tipos de datos estructurados (objetos)
		//List<inn> numeros = new ArrayList<int> ();// esta line nos coloca error ya que no acepta varibles de tipo int
		
		List<Integer> numeros = new ArrayList<Integer> ();
		
		//Agregar valores a una lista
		lista.add("Elias");//0
		lista.add("Jafet");
		lista.add("Arasandi");
		lista.add("Marcos"); //3
		lista.add("Rafael");
		lista.add("Elias");//5
		//Visualizar el conjunto de elementos de mi lista 
		System.out.println(lista);
		//Si uiero mostrar un elemento especifico en consola
		System.out.println(lista.get(3));
		
		// elemento .contains() - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Rafael")); //  nos da true
		
		//.indexOf - Devuelve la posicion en la ue encuentra por primeraaaa vez
		
		System.out.println(lista.indexOf("Elias")); // nos da la posicion  la primera ves ue lo encuentra ue es 0
		
		//.lasIndexOf - Devuelve el indice donde encuentra al elemento 
		//la ultima vez
		System.out.println(lista.lastIndexOf("Elias"));// nos da 5 , ya ue es el ultimo elias
		
		//.remove() - elimina al elemento mediante la posicion 
		//lista.remove(5);// elimina el ltimo elias
		//lista.remove("Elias");// elimina el primer elias
		System.out.println(lista);
		
		//el metodo System.out.println(lista.get(3).equalsIgnoreCase()marcos;// no importa si es con mayuscula o minusculas
		
		
		//conforme vamos eliminando elementos, los valores del indice
		//se van desplazando, siendo ocupados por los otros elementos
		
		//si yo quiero agregar un nuevo elemento en la posicion 3
		//el elemento que ocupa esa posicion v a ser desplazado a la siguient
		//mas no elimina o remplazado
		lista.add(3,"Enrique");
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(4,"Alexis");
		System.out.println(lista);
		
		//Mostar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//podemos declarar una lista sin parametrizar
		
		//List elementos = new ArrayList();
		
		List<Object> elementos = new ArrayList<Object>();// con esta linea se eliminan nos warning a diferencia de la linea anterior
		
		//Esto me va a permitir guardar diferentes tipos de datos en ella
		elementos.add("Alex");
		elementos.add(1200.59);
		elementos.add(true);
		
		System.out.println(elementos);
		
		
	}

}
