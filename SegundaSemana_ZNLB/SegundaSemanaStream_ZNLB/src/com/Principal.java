package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Api stream- funcionalidad a partir de java 8
		// que nos va a permitir gestionar de una forma más
		// rápida e imperativa la información que tengamos
		//en nuestra colecciones de datos
		
		//ejemplo
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alberto")
		.filter(item -> item.contains("i"));
		
		System.out.println(nombres);
		//Una vez filtramos la información la llevo hacia una lista
		List <String> names = nombres.collect(Collectors.toList());
		
		//Mostrar resultados en consola
		System.out.println(names);
		
		//Declaramos una lista para guardar nuestros objetos Persona
		List <Persona> original = new ArrayList <Persona>();
		
		//creamos una lista para recolectar informacion fallida
		List <Persona> filtrada = new ArrayList <Persona>();
		
		//agregar elementos a mi lista original
		original.add(new Persona("Jorge", "Masculino", 37));
		original.add(new Persona("Alicia", "Femenino", 25));
		original.add(new Persona("Cesar", "Masculino", 27));
		original.add(new Persona("Mauricio", "Masculino", 30));
		original.add(new Persona("Guadalupe", "Femenino", 25));
		original.add(new Persona("Lucina", "Femenino", 26));
		original.add(new Persona("Raul", "Masculino", 27));
		original.add(new Persona("Sergio", "Masculino", 38));
		original.add(new Persona("Gabriela", "Femenino", 22));
		original.add(new Persona("Rafael", "Masculino", 24));
		
		System.out.println(original);
		
		//recorrer nuestra lista para ver cada elemento con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			}
		
		//recuperrar todos lo elementos con el ciclo forEach
//		for (Persona i : original) {
//			System.out.println(i);
//		}
//		
//		//for each pero ahora atraves de nuestra lista
//		original.forEach(a -> System.out.println(a));
		
		
		//si filtraramos a los elementos de genero masculino 
		//con un ciclo convencional
//		for (Persona i: original) {
//			if (i.getGenero().equals("Masculino")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//			
//		}
		
		//filtrar con el API stream a las personas del genero femenino
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("Femenino"))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(a -> System.out.println(a));
		
		//ordenar a las personas por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);
//		
		System.out.println(original.stream().count());
		
//		long conteo = original.stream().count();
//		
//		System.out.println(conteo);
//		
		//solicitar una variable boolean si algun elementoo todos
		//los elementos cumplen alguna condicion
		
//		boolean alguno = original.stream().allMatch(a -> a.getEdad() <30);
//		
//		System.out.println(alguno);
		
		//Retornoar una valor  auna clase opcional
		
		Optional <Persona> menorEdad = original.parallelStream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
		
	}

}
