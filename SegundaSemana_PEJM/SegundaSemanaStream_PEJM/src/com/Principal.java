package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
public static void main(String[] args) {
	//API stream - Funcionalidad a partir de java 8 
	//que nos va permitir gestionar de una forma mas
//	rapida e imperativa la informacion que tengamos 
//	en nuestras colecciones de datos
//	las colecciones se vuelven un flujo de datos apartir
//	del cual podemos solicitar la informacion que necesitamos
	
	//ejemplo del uso de Stream
	
	Stream<String> nombres= Stream.of("Pavel","Carlos", "Alex","Alberto","Oliva").filter(item -> item.contains("P"));
	
	//una vez filtramos la informacion la llevo hacia una lista
	List<String> names= nombres.collect(Collectors.toList());
	System.out.println(names);
			
	
	//declaracion de una lista para guardar a nuestros objetos persona
	
	
	List<Persona> original = new ArrayList<Persona>();
	
	// crear una lista para recolectar informacion filtrada
	
	List<Persona> filtrada = new ArrayList<Persona>();
	
    // añadir elemenos a la lista original
	
	original.add(new Persona("Pavel","Masculino",12));
	original.add(new Persona("Jorge","Masculino",32));
	original.add(new Persona("Enrique","Masculino",34));
	original.add(new Persona("Cesar","Masculino",26));
	original.add(new Persona("Eleazar","Masculino",13));
	original.add(new Persona("Alicia","Femenino",19));
	original.add(new Persona("Marcela","Femenino",76));
	original.add(new Persona("Patricia","Femenino",20));
	original.add(new Persona("Naomi","Femenino",46));
	original.add(new Persona("Sophy","Femenino",21));
	
	//imprimir la lista original en consola
	
	System.out.println(original);
	
	//recorrer lista para ver cada elemento con un ciclo for
//	
//	for (int i = 0; i < original.size(); i++) {
//		System.out.println(original.get(i));	
//	}
//	//mostrar lista usando ciclo forEach
//	for (Persona i:original)
//	{
//		System.out.println(i);
//	}
	//forEach pero ahora atravez de nuestra lista
	
	original.forEach(a -> System.out.println(a));
	
	//mostrar lista filtrada usando ciclo forEach
	for (Persona i:original)
	{
		if (i.getGenero().equalsIgnoreCase("masculino"))
		{
		filtrada.add(i);
		
		
		}
	}
	//impresion de la lista usando lamdas
	filtrada.forEach(a -> System.out.println(a));
	
//	filtrar con el API Stream a las personas del genero femenino
	filtrada = original.stream().filter(item -> item.getGenero().equalsIgnoreCase("FEMENINO")).collect(Collectors.toList());
	//otra forma de mandar a imprimir en forma de lista
	filtrada.forEach(System.out::println);
	//filtrar por edad de menor a mayor
	filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
	filtrada.forEach(a -> System.out.println(a));
	//filtrar por edad de  mayor a menor	
	filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
	//contar el numero de elementos de mi lista
	
	long conteo = original.stream().count();
	System.out.println(conteo);
	//funcion para solicitar a una varibale si algun elemento o todos cumplen con una condicion
	boolean alguno = original.stream().anyMatch(a-> a.getEdad()<30);
	System.out.println(alguno);
	// retornar un valor a una clase optional 
	// optional es una clase que nos permite manejar valores nulos, 
	//en caso de que no se encuentren
	
	Optional <Persona>menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
	System.out.println(menorEdad);
}
}
