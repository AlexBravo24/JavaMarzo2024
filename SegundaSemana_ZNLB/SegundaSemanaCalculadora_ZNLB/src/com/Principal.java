package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	       Cientifica calculadoraCientifica = new Cientifica();

	       System.out.println("Ingrese el primer número: ");
	       int num1 = scanner.nextInt();

	       System.out.println("Ingrese el segundo número: ");
	       int num2 = scanner.nextInt();

	       
	        System.out.println("Suma: " + calculadoraCientifica.sumar(num1, num2));
	        
	        System.out.println("Resta: " + calculadoraCientifica.restar(num1, num2));
	        
	        System.out.println("Multiplicación: " + calculadoraCientifica.multiplicar(num1, num2));
	        
	        System.out.println("División: " + calculadoraCientifica.dividir(num1, num2));

	       //Testing
//	        System.out.println("Suma adicional: " + calculadoraCientifica.sumar(num1, num2, 5));
//	        System.out.println("Resta adicional: " + calculadoraCientifica.restar(num1, num2, 3));
//	        System.out.println("Multiplicación adicional: " + calculadoraCientifica.multiplicar(num1, num2, 2));
//	        System.out.println("División adicional: " + calculadoraCientifica.dividir(num1, num2, 4));

	        scanner.close();
	    }
	}

	abstract class Calculadora {
	    // Atributos
	    protected String marca;
	    protected String color;
	    protected String modelo;

	    // Constructores
	    public Calculadora() {}

	    public Calculadora(String marca, String color, String modelo) {
	        this.marca = marca;
	        this.color = color;
	        this.modelo = modelo;
	    }

	    // Getters y Setters
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    @Override
	    public String toString() {
	        return "Calculadora{" +
	                "marca='" + marca + '\'' +
	                ", color='" + color + '\'' +
	                ", modelo='" + modelo + '\'' +
	                '}';
	    }


	    
	    
	    public abstract int sumar(int a, int b);
	    public abstract int restar(int a, int b);
	    public abstract int multiplicar(int a, int b);
	    public abstract int dividir(int a, int b);
	}

	class Cientifica extends Calculadora {
		
		
		
	    //Source Construc
	    public Cientifica() {}

	    public Cientifica(String marca, String color, String modelo) {
	        super(marca, color, modelo);
	    }

	    //Abstractos
	    @Override
	    public int sumar(int a, int b) {
	        return a + b;
	    }

	    @Override
	    public int restar(int a, int b) {
	        return a - b;
	    }

	    @Override
	    public int multiplicar(int a, int b) {
	        return a * b;
	    }

	    @Override
	    public int dividir(int a, int b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            throw new IllegalArgumentException("No se puede dividir por cero. ");
	        }
	    }

	    // Int
	    public int sumar(int a, int b, int c) {
	        return a + b + c;
	    }
	    
	    public int restar(int a, int b, int c) {
	        return a - b - c;
	        
	    }
	    public int multiplicar(int a, int b, int c) {
	        return a * b * c;
	    }
	    

	    public int dividir(int a, int b, int c) {
	        if (b != 0 && c != 0) {
	            return a / b / c;
	        } else {
	            throw new IllegalArgumentException("No se puede dividir por cero.");
	        }
		
		
		
		
		
		
		
		
	}

}
