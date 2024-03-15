package com.condicionales;

import java.util.Scanner;

public class condicionales7_PAVE {

	public static void main(String[] args) {
		
		int cara = 0;
		
		System.out.println("Digita la cara obtenida: ");
		cara = new Scanner(System.in).nextInt();
		
		switch (cara) {
		case 1:
			System.out.println("Cara Opuesta de "+cara+ " es: 6");
			break;
		case 2:
			System.out.println("Cara Opuesta de "+cara+ " es: 5");
			break;
		case 3:
			System.out.println("Cara Opuesta de "+cara+ " es: 4");
			break;
		case 4:
			System.out.println("Cara Opuesta de "+cara+ " es: 3");
			break;
		case 5:
			System.out.println("Cara Opuesta de "+cara+ " es: 6");
			break;
		case 6:
			System.out.println("Cara Opuesta de "+cara+ " es: 1");
			break;
		default:
			System.out.println("ERROR: El dado solo tiene 6 caras :v");
			break;
		}
	}

}
