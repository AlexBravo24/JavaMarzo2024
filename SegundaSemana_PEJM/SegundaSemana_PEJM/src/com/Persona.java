package com;

public class Persona {
//ABSTRACCION 
	//DEFINIR LOS ATRIBUTOS Y METODOS QUE NOS AYUDARAN A CREAR NUESTROS OBJETOS
	//ATRIBUTOS EJ: nombre, edad , genero , color, nacionalidad 
	// nivel educativo, etc.
	private String nombre;
	private String genero;
	private int edad;
	// metodos constructores
	
	//metodo contructor vacio - este nos permite crear o instanciar 
	//a nuestro objeto sin ningun valor en sus atributos
	//funciona como comodin, por que permite iniciar a mi persona vacia con ayuda
	//de los metodos get y set adelante en el proyecto
	public Persona()
	{
		
	}
 // metodo constructor con todos los parametros declarados 
	// nos permite instanciar a nuestro objeto pero ya con 
	//sus valores asignados en sus atributos
	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}
	
	
	
	public Persona(String nombre) {
	super();
	this.nombre = nombre;
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
	@Override //metodo toString()
	//sirve para visualizar la informacion de atributos de nuestros objetos
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	

	
}

