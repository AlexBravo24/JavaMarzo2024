package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//vamos a probar crear 1 nueva persona 
		// cuando una clase se vuelve abstracta no se puede instanciarla
		// no podemos crear objetos de esa clase
//		Persona juan = new Persona("Juan", "Masculino", 27);
		
		//vamos a probar 1 nuevo empleado
		
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGF9776", "Desarrollador", "Matutino", 30000);
		
		Persona juan = new Empleado();
		
		
		//System.out.println(juan);
		
		//System.out.println(jorge);
		
	//.string devuelve el tipo de valor to string
		
//		String informacion = juan.toString();
//		
//		System.out.println(informacion);
		
		//probar llamar al metodo dormir atraves de
		//nuestra persona juan
		
		//juan.dormir();
		
		//probar el mismo metodo pero atraves de nuestro empleado Jorgue
		jorge.dormir();
		
		//Probando el metodo con retorno saludar atraves de Juan
		//String hello = juan.saludar();
		
		//System.out.println(juan.saludar());
		
		//vamos a ver como funciona el metodo saludar polimorfico
		jorge.saludar("buenas tardes");
		
		//Probar sobrecarga de argumentos
		jorge.saludar("Buenas tardes " , "Son las 12:00pm");
		
		jorge.sumar(10, 7);
		
		jorge.comer("Ensalada");
		
		
		//crear otras 2 clases
		// 1 clase padre y otra clase hija
		//Ej. persona que herede a estudiante(matricula, semestre, horario, grado)
		// crear clase vehiculo (marca
		
		//Ejercicios de Herencia
		//Estudiante pedro = new Estudiante("Pedro", "Masculino", 20, "Tercero", "AGN", 4345);
		
		//System.out.println(pedro);
		
		
		
		//Escuela Guerrero = new Escuela("Paco", "Masculino", 20, "Loyola", "Acapulco", "Alvarado");
		
		//System.out.println(Guerrero);
		
		
	
		
		
		
		
	}

}
