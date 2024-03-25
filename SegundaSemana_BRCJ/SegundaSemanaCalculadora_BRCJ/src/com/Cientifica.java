package com;

public class Cientifica extends Calculadora implements ITermometro {

	@Override
	public void suma(int a, int b) {
		System.out.println("El resultado de la suma es: " + (a + b));
	}

	@Override
	public void resta(int a, int b) {
		System.out.println("El resultado de la rest es: " + (a - b));
	}

	@Override
	public void multiplicacion(int a, int b) {
		System.out.println("El resultado de la multiplicaci�n es: " + (a * b));
	}

	@Override
	public void division(int a, int b) {
		if (b == 0) {
			System.out.println("No es posible realizar la operaci�n");
		} else {
			System.out.println("El resultado de la divisi�n es: " + (a / b));
		}
	}

	public void suma(double a, double b) {
		System.out.println("El resultado de la suma es: " + (a + b));
	}

	public void resta(double a, double b) {
		System.out.println("El resultado de la rest es: " + (a - b));
	}

	public void multiplicacion(double a, double b) {
		System.out.println("El resultado de la multiplicaci�n es: " + (a * b));
	}

	public void division(double a, double b) {
		if (b == 0) {
			System.out.println("No es posible dividir entre cero");
		} else {
			System.out.println("El resultado de la divisi�n es: " + (a / b));
		}
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura ambiente normal");
	}

}
