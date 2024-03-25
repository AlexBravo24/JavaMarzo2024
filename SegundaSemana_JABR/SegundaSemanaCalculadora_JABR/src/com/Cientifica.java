package com;

public class Cientifica extends Calculadora implements ITermometro{
	
	//Lo que me interesa de esta clase es que
	//me permita crear objetos de los cuales
	//unicamente me interesa llamar a sus métodos

	@Override
	public void sumar(int a, int b) {
	System.out.println("El resultado de la suma es: " + (a+b));
		
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("El resultado de la resta es: " + (a-b));
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de la multiplicacion es: " + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("El resultado de la division es: " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
	System.out.println("Temperatura ambiente normal");
		
	}

	

}
