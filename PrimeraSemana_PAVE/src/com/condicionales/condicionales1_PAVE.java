package com.condicionales;

import java.util.Scanner;

public class condicionales1_PAVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Digita el n�mero 1: ");
		n1 = read.nextInt();
		System.out.println("Digita el n�mero 2: ");
		n2 = read.nextInt();
		
		if(n1>n2) {
			System.out.println("El n�mero "+n1+" es mayor que "+n2);
		}else if(n1<n2) {
			System.out.println("El n�mero "+n2+" es mayor que "+n1);
		}else {
			System.out.println("El n�mero "+n1+" es igual que "+n2);
		}
	}

}
