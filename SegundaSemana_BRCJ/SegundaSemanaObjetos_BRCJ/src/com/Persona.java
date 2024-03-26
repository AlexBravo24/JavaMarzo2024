package com;

public class Persona {

	// ABSTRACCIÓN - Definir los atributos y métodos que nos ayudaran a crear a
	// nuestros objetos

	// ATRIBUTOS
	// -Nombre, Edad, Género, Color, Nacionalidad, nivelEductaivo, etc.

	// ENCAPSULAMIENTO - Protege la información de accesos o modificaciones no
	// autorizadas
	// Modificadores de accesos - default, public, protected, pivate

	private String nombre;
	private String genero;
	private static final int edad = 30; // inmutables

	// Métodos Constructores

	// Método Constructor Vacío - Permite crear o instanciar a nuestro objeto sin
	// ningun valor
	// El constructor vacío nos funciona como un "dummie" o comodín
	public Persona() {

	}

	// Método Constructor con Parámetros - Permite iniciar nuestro objeto con
	// atributos

	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Métodos Getter y Setters - Proporcionan acceso a los atributos de nuestro
	// objeto permitiendonos asignar un valor (Setters) o recuperarlo (Getters)

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

	// Método toString - Nos sirve para visualizar la información de los atributos
	// de nuestros objetos (actua como una "Radiografia")
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}

}