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

	// M�todos propios - acciones o funciones que nuestro objeto va a realizar

	// M�todos que no devuelven un tipo de dato (Sin retorno)
	// Ejemplo. Creamos un m�todo (Dormir) y que mande una impresi�n en consola

	public void dormir() {
		// Aqui va la l�gica de como se realiza esta acci�n
		System.out.println("Estoy durmiendo...");
	}

	// M�todos propios con retorno - Devuelven un valor del tipo de dato que "dicen"
	// devolver
	public String saludar() {
		String saludo = "Buenos D�as";
		return saludo;
	}

	// Crear un m�todo polimorfico, Saludar - puede ser con retorno o no, pero el
	// cambio radica en que el m�todo conserva
	// el mismo nombre pero se ejecuta diferente gracias a los argumentos que el
	// m�todo solicita
	public void saludar(String saludo) {
		System.out.println(saludo);
	}

	// Sobrecarga de Argumentos - son los argumentos que el m�todo solicita para
	// ejecutar sus acciones, lo que nos permite
	// tener sobre carga de m�todos (m�todos con el mismo nombre, pero que ejecutan
	// diferentes acciones)
	public void saludar(String saludo, String horario) {
		System.out.println(saludo + horario);
	}

	public void sumar(int a, int b) {
		System.out.println("La suma es: " + (a + b));
	}

	// Ejemplo de declaraci�n de un m�todo abstracto
	// Es aquel m�todo que nos dice que se va a hacer pero no c�mo se har�

	// Una clase es igual a una clase convencional pero debe contener por lo menos
	// un m�todo abstracto, tambien puede tener m�todos
	// propios
	public abstract void comer(String comida);

}