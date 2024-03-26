package com;

public class Principal {

	public static void main(String[] args) {

		// Vamos a crear una nueva persona
		// Cuando una clase se vuelve abstracta no podemos instanciarla (no podemos
		// crear objetos de esa clase)
		// Persona juan = new Persona("Juan", "Masculino", 27);

		// Vamos a crear un nuevo empleado
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGD8974", "Desarrollador", "Matutino", 30000);
		
		//Polimorfismo de Asignación
		Persona juan = new Empleado();

		// Probando el método con retorno Saludar a traves de Juan
		// System.out.println(juan.saludar());

		// System.out.println(juan);

		// Probaremos el método dormir, a traves de nuestra persona Juan
		// juan.dormir();

		// Probando el método con retorno Saludar a traves del empleado jorge
		System.out.println(jorge.saludar());

		System.out.println(jorge);

		// Probar el mismo método pero a traves de nuestro empleado Jorge
		jorge.dormir();

		// Como funciona el método Saludar polimorfico
		jorge.saludar("Hola Generación CETEQ");

		// Probamos el método Saludar que pide 2 argumentos
		jorge.saludar("Buenas tardes ", "son las 12:00 pm");

		// Probamos el método Sumar
		jorge.sumar(10, 7);

		// Podemos llamar a Jorge y utilizar al método comer
		jorge.comer(" Ensalada");

		// Crear otras dos clases, una que sea la clase padre y otra la clase hija
		// Ej. Persona, que herede a Estudiante (matricula, turno, horario, grado)
		// Ej. Vehiculo (marca, tipo, paisOrigen), que herede a Barco (motor,
		// numeroVelas)

		Calzado botas = new Calzado("Timberland", "Timberland", "Café");

		Botas timberland = new Botas("Timberland", "Timberland", "Café", "Botas", "TBL Heritage", "Antiderrapante", 6);

		System.out.println(botas);

		System.out.println(timberland);

	}

}
