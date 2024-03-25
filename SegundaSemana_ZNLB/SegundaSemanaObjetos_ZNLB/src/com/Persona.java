package com;

public class Persona {

	//Abstracción- definir los atributos y métodos
	//que nos ayudaran a crear a nuestros objetos
	
	//atributos
	//ej. nombre, edad, genero, color, nacionalidad
	//NivelEducativo, etc...
	
	// Encapsulamiento - proteger la información de accesos modificaciones
	// no autorizadas
	//default, public, protected, private
	
	private String nombre;
	private String genero;
	private static final int edad = 30; //inmutables
	
	//metodos constructores
	
	//metodos constructor vacio- este nos va a permitir
	//crear o instanciar a nuestro objeto sin ningun
	//valor en sus atributos aun
	

	
	//Metodo constructor junto con sus atributos o parametros que
	//instanfciar a nuestro objeto pero ya con sus valores asignados
	//en sus atributos

	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}
	

// metodo getters and setters
	//Proporcionan acceso a los atributos de nuestro objeto
	// permitiendonos asignar un valor (|setter)
	// o recuperarlo (getter)
	
	public Persona() {
		// TODO Auto-generated constructor stub
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
	
	


	
	//metodo toString ()
	// nos sirve para visualizar la información de los atributos
	// de nuestros objetos (actua como una "radiografia")
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	
	
}
