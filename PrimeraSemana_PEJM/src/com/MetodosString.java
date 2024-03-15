package com;

public class MetodosString {
    public static void main(String[] args) 
    {
    	String cadena ="Hoy es 12 de marzo de 2024";
    	System.out.println("probando el metodo .length");
    	System.out.println( cadena.length());//.length() devuelve el conteo
    	//de caracteres que hay dentro de la cadena
    	System.out.println("probando el metodo .charAt");
    	System.out.println( cadena.charAt(25));// devuelve el caracter
    	//del numero de posicion que se establece en el metodo char.
    	System.out.println("probando el metodo .substring");
    	System.out.println( cadena.substring(4));// devuelve una subcadena 
    	//apartir del indice especificada
    	System.out.println("probando el metodo .substring");
    	System.out.println( cadena.substring(4,18));// devuelve una subcadena 
    	//apartir del indice especificada por un inicio y final
    	System.out.println("probando el metodo .toLowerCase()");
    	System.out.println( cadena.toLowerCase());//cambia todo a minuscula
    	System.out.println("probando el metodo .toUpperCase()");
    	System.out.println( cadena.toUpperCase());//cambia todo a mayuscula
    	System.out.println("probando el metodo .equals()");
    	System.out.println( cadena.equals("hoy es 12 de marzo de 2024"));
    	//compara una cadena con otra siendo exactamente igual
    	System.out.println("probando el metodo .equalsIgnoreCase()");
    	System.out.println( cadena.equalsIgnoreCase("hoy es 12 de marzo de 2024"));
    	//compara una cadena con otra ignorando el uso de mayusculas y minusculas
    	System.out.println("probando el metodo .replace()");
    	System.out.println( cadena.replace("2024", "2027"));
    	//compara una cadena con otra ignorando el uso de mayusculas y minusculas
    	
	}
}
