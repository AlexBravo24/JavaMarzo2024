package com;

public class Principal {

	public static void main(String[] args) {

		// Crear nuestro primer objeto de la clase persona con su constructor vacío
		// Clase instancia (variable u objeto) = new Clase ();

		Persona persona1 = new Persona();

		// Ejemplo - Creación de segundo objeto Persona pero con el constructor que me
		// pide los atributos desde un inicio

		Persona persona2 = new Persona("Brandon", "Masculino");

		// Persona.setEdad(50);

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

		// Van a realizar 3 clases para crear 3 diferentes objetos, cada objeto que
		// quieran modelar deben contar con por lo menos 3 atributos
		// Crean métodos constructores (vacio y con todos los parámetros)
		// Getters y Setters
		// toString()
		// Una vez creada la plantilla o clase, van a instanciar sus objetos en esta
		// misma clase principal e instanciar uno vacio, uno con todos los atributos
		// y los mandan a imprimir en consola

		// Ejemplo: Celular

		Celular iphone = new Celular();

		Celular samsung = new Celular("Samsung", "S23", "Negro", 22000.99);

		iphone.setModelo("15");

		System.out.println(iphone);

		System.out.println(samsung);

		// Ejercicio 1 : Computadoras

		Computadoras hp = new Computadoras();

		Computadoras lenovo = new Computadoras("Lenovo", "ThinkPad E16", "Negra", 1, 12, 24999.99);

		hp.setModelo("HP 15-fb0122la");
		hp.setColor("Plateado");

		System.out.println(hp);

		System.out.println(lenovo);

		// Ejercicio 2 : Tenis

		Tenis nike = new Tenis();

		Tenis adidas = new Tenis("Adidas", "Postmove Mid", "Blancos", 6, 1799);

		nike.setMarca("Nike");
		nike.setColor("Negro");

		System.out.println(nike);

		System.out.println(adidas);

		// Ejercicio 3 : Televisiones

		Televisores philips = new Televisores();

		Televisores lg = new Televisores("LG", "ThinQ AI 55QNED80SRA", "QNED", 55, 13999);

		philips.setMarca("Philips");
		philips.setModelo("Serie 8000");
		philips.setTipo_pantalla("LED");
		philips.setPulgadas(55);
		philips.setPrecio(8000);

		System.out.println(philips);
		System.out.println(lg);

		// Mandamos a imprimir a persona1
		System.out.println(persona1);

		// Con modificadores Static, creamos atributos o métodos de clase, aplican para
		// todos los objetos creados de esa clase y aún podemos modificar el valor
		// para todos los objetos de la clase, si fuera necesario
		// Con Static final creamos valores inmutables y no pueden ser modificados
	}

}