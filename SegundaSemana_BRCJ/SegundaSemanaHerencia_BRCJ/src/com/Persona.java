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
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}

	// Métodos propios - acciones o funciones que nuestro objeto va a realizar

	// Métodos que no devuelven un tipo de dato (Sin retorno)
	// Ejemplo. Creamos un método (Dormir) y que mande una impresión en consola

	public void dormir() {
		// Aqui va la lógica de como se realiza esta acción
		System.out.println("Estoy durmiendo...");
	}

	// Métodos propios con retorno - Devuelven un valor del tipo de dato que "dicen"
	// devolver
	public String saludar() {
		String saludo = "Buenos Días";
		return saludo;
	}

	// Crear un método polimorfico, Saludar - puede ser con retorno o no, pero el
	// cambio radica en que el método conserva
	// el mismo nombre pero se ejecuta diferente gracias a los argumentos que el
	// método solicita
	public void saludar(String saludo) {
		System.out.println(saludo);
	}

	// Sobrecarga de Argumentos - son los argumentos que el método solicita para
	// ejecutar sus acciones, lo que nos permite
	// tener sobre carga de métodos (métodos con el mismo nombre, pero que ejecutan
	// diferentes acciones)
	public void saludar(String saludo, String horario) {
		System.out.println(saludo + horario);
	}

	public void sumar(int a, int b) {
		System.out.println("La suma es: " + (a + b));
	}

	// Ejemplo de declaración de un método abstracto
	// Es aquel método que nos dice que se va a hacer pero no cómo se hará

	// Una clase es igual a una clase convencional pero debe contener por lo menos
	// un método abstracto, tambien puede tener métodos
	// propios
	public abstract void comer(String comida);

}