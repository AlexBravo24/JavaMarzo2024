package com;

public class Principal {

	public static void main(String[] args) {
		// Antes de crear nuestro celular , debemos crear los objetos ue
		//formaran parte de los celulares
		
		Camara canon = new Camara("Canon", 2, 48);
		
		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);
		
		Ram kingston = new Ram("Kingston", "DDR5", 8);
		
		//AUTO atributos
		Estereo stereo1 = new Estereo("Bose", "Super bose s1 PRO", "Nuevo");
		Llantas wheels1 = new Llantas("Kumho", 13, 32, "Nuevas");
		Asientos chair1 = new Asientos("Tela", "Gris", "Seminuevos");
		
		Automovil bmw = new Automovil("BMW XM ", 2024, "Spartanburg, Estados Unidos", "XYZ-360-B", stereo1, wheels1, chair1);
		
		//----------------------------------
		//ya creados , podemos crear nuestro celular y le pasamos los valores
		//de la camara. procesador y ram
		
		Celular motorola = new Celular("Motorola", "Z2", "Negro", canon, snap, kingston);
		//mandar a imprimir en consola nuestro celular llamado motorola
		
		System.out.println(motorola);
		
		//crear un objeto ue se componga por lo menos de otros 3
		//Ej. una cmpuadora con atributos propios como color, marca, modelo
		//u ue se compone de procesador, almacenamiento, Ram
		//Ej . Auto-llantas estereo, motor

		System.out.println(bmw);
		
	}

}
