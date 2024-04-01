package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{
    
	private int nOperaciones;

	public Cientifica(String marca, String modelo, String color, double precio, int nOperaciones) {
		super(marca, modelo, color, precio);
		this.nOperaciones = nOperaciones;
	}

	public int getnOperaciones() {
		return nOperaciones;
	}

	public void setnOperaciones(int nOperaciones) {
		this.nOperaciones = nOperaciones;
	}

	@Override
	public String toString() {
		return "Datos Generales\n" + super.toString()+ "\n Numero de operaciones: " + nOperaciones
				+"\n---------------------------------------";
	}

	@Override
	public void suma(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a seleccionado suma:\n"
				+ " el resultado de la suma de los numeros: "+a+" + "+b +" es: "+(a+b));
	}

	@Override
	public void resta(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a seleccionado resta:\n"
				+ " el resultado de la resta de los numeros: "+a+" - "+b +" es: "+(a-b));
	}

	@Override
	public void multiplicacion(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a seleccionado multiplicacion:\n"
				+ " el resultado de la multiplicacion de los numeros: "+a+" x "+b +" es: "+(a*b));
	}

	@Override
	public void division(double a, double b) {
		// TODO Auto-generated method stub
		if (b==0)
		{
			System.out.println("No es posible dividir entre 0 intente de nuevo con un numero diferente");
		}
		else {
		System.out.println("a seleccionado divicion:\n"
				+ " el resultado de la divicion de los numeros: "+a+" / "+b +" es: "+(a/b));
		}
	}

	@Override
	public void suma(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("a seleccionado suma:\n"
				+ " el resultado de la suma de los numeros: "+a+" + "+b +" + "+c +" es: "+(a+b+c));
	}

	@Override
	public void resta(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("a seleccionado suma:\n"
				+ " el resultado de la suma de los numeros: "+a+" - "+b +" - "+c +" es: "+(a-b-c));

	}

	@Override
	public void multiplicacion(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("\na seleccionado multiplicacion\n"
				+ " el resultado de la multiplicacion de los numeros: "+a+" x "+b +" x "+c +" es: "+(a*b*c));

	}

	@Override
	public void division() {
		int numero1;
		int numero2;
		double resultado;
		Scanner numeros = new Scanner (System.in);
		System.out.println("introduce el numero que quiere dividir: ");
		numero1= numeros.nextInt();
	    System.out.println("ingresa el valor sobre el que quiere dividir: ");
	    numero2= numeros.nextInt();
	    
	   
	    if (numero2==0)
	    {
	    	System.out.println("error, no se puede dividir entre 0");
	    }
	    else {
	    	 resultado=numero1/numero2;
	    	System.out.println("el resultado de la divicion es: " + resultado );
	    }
		
	}

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		int temperatura;
		Scanner numeros = new Scanner (System.in);
		System.out.println("introduzca su temperatura: ");
		temperatura= numeros.nextInt();
		if (temperatura==36)
	    {
	    	System.out.println("su temperatura esta correcta");
	    }
	    else 
	    	if (temperatura<36)
	    	{
		    	System.out.println("su temperatura es baja");
	    	}
	    	else 
	    	{
		    	System.out.println("su temperatura esta alta");
	    	}
	}

	

	
	}
	

