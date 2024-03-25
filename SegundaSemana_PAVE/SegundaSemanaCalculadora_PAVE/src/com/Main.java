package com;

public class Main {
	
	public static void main(String args []) {
		Cientifica royal = new Cientifica();
		
		System.out.println("OPERACIONES ABSTRACTAS");
		royal.sumar(10, 5);
		royal.restar(10, 5);
		royal.multiplicar(10, 5);
		royal.dividir(10,0);
		System.out.println("OPERACIONES NORMALES");
		royal.sumar(10.0, 5.0);
		royal.restar(10.0, 5.0);
		royal.multiplicar(10.0, 5.0);
		royal.dividir(10.0, 5.0);
		
	}
}
