package com;

public class Persona {
	
	//ABSTRACCION - DEFINIR LOS ATRIBUTOS Y M�TODOS
	//QUE NOS AYUDAR�N A CREAR A NUESTROS OBJETOS
	
	//ATRIBUTOS
	//EJ. nombre, edad, genero, color, nacionalidad
	//nivelEducativo, etc, etc, etc......
	
	//ENCAPSULAMIENTO - Proteger la informaci�n de accesos o 
	//modificaciones no autorizadas
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static final int edad = 30; //inmutables
	
	//M�todos Constructores
	
	//M�todo constructor vac�o - este nos va a permitir
	//crear o instanciar a nuestro objeto sin ning�n
	//valor en sus atributos inicialmente
	//Nos funciona como un "dummie" o comodin
	
	public Persona() {
		
	}

	//M�todo constructor con todos los atributos o parametros
	//Nos permite instanciar a nuestro objeto pero ya con
	//sus valores asignados en sus atributos
	
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}
	
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	

	//M�todos Getters y Setters
	//Proporcionan acceso a los atributos de nuestro objeto
	//permitiendonos asignar un valor (Setters)
	//o recuperarlo (Getters)
	
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

	

	//M�todo toString()
	//Nos sirve para visualizar la informaci�n de los atributos
	//de nuestros objetos (actua como una "radiografia")
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	

}
