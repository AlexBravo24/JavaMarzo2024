package com.condicionales;

import java.util.Scanner;

public class condicionales2_PAVE {

	public static void main(String[] args) {

		int number = 0;
		
		System.out.println("Digita un número: ");
		number = new Scanner(System.in).nextInt();
		
		if(number%2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

}
