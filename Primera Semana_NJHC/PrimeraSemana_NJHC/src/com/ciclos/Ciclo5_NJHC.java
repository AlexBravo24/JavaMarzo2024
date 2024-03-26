package com.ciclos;

public class Ciclo5_NJHC {

	public static void main(String[] args) {
		/*
		 * Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
		 * ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		 */

		 float inversion = 1000;
	        
	        for (int i = 1; i <= 12; i++) {
	        	inversion = (inversion+(inversion*0.02f));
	        	 System.out.println(" MES "+ i + " = $ " + inversion);
	        }
	        System.out.println("Si invierte 1000 y reinvierte sus intereses mensuales obtendra un total de : $" + inversion + " Pesos");
	       
		//\n
	}// cierre del metodo main

	   
}// cierre de la clase Ciclos
