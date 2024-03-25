package com;

public class Cientifica extends Calculadora{
	
	@Override
	public void sumar(int n1, int n2) {
		System.out.println("SUMA ABSTRACTA: "+(n1+n2));
	}

	@Override
	public void restar(int n1, int n2) {
		System.out.println("RESTA ABSTRACTA: "+(n1-n2));
	}

	@Override
	public void multiplicar(int n1, int n2) {
		System.out.println("MULTIPLICACION ABSTRACTA: "+(n1*n2));
	}

	@Override
	public void dividir(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("Error Abstracto: No es posible dividir entre cero abstracto");
		}else {
			System.out.println("DIVISION ABSTRACTA: "+(n1/n2));
		}
	}
	
	
	public void sumar(double n1, double n2) {
		System.out.println("SUMA: "+(n1+n2));
	}

	public void restar(double n1, double n2) {
		System.out.println("RESTA: "+(n1-n2));
		
	}
	
	public void multiplicar(double n1, double n2) {
		System.out.println("MULTIPLICACION: "+(n1*n2));
		
	}

	public void dividir(double n1, double n2) {
		if(n2 == 0) {
			System.out.println("Error: No es posible dividir entre cero");
		}else {
			System.out.println("DIVISION: "+(n1/n2));
		}
	}
	

}
