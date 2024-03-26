package com;

public class Persona {

	// ABSTRACCI�N - Definir los atributos y m�todos que nos ayudaran a crear a
	// nuestros objetos

	// ATRIBUTOS
	// -Nombre, Edad, G�nero, Color, Nacionalidad, nivelEductaivo, etc.

	// ENCAPSULAMIENTO - Protege la informaci�n de accesos o modificaciones no
	// autorizadas
	// Modificadores de accesos - default, public, protected, pivate

	private String nombre;
	private String genero;
	private static final int edad = 30; // inmutables

	// M�todos Constructores

	// M�todo Constructor Vac�o - Permite crear o instanciar a nuestro objeto sin
	// ningun valor
	// El constructor vac�o nos funciona como un "dummie" o comod�n
	public Persona() {

	}

	// M�todo Constructor con Par�metros - Permite iniciar nuestro objeto con
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

	// M�todos Getter y Setters - Proporcionan acceso a los atributos de nuestro
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

	// M�todo toString - Nos sirve para visualizar la informaci�n de los atributos
	// de nuestros objetos (actua como una "Radiografia")
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}

}