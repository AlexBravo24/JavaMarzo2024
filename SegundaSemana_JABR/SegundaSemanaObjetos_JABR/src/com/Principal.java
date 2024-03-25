package com;

public class Principal {

	public static void main(String[] args) {
		
		//Crear nuestro primer objeto de la clase Persona
		//con su constructor vacío
		//Clase instancia (variable u objeto) = new Clase();
		
		Persona persona1 = new Persona();
		
		//Ejemplo de crear a un segundo objeto Persona
		//pero con el constructor que me pide los atributos
		//desde un inicio
		Persona persona2 = new Persona("Juan", "Masculino");
		
		//Persona.setEdad(50);
		
		//Asignando valores  a los atributos de mi persona1 
		//que esta vacio a este momento
		
		//persona1.nombre="Alex"; -- forma incorrecta de asignar
		//valores a los atributos de nuestro objetos.
		//hay que protegerlos con los modificadores de acceso
		
		//Establecer un valor a mi persona1 (vacio)
		//en el caso de su nombre
		persona1.setNombre("Alex");
		
		//Ejemplo del uso del método Get, para recuperar el nombre
		//de persona1
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		
		//Que ocurre si quiero mandar a imprimir mi objeto
		//en consola directamente
		System.out.println(persona2);
		
		//Van a realizar 3 clases para crear 3 diferentes objetos
		//Cada objeto que quieran modelar, debe contar
		//con por lo menos 3 atributos
		//Crean métodos constructores(vacio y con todos los parametros)
		//Getters y Setters
		//toString()
		//Una vez creada la plantilla o clase, van a instanciar sus objetos
		//en esta misma clase principal
		//E instancian uno vacio, uno con todos los atributos
		//y los mandan a imprimir en consola
		
		//Ejemplo:
		//Celular
		
		Celular iPhone = new Celular();
		
		Celular samsung = new Celular("Samsung", "S23", "Black", 22000.99);
		
		iPhone.setModelo("15");
		
		System.out.println(iPhone);
		
		System.out.println(samsung);
		
		
		//Voy a mandar a imprimir a la persona1
		System.out.println(persona1);
		
		//Con modificadores static, creamos atributos o métodos
		//de clase. Aplican para todos lo objetos creados de esa clase
		//Con static aun podemos modificar el valor para todos los objetos
		//de la clase, si fuera necesario, ejemplo, actualizar un precio
		
		//Con static final, creamos valores inmutables y no pueden
		//ser modificados

	}

}
