package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "HoY ES 12 DE MARZO DE 2024";
		//.length() devuelve el tama�o de la cadena en valor numerico		
		System.out.println(cadena.length());
		//charAt()Nos devuelve la posicion de un caracter
		System.out.println(cadena.charAt(4));
		System.out.println(cadena.charAt(cadena.length()-6));
		
		//.substring()devuelve una sucadena a partir del indice especificado
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,21));
		
		//-toLowerCase y toUpperCase
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals
		System.out.println(cadena.equals("hoy es 12 de marzo de 2024"));
		
		//.equalsIgnoreCase
		System.out.println(cadena.equalsIgnoreCase("hoy es 12 de marzo de 2024"));
		
		//System.out.println(cadena.contentEquals("hoy es 12 de marzo de 2024"));
		

	}

}
