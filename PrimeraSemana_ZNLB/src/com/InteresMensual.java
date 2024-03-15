package com;

public class InteresMensual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 double monto = 1000;
	        double ganancia = 0.02;

	        for (int i = 1; i <= 12; i++){
	            monto = monto * (1 + ganancia);
	            System.out.println("Tu monto en el mes " + i + " es de: " + String.format("%.2f", monto));
	        }

	        System.out.println("Tu dinero al final del año es: $" + String.format("%.2f", monto));
		
		
		
		
		
		
		
		
		
	}

}
