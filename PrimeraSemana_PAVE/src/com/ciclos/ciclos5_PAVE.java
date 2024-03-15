package com.ciclos;

public class ciclos5_PAVE {

	public static void main(String[] args) {
		double ahorro = 1000;
		int interes = 2;
		
		System.out.println("/**********  CAJITA DE AHORRO NU :3  **********/");
		System.out.println("Si desea invertir $1000.00 con un rendimiento mensual del "+interes+"%");
		System.out.println("Su dinero crecera de la siguiente manera");
		System.out.println("----- SIMULANDO INTERES COMPUESTO -----");
		for (int i = 1; i <= 12 ; i++) {
			System.out.print("MES "+i+" - ");
			ahorro += (ahorro*interes)/100;
			System.out.printf("Ganancias: $%.2f", ahorro );
			System.out.println();
		}
		System.out.printf("FIN DE AÑO: $%.2f", ahorro );
	}

}
