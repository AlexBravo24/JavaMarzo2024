package com.ciclos;

import java.util.Scanner;

public class Ciclos2_PEJM {
public static void main(String[] args) {
	int numero1;
	int numero2;
	
	Scanner mult = new Scanner (System.in);
	System.out.println("introduce el primer numero: ");
	numero1= mult.nextInt();
    System.out.println("ingresa el segundo numero: ");
    numero2= mult.nextInt();
    for (int i =0; i < numero2; i++) {
    	int e =i+1;
		System.out.println(numero1+" * "+(i+1)+ " = "+e*numero1);
	}
}
}
