package com;

public class Cientifica extends Calculadora implements ITermometro{
/*
 * Lo ue me interesa de esta clase es ue me permita crear objetos
 * de los cuales unicamente me interesa llamar a sus metodos
 * 
 */
	@Override
	public void suma(int a, int b) {
		System.out.println("El resultado de la suma es : "+ (a+b));
	
	}

	@Override
	public void resta(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la resta es : "+ (a-b));
	}

	@Override
	public void multiplicacion(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la multiplicacion es : "+ (a*b));
	}

	@Override
	public void division(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la division es : "+ (a/b));
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura ambiente normal");
		
	}



}
