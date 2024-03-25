package com;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a probar crear una nueva persona
		//Cuando una clase se vuelve abstracta, no podemos instanciarla
		// es decir, no podemos crear objetos de esa clase
		//Persona juan = new Persona("Juan", "Masculino", 27);
		
		//Vamos a probar a crear un nuevo empleado
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGF9776", "Desarrollador", "Matutino", 30000);
		
		//Polimorfismo de asignación
		Persona juan = new Empleado();
		
		System.out.println(juan);
		
		System.out.println(jorge);
		
		//String informacion = juan.toString();
		
		//System.out.println(informacion);
		
		//Probar llamar el método dormir a través de
		//nuestra persona juan
		
		//juan.dormir();
		
		//Probar el mismo método pero a través
		//de nuestro empleado jorge
		jorge.dormir();
		
		//Probando el método con retorno saludar
		//a través de juan
		//String hello = juan.saludar();
		
		//System.out.println(juan.saludar());
		
		//Ver como funciona el método saludar polimorfico
		jorge.saludar("Buenas tardes");
		
		//Probar el método saludar que pide dos
		//argumentos
		jorge.saludar("Buenas tardes", " son las 12:00pm");
		
		jorge.sumar(21, 7);
		
		//Puedo llamar a jorge y utilizar el método comer
		jorge.comer("Ensalada");

	}

}
