package com;

public class TiposDeDatos {
	public static void main (String [] args) {
		/*
		 * Multiples
		 * comentarios
		 * 
		 */
		byte numero1;
		numero1 = 127;
		byte b = 120;//1 bytes -128 a 127
		short s = 32767;//2 bytes
		int i = 214783647;//4 bytes
		long l = 21474836486l;//8bytes
		
		float f = 3.1416f;//4 bytes
		double d = 3.14161715632623;//8bytes
		
		boolean evalua = false;
		char caracter = ',';
		
		
		String nombre = "Jose Rolando";
		String numeros = "32323232";
		
		
		Byte by = 100;
		Short sh = 3000;
		Integer in = 2000000;
		Long lo = 90000000000L;
		Float fl = 31.22332f;
		Double du = 31.233312312;
		Character letra = 'a';
		
		by.toString();//Wrapper o envoltorio 
		//ahora las variables son capaces de utilizar metodos
		
		System.out.println("Hola mundo");
		System.out.println(nombre);
		
		//Syso+ctrl+espacio
		//sout+ctrl+espacio
		System.out.println();
		//Ejemplo de una suma de dos numeros con salida en consola
		System.out.println(11+20);
		
		int x = 11;
		int y = 20;
		System.out.println("la suma es " + (x+y));
		
	}

}
