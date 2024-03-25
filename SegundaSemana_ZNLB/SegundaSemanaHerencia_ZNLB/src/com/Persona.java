package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}
		//los void no tienen retorno de datos
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
		
	// metodos propios - son acciones o funciones que nuestro objeto a a realizar
	//metodo que no devuelven un tipo de dato (sin retonro)
	
	//Ejemplo crear un metodo que se llame dormir y que mande
//	una impresion en consola
	
	public void dormir () {
		//Aqui va la logica de como se realiza esta acción
		System.out.println("Estoy durmiendo...");
	} 
	
	//metodos propios con retorno - devuelven un valor
	//del tipo de dato que "dicen" devolver
	
	public String saludar () {
		String saludo = "Buenos dias";
		return saludo;
	}
	
	//crear un metodo polimorfico, saludar
	//puede ser con retorno o no, pero el cambio radica
	//en que el metodo conserva el mismo nombre
	//pero se ejecuta diferente gracias  a los argumentos
	// que el metodo solicita
	
	public void saludar(String saludo) {
		System.out.println("saludar");
	}
	
	//sobrecarga de argumentos
	// son los argumentos que el metodo solicita para ejecutar sus acciones
	//lo que nos permite tener sobrecarga de metodos
	//(metodos con el mismo nombre , pero se ejecutan
	// diferentes aciones)
	public void saludar(String saludo, String horario) {
		System.out.println(saludo + horario);
	}
	
	public void sumar (int a, int b) {
		System.out.println("La suma es: " +(a + b));
	}
	
	
	//ejemplo de declaracion de un metodo abstracto
	//dice que va a hacer pero no el como
	
	public abstract void comer (String comida);


	public void checarEntrada() {
		System.out.println("Entrada a als 8am");
		
	}
	
	
	
	
	
	
	
	}




