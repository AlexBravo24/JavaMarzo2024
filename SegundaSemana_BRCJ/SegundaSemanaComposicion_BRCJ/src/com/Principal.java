package com;

public class Principal {

	public static void main(String[] args) {

		// Antes de crear nuestro celular debemos crear nuestros objetos que formaran
		// parte de los celulares

		Camara canon = new Camara("Canon", 2, 48);

		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);

		Ram kingston = new Ram("Kingston", "DDR5", 8);

		// Ahora si podemos crear nuestro Celular y pasamos los valores de Camara,
		// Procesador y Ram

		Celular motorola = new Celular("Motorola", "Z2", "Negro", canon, snap, kingston);

		// Mandamos a imprimir en consola
		System.out.println(motorola);

		// Crear un objeto que se componga de por lo menos otros 3 objetos
		// Ej. Computadora, con atributos propios como color, marca, modelo
		// y que se compone de Procesador, Almacenamiento y Ram

		Motor tce = new Motor("TCe 110", 115, "Manual", 1.6, "Gasolina");

		Llantas michelin = new Llantas("Michelin", "Primacy 4+", 16, "195/55R6");

		Estereo pioneer = new Estereo("Pioneer", "DMH-241EX", 7, "Bluetooth y USB", "Pantalla Táctil");

		Auto renault = new Auto("Renaul", "Kangoo", "Blanco", 5, "tela", tce, michelin, pioneer);
		
		System.out.println(renault);

	}

}