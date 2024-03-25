package com;

public class Principal {

	public static void main(String[] args) {
		
		//Antes de crear nuestro celular, debemos crear
		//los objetos que formaran parte de los celulares
		
		Camara canon = new Camara("Canon", 2, 48);
		
		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);
		
		Ram kingston = new Ram("Kingston", "DDR5", 8);
		
		//Ahora si ya podemos crear nuestro celular y le pasamos los valores
		//de la camara, procesador y ram
		
		Celular motorola = new Celular("Motorola", "Z2", "Negro", canon, snap, kingston);
		
			
		//Mandar a imprimir en consola nuestro celular
		System.out.println(motorola);
		
		//Crear un objeto que se componga por lo menos de otros 3
		//Ej. Una computadora, con atributos propios como color, marca, modelo
		//y que se compone de Procesador, Almacenamiento y Ram
		//Ej. Auto - Llantas, Estereo, Motor

	}

}
