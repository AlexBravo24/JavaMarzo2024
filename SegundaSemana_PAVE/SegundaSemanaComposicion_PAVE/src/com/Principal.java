package com;

public class Principal {
	
	public static void main(String args[]) {
		Camara canon = new Camara("Canon",2,48);
		
		Procesador snap = new Procesador("AmLogic","Snapdragon",3.5);
		
		Ram kingston = new Ram("Kingston","DDR5",8);
		
		Celular motorola = new Celular("Motorola","Z2","Negro",canon,snap,kingston);
		System.out.println(motorola);
	}
}
