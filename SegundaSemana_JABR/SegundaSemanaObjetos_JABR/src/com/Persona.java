package com;

public class Persona {
	
	//ABSTRACCION - DEFINIR LOS ATRIBUTOS Y MÉTODOS
	//QUE NOS AYUDARÁN A CREAR A NUESTROS OBJETOS
	
	//ATRIBUTOS
	//EJ. nombre, edad, genero, color, nacionalidad
	//nivelEducativo, etc, etc, etc......
	
	//ENCAPSULAMIENTO - Proteger la información de accesos o 
	//modificaciones no autorizadas
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static final int edad = 30; //inmutables
	
	//Métodos Constructores
	
	//Método constructor vacío - este nos va a permitir
	//crear o instanciar a nuestro objeto sin ningún
	//valor en sus atributos inicialmente
	//Nos funciona como un "dummie" o comodin
	
	public Persona() {
		
	}

	//Método constructor con todos los atributos o parametros
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

	

	//Métodos Getters y Setters
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

	

	//Método toString()
	//Nos sirve para visualizar la información de los atributos
	//de nuestros objetos (actua como una "radiografia")
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	

}
