package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//crear nuestro primer objeto de nuestra clase persona con su constructor vacio
		//Clase instancia (variable u objeto) = new clase();
		
		Persona persona1 = new Persona();
		
		//ejemplo de crear a una segunda persona o segundo objeto persona
		//pero con el constructor que pide los atributos desde un inicio
		
		Persona persona2 = new Persona ("Juan", "Masculino");
		
//		Persona.setEdad(50);//se puede borrar
		//Asignando valores a los atributos de mi persona1
		//que esta vacio a este momento
		
//		persona1.nombre = "Alex; -- forma incorrecta de asignar valores
		// a los atributos de nuestros objetos.
		// hay que protegerlo con los modificadores de acceso
		
		// Establecer un valor a mi personal (vacio)
		// en el caso de su nombre|
		persona1.setNombre("Alex");
		
		//Ejemplo del uso del metodo get, para recuperar el nombre
		// de persona1
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		
		//que ocurre si quiero mandar a imprimir mi objeto en consola directamente
		System.out.println(persona2);
		
		// realizar 3 clases para crear 3 diferentes objetos, cada clase debe llevar
		// con por lo menos 3 atributos
		//crean metodos constructores vacios, con todos los parameteros
		//Getters and setter
		//to.string
		//Una vez creada la plantilla o clase van a instanciar sus objetos
		// en esta misma clase principal, e instancian uno vacio,
		//uno con todos los atributos y los mandan a imprimir en consola
		
		//ejemplo:
		//celular
		
		Celular iPhone = new Celular ();
		
		Celular samsung = new Celular("Samsung", "S23", "rojo", 9999);
		
		iPhone.setModelo("15");
		
		System.out.println(iPhone);
		System.out.println(samsung);
		
		//voy a mandar a imprimir a la persona2
		System.out.println(persona2);
		
		
		Teclado Logitech = new Teclado ();
		
		Teclado Eyooso =  new Teclado ("70%", "E-yooso", "Azul", 99);
		
		Logitech.setMarca("Logitech");
		
		System.out.println(Logitech);
		System.out.println(Eyooso);
		
		
		Perro Chihuahua = new Perro ();
		
		Perro Husky = new Perro("Husky", "blanco", "si", 1500);
		
		Chihuahua.setColor("Negro");
		
		System.out.println(Chihuahua);
		System.out.println(Husky);
			
		DivisionesLOL Plata = new DivisionesLOL();
		
		DivisionesLOL Hierro = new DivisionesLOL("Oro", "4", "3", 100);
		
		Plata.setHonor("2");
		Plata.setDivision("4");
		Plata.setLiga("Plata");
		
		System.out.println(Plata);
		System.out.println(Hierro);
		
		

		
		
		
		
	
		
		
		
		
		
		
	}

}
