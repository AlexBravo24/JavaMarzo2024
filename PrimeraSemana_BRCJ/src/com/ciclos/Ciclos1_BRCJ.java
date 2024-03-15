package com.ciclos;

import java.util.Scanner;

public class Ciclos1_BRCJ {

	public static void main(String[] args) {
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		
		Scanner entrada = new Scanner(System.in);
		
        int num = 12;
                
        System.out.println("Tabla del " + num + ":");
        
        for(int i = 1; i<=10; i++){
             System.out.println(num + " * " + i + " = " + num*i);                                                     
        }

	}

}