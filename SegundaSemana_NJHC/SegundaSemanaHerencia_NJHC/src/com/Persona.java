package com;

public abstract class Persona {
	
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
	}

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

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	//metodo con retorno
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	/*
	 * Metodos propios - son acciones o funcones que nuestro
	 * objeto va a realizar
	 * 
	 * Metodos que no devuelven un tipo de dato (sin retorno)
	 * 
	 * Ejemplo , creams metodo que se llame dormir
	 * y que mande una impresion  en consola
	 * 
	 */
	public void dormir() {
		//aqui va la logica de COMO se realiza esta acción
		System.out.println("Estoy durmiendo...");
		
	}
	
	/*
	 * Metodos propios con retorno- devuelven un valor del tipo de dato que 
	 * "dcen" devolver
	 */
	public String saludar () {
		String saludo = "Buenos días";
		return saludo;
		//retun null;// se usa para ponerlo como provisionalmente no regresa nada, en lo que se define que queremos ue nos regrese
	}
	
	
	/*
	 * Crear un metodo polimorfico, saludar puede ser con retorno o no
	 * pero el cambo radica en que el metodo conserva el mismo nombre
	 * pero se ejecuta diferente gracias a los argumentos que el metodo solicita
	 * 
	 */
	
	public void saludar(String saludo) {
		System.out.println(saludo);
	}
	
	//otro metodo marca erro ya que ya existen,vamos a ver sobre carga de argumentos 
	//SOBRE CARGA DE ARGUMENTOS .son los argumentos que el metodo solicita para ejecutar
	// sus acciones lo que nos permite tener sobre carga de metodos
	//significa(tener  metodos con el mismo  nombre , pero que ejecutan diferentes acciones)
	
	//sobre carga de metodos = pide mas argumentos
	public void saludar(String saludo, String horario) {
		System.out.println(saludo+ horario);
	}
	
	public void sumar(int a, int b) {
		System.out.println("La suma es: "+ (a+b));
	}
	
	//Ejemplo de declarcion de un metodo abstracto
	//es aquel metodo que nos dice QUE sa va a hacer, pero
	//no COMO SE VA a hacer
	
	//una clase abstracta es igual a una clase convencional
	//pero debe contener por lo menos un metodo abstracto
	public abstract void comer (String comida);
	
	
	
	
}
