package com.ciclos;

public class Ciclos5_PEJM {

	public static void main(String[] args) {
		//5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
//		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		double dinero=1000;
		
		for (int i = 0; i < 12; i++) {
			dinero = (dinero+(dinero*0.02));
			System.out.println("dinero en el mes: "+(i+1)+" = "+dinero);	
		}
		
	}

}
