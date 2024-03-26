package com;

public class Principal {

	public static void main(String[] args) {

		// Crear nuestro primer objeto de la clase persona con su constructor vacío
		// Clase instancia (variable u objeto) = new Clase ();

		Persona persona1 = new Persona();

		// Ejemplo - Creación de segundo objeto Persona pero con el constructor que me
		// pide los atributos desde un inicio

		Persona persona2 = new Persona("Brandon", "Masculino", 26);

		// Asignando valores a los atributos de mi persona1

		// persona1.nombre="Brandon"; -- forma incorrecta de asignar valores a los
		// atributos de nuestros objetos. Hay que protegerlos con los modificadores de
		// acceso

		// Establecemos a persona1 en el caso de su nombre
		persona1.setNombre("Brandon");

		// Ejemplo - Uso del método Get, para recuperar el nombre de persona1
		System.out.println(persona1.getNombre());

		System.out.println(persona2.getNombre());

		String nombrePersonaFavorita = persona2.getNombre();

		// Que ocurre si quiero mandar a imprimir mo objeto en consola directamente
		System.out.println(persona2);
		
		//Van a realizar 3 clases para crear 3 diferentes objetos, cada objeto que quieran modelar deben contar con por lo menos 3 atributos
		//Crean métodos constructores (vacio y con todos los parámetros)
		//Getters y Setters
		//toString()
		//Una vez creada la plantilla o clase, van a instanciar sus objetos en esta misma clase principal e instancia uno vacio, uno con todos los atributos
		//y los mandan a imprimir en consola
		
		//Ejemplo: Celular
		
		

	}

}