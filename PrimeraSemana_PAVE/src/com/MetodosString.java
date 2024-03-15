package com;

public class MetodosString {
	public static void main(String [] perro) {
		//String's Methods
		
		String cadena = "Hoy es 12 de Marzo del 2024";
		
		System.out.println("Lenght: "+cadena.length());
		System.out.println("Caracter: "+cadena.charAt( cadena.length() - 6 ));
		System.out.println("Substring: "+cadena.substring(5));
		
		System.out.println("Lower Case: "+cadena.toLowerCase());
		System.out.println("Upper Case: "+cadena.toUpperCase());
		
		System.out.println("Equals: "+cadena.equals("hoy es 12 de Marzo del 2024"));
		System.out.println("Equals Ignore Case: "+cadena.equalsIgnoreCase("hoy ES 12 de marzo del 2024"));
		
		System.out.println("Content Equals: "+cadena.contentEquals("2024"));
		
		System.out.println("Replace: "+cadena.replace(" ","*"));
	}
}
