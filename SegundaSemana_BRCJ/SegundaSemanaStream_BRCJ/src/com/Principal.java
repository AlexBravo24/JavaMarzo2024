package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		// API Stream - Funcionalidad a partir de Java 8 que nos va a permitir
		// gestionarde una forma más rápida e imperativa
		// la información que tengamos en nuestras colecciones de datos.
		// Las colecciones se vuelven un flujo de datos a partir del cual podemos
		// solicitar la información que necesitemos.

		// Ejemplo del uso de Stream
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto").filter(item -> item.contains("i"));

		// Una vez filtramos la información la llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());

		// Prueba de los resultados en consola
		// System.out.println(names);

		// Declaramos una lista para guardar a nuestros objetos Persona
		List<Persona> original = new ArrayList<Persona>();

		// Creamos una lista para recolectar la información filtrada
		List<Persona> filtrada = new ArrayList<Persona>();

		// Añadir elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucila", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));

		// Imprimir lista original en consola
		// System.out.println(original);

		// Recorrer nuestra lista para ver cada elemento con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}

		// Recuperar todos lo elementos con el ciclo forEach
//		for (Persona i : original) {
//			System.out.println(i);
//		}

		// forEach pero ahora a través de nuestra lista
		// original.forEach(a -> System.out.println(a));

		// Si filtraramos a los elemento del genero masculino con un ciclo convencional
//		for (Persona i : original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}

		// Filtrar con el API Stream a las personas del género femenino
		filtrada = original.stream().filter(item -> item.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		//Forma 1 para imprimir
//		filtrada.forEach(a -> System.out.println(a));
//		//Forma 2 para imprimir
//		filtrada.forEach(System.out::println);

//		// Ordenar a las persona por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		filtrada.forEach(System.out::println);

		// Contra el número de elementos de mi lista
		System.out.println(original.stream().count());

//		// Solicitar un vaiable booleana si algún elemento o todos los elementos cumplen
//		// alguna condición
//		boolean alguno = original.stream().allMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno);

		// Vamos a retornar un valor a una clase Optional
		// Optional es una clase que nos permite manejar valores nulos, en caso de que
		// no se encuentren
		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);

	}

}
