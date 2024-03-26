package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	public static void main(String[] args) {
		/* API Stream - Funcionalidad a partir de Java 8
			Que nos va a permitir gestionar de una forma mas rapida e imperativa la informacion que tengamos
			en nuestras colecciones de datos, las colecciones se vuelven un flujo de datos a partir del cual
		 * solicitar la informacion que necesitemos
		*/  

		//Ejemplo de el uso de Stream
		Stream <String> nombres = Stream.of("Carlos","Frida","Alberto","Alex")
				.filter(item -> item.contains("o"));
		//una vez filtramos la informacion la llevo hacia una lista
		
		//Filtar la informacion hacia una lista
		List<String> names = nombres.collect(Collectors.toList()); 
		
		//System.out.println(names);// imprime la lista llamada nombres que contenga la letra indicada o
		
		// Declarar lista para declarar a nuestros  objetos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		// creamos una lista para recolectar informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		// Añadir elementos a la lista original
		original.add(new Persona("Jorge", "Masculino", 37));
		original.add(new Persona("Alicia", "Femenino", 25));
		original.add(new Persona("Cesar", "Masculino", 27));
		original.add(new Persona("Mauricio", "Masculino", 30));
		original.add(new Persona("Guadalupe", "Femenino", 25));
		original.add(new Persona("Lucia", "Femenino", 26));
		original.add(new Persona("Raul", "Masculino", 27));
		original.add(new Persona("Sergio", "Masculino", 38));
		original.add(new Persona("Gabriela", "Femenino", 22));
		original.add(new Persona("Rafael", "Masculino", 24));
		
		//System.out.println(original);  // mandar a imprimir mi lista original en consola pero en una sola linea sin salto de linea
		
		/*for(int i = 0; i< original.size(); i++) {// recorrer nuestra lista para ver cada elemento con un ciclo for
			System.out.println(original.get(i));  
		}*/
		
		//Recuperar todos los elementos con el ciclo forEach
/*		for(Persona i: original) {
			System.out.println(i);
*/		
			//forEach pero ahoraa a traves de nuestra lista
			//original.forEach(a -> System.out.println(a));
		
		
		//filtrando a los elementos del genero masculino con un ciclo convencional
	/* 	for(Persona i: original) {
			if(i.getGenero().equals("masculino")) {
				filtrada.add(i);
				System.out.println(i);
		}
	}
	*/
		
		/*for(Persona i: original) {
			if(i.getGenero().equalsIgnoreCase("masculino")) {
				filtrada.add(i);
				System.out.println(i);
			}
		}*/
		
		//filtrando por genero usando API Stream a las personas del genero femenino
		/*filtrada = original.stream()
				.filter(item -> item.getGenero().equals("Femenino"))
				.collect(Collectors.toList());
		
		filtrada.forEach(a -> System.out.println(a));// primera forma de manda todos los elementos femenino
		filtrada.forEach(System.out::println);// segunda forma de imprime todos los elementos
		
		//filtrando por genero usando API Stream a las personas del genero masculino
		/*filtrada = original.stream()
				.filter(item -> item.getGenero().equalsIgnoreCase("masculino")).collect(Collectors.toList());
		filtrada.forEach(System.out::println);*/
		
		
		//ordenando a las personas por edades ascendente
		filtrada = original.stream()
				.sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
		// contando el numero de elementos de mi lista  = 10
		System.out.println(original.stream().count());
		
		//solicitat una variable boolean si algun elemento o todos los elementos cumplen alguna condicio imprime valor true
		boolean alguno = original.stream().anyMatch(a -> a.getEdad() < 30);
		System.out.println(alguno);
		
		
		/*boolean alguno = original.stream().allMatch(a -> a.getEdad() < 30);
		System.out.println(alguno);
		*/
		//Retornar un valor a una clase Optional
		/*
		 * Optional es una clase que nos permite manejar valores nulos, en caso de que ni se encuentren
		 */
		Optional <Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}

}
