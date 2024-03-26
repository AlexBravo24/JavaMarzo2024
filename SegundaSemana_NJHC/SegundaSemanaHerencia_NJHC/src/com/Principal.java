package com;

public class Principal {

	public static void main(String[] args) {
		//Vamos a probar crear una nueva persona
// cuando una clase se vuelve abstracta, no podemos instanciarla
		//es decir, no podemos crear objetos de esa clase 
		
	//Persona juan = new Persona("Juan","Masculino",27);
		
		//Vamos a probar a crear un nuevvo empleado
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGF9776", "Desarrollador", "Matutino", 30000);
			//POLIMORFISMO de asignacion 
		Persona juan = new Empleado();
		
		System.out.println(juan);
		
		System.out.println(jorge);
		
		//se guarda la informacion ue tiene el metodo toString de Juan en la variablle informacion
	//String informacion = juan.toString();
		
//	System.out.println(informacion);
		
		/*
		 * Probar el llamar el metodo dormir a traves de nuestra persona Juan 
		 * 
		 */
	//	juan.dormir();// se llama al metodo y imprime estoy durmiendo
		
		/*
		 * Probar el mismo metodo pero a través de nuestro empleado jorge
		 * 
		 */
		jorge.dormir(); //jorge es un empleado pero como hereda de la clase persona tambien puede hacer la misma accion y imprime estoy durmiendo como todad las personas
		
		//Probando el metodo con retorno SALUDAR a través de Juan
		//juan.saludar();// aqui solo nos devuelve el valor pero no va escribir buenos dias

		//String hello = juan.saludar();// en la variable hello se guardo el buenos dias
		//System.out.println(hello);
		
		//ooo podemos evitar las 3 linea anteriores 
		
		//System.out.println(juan.saludar());// imprime en consola buenos días
		
		
		//metodo polimorfico, veremos como finciona el metodo saludar polimorfico
		jorge.saludar("Hola buenas tardes Generacion Ceteq");
		
		//probar el metodo saludar que pide dos argumentos
		jorge.saludar("Buenas noches", " son las 11:00pm");
		
		//pedimos a jorge que haga una suma
		jorge.sumar(21, 7);
		
		/// aun podemos llamar a jorge y utilizar el metodo comer
		jorge.comer("Ensalada");
		
		//Crear otras dos clases , una que sea la clase padre y otra sea la clase hija
		//Ej. Persona, que herede a Estudiante
		//matricula, turno, horario, grado
		//Ej.Vehiculo (marca, tipo, paisOrigen)
		//Carro, Barco
		
		//
		
	}

}
