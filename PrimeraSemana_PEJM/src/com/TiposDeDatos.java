package com;

public class TiposDeDatos {
 public static void main (String [] args)
 {
	//Tipos de datos primitivos
	 
	 byte numero1;
	 
	 numero1= 127;
	 
	 byte b=120;
	 
	 short s= 32767;//2 bytes
	 int i= 2147483647;// 4 bytes
	 long l= 2147483648l;//8 bytes y necesita sufijo l
	 
	 float b1=3.1416f;
	 double b2= 3.1416043298;
	 
	 boolean avalua= true;
	 
	 char caracter= 'a';
	 
	//Tipos de datos objeto, estructurados o referenciales
	 
	 String nombre = "PAvel jimenez";
	 String numero = "123456789";
	 
	 Byte by=100;
	 Short sh=30000;
	 Integer inte= 200000000;
	 Long lo= 890273128973128L;
	 System.out.println(numero);
	 System.out.println(nombre);
	 System.out.println("la de los numeros es suma es: " +(b1+b2));
 }
}
