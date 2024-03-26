package com;

public class Persona {

	//ABSTRACCION -DEFINIR LOS ATRIBUTOS Y METODOS UE NOS AYUDARAN A CREAR A NUESTROS OBJETOS
	
	//ATRIBUTOS
	//Ej. nombre, edad, genero, color, nacionalidad nivelEducativo, etc,etc,etc ...
	
	//ENCAPSULAMIENTO- Proteger la informacion de accesos o modificaciones no autorizadas
		//default, public, protected,private
		
//	String nombre;
//	String genero;
//	int edad;
	
//	private String nombre;
//	private String genero;
//	private int edad;
	
	private String nombre;
	private String genero;
	private static final int edad = 30;// se convierte el dato en inmutables para todos los objetos persona
	
	
	//Metodos constructores
	
	//Metodo constructor vacio - este nos va a permitir crear o instanciar a nuestro objeto sin ningun
	//valor en sus atributos aun 
	
	//El constructir vacio funciona como un "dummie" o comodin
	
	public Persona () {
				
		
	}
	//METODO CONSTRUCTOR CON TODOS LOS PARAMETROS
	//Nos permite insanciar a nuestro objeto pero ya con sus valores asignados en sus atributos
	
	//constructor con los argumentos
	
	//como se convierte el dato en inmutables creamos otro constructor con todos los parametros
//	public Persona(String nombre, String genero, int edad) {
//		super();
//		this.nombre = nombre;
//		this.genero = genero;
//		this.edad = edad;
//	}
	//nuevo constructor
	// el cual ya solo me deja crear personar con los atributos nombre y genero
	//por ue la edad ya fue decarada
	public Persona(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}
	
	
	
/// constructur para solo generar personas unicamente con sus nombres
 
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
	
	//Metodos Getters y Setters proporcionan acceso a los atributos
	//de nuestro objeto permitiendonos asignar un valor en (setters)
	//o recuperarlo (getter)

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


	//public void setEdad(int edad) {
	//	this.edad = edad;
	//}
	//ahora que la variable es statica generaremos ya no se puede 
	
	
//	public static void setEdad(int edad) {
//		Persona.edad = edad;
//	}// eliminamos el setEdad ya ue la edad ya fue definida  tener ya ue es inmutable el dato ya esta definida 

	//Metodo toString()
	//Nos sirve para visualizar la informacion de los atributos de nuestros objetos
	// actua como una "radiograpia " y ya no salga-----> com.Persona@15db9742 al imprimir -> System.out.println(persona2);
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}

	
	
	
	
	
	
}
