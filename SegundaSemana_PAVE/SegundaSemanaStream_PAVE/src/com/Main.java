package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// API Stream - Funcionalidad a partir de Java 8
		// Que nos va a permitir gestionar de una forma mas rapida e imperativa la informacion que tengamos
		// en nuestras colecciones de datos, las colecciones se vuelven un flujo de datos a partir del cual
		// solicitar la informacion que necesitemos 

		Stream <String> nombres = Stream.of("Carlos","Frida","Alberto","Alex")
				.filter(item -> item.contains("o"));
		
		//Filtar la informacion hacia una lista
		List<String> names = nombres.collect(Collectors.toList()); 
		
		//System.out.println(names);
		
		// Declarar lista para declarar a los objetos persona
		List<Persona> original = new ArrayList<Persona>();
		
		// Lista para recolectar informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		// Añadir elementos a la lista original
		original.add(new Persona("Pedro", "Masculino", 21));
		original.add(new Persona("Eunice", "Femenino", 32));
		original.add(new Persona("Oscar", "Masculino", 13));
		original.add(new Persona("Anaí", "Femenino", 24));
		original.add(new Persona("Jorge", "Masculino", 45));
		original.add(new Persona("Andrea", "Femenino", 16));
		original.add(new Persona("Yara", "Femenino", 37));
		original.add(new Persona("Sergio", "Masculino", 18));
		original.add(new Persona("Carmen", "Femenino", 49));
		original.add(new Persona("Isaias", "Masculino", 50));
		
		/*for(Persona i: original) {
			System.out.println(i);
		}*/
		
		//original.forEach(p -> System.out.println(p));
		
		//filtrando usando foreach
		/*for(Persona i: original) {
			if(i.getGenero().equalsIgnoreCase("masculino")) {
				filtrada.add(i);
				System.out.println(i);
			}
		}*/
		
		//filtrando por genero usando API Stream
		/*filtrada = original.stream()
				.filter(item -> item.getGenero().equalsIgnoreCase("masculino")).collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);*/
		
		//ordenando a las personas por edades ascendente
		filtrada = original.stream()
				.sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
		// contando el numero de elementos de mi lista
		System.out.println(original.stream().count());
		
		boolean alguno = original.stream().anyMatch(item -> item.getEdad() < 30);
		System.out.println(alguno);
		
		Optional <Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
	}

}
