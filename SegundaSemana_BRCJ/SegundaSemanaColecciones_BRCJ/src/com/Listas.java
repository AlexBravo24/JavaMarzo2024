package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		// Una lista es una colección o conjunto de elementos que admite elementos
		// duplicados.
		// Se implemente a través de la clase ArrayList
		// Se basa en un array redimensionable
		// Es de las que mejor rendimiento tiene sobre la mayoria de situaciones
		// Puede almacenar un tipo de dato común incluyendo objetos

		// Ej. como declarar una lista de elementos String
		// Estas colecciones se encuentran en el paquete java.util por lo que hay que
		// importarlas

		List<String> lista = new ArrayList<String>();

		// Ejemplo de una lista con elementos de tipo entero
		// Las listas solo admiten tipos de datos estructurados (Objeto)
		List<Integer> numeros = new ArrayList<Integer>();

		// Agregar valores a una Lista
		lista.add("Brandon");
		lista.add("Liliana");
		lista.add("Jorge");
		lista.add("Sebastian");
		lista.add("Rosendo");
		lista.add("Brandon");

		// Visualizar el conjunto de elementos de mi lista
		System.out.println(lista);

		// Si quiero mostrar un elemento especifico de mi lista
		System.out.println(lista.get(3));

		// .contains() - Devuelve true si el elemento existe en la lista
		System.out.println(lista.contains("Brandon"));

		// .indexOf() - Devuelve la posicion en la que encuentra por primera vez a mi
		// elemento
		System.out.println(lista.indexOf("Brandon"));

		// .lastIndexOf() - Devuelve el indice donde encuentra al elemento la ultima vez
		System.out.println(lista.lastIndexOf("Brandon"));

		// .remove() - Elimina al elemento mediante la posición u objeto pero lo elimina
		// solo la primera vez
		lista.remove(3);
		System.out.println(lista);

		// Conforme vamos eliminando elementos, los valores del indice se van
		// desplazando
		lista.remove(3);
		System.out.println(lista);

		// Si yo quiero agregar un nuevo elemento en la posición 3
		// El elemento que ocupa esa posición sera desplazado a la siguiente posición
		lista.add(3, "Enrique");
		System.out.println(lista);

		// Reemplazar el valor de una determinada posición
		lista.set(4, "Alexis");
		System.out.println(lista);

		// Mostrar todos los valores de forma individual
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Podemos declarar una lista sin parametrizar
		//List elementos = new ArrayList();
		List<Object> elementos = new ArrayList<Object>();

		// Esto me va a permitir guardar diferentes tipos de dato en ella
		elementos.add("Brandon");
		elementos.add(1200.59);
		elementos.add(true);

		System.out.println(elementos);

	}

}
