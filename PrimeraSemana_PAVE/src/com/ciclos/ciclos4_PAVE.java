package com.ciclos;

public class ciclos4_PAVE {

	public static void main(String[] args) {
		
		
		System.out.println("SIMULADOR DE RELOJ");
		
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					System.out.println("HORA: "+i+":"+j+":"+j2);
				}
			}
		}

	}

}
