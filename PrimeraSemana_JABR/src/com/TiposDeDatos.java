package com;

public class TiposDeDatos { //Apertura de la clase

	public static void main (String [] args) { //Apertura del main
		//Comentarios de una sola linea
		//Los cuales no interfieren con
		//la ejecución del codigo
		
		/*Comentarios
		 * de
		 * multiples
		 * lineas
		 * Y el comentario
		 * se va ampliando conforme demos
		 * saltos
		 * de
		 * linea
		 * 
		 * El método main es el método principal
		 * que nos permite ejecutar nuestra clase o programa
		 * y es el punto de entrada o salida de datos
		 */
		//CTRL + S para guardar los cambios en el codigo
		
		//TIPOS DE DATOS
		//NUMERICOS ENTEROS
		
		//Ejemplo de una declaracion de variable
		//sin valor asignado
		byte numero1;
		
		//Posteriormente puedo guardar un valor en dicha variable
		numero1 = 127;
		
		//Ejemplo de declaracion de variables
		//con valor asignado inicialmente
		byte b = 120; //1 byte -128 a 127
		short s = 32767; //2 bytes
		int i = 2147483647; //4 bytes
		long l = 2147483648L; //8 bytes y necesitan del sufijo L para
		//admitir los valores más alla de los int
		
		//El tipo de dato más utilizado o comodin son los de tipo int
		
		//TIPOS DE DATOS PRIMITIVOS
		//NUMÉRICOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		
		float f = 3.1416F; //4 bytes y necesitan el sufijo F para
		//guardar los valores
		double d = 3.1416178738283798; //8 bytes de memoria
		
		//El tipo de dato más utilizado para decimales es el tipo double
		
		//TIPOS DE DATOS PRIMITIVOS
		//Boolenanos
		//Caracter
		
		boolean evalua = false; //Solo admiten valores true o false
		//y son utiles para evaluar expresiones o condiciones
		
		char caracter = ','; //Puede almacenar solo un caracter
		// y se almacena entre comilla simple
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//TIPOS DE DATOS OBJETO, ESTRUCTURADOS O REFERENCIALES
		
		//Los tipos de dato objeto inician con letra mayuscula
		//porque provienen de clases
		
		//String - cadenas de texto
		String nombre = "Jorge Alejandro";
		
		String numeros = "129000";
		
		//Tipos de dato envoltorio
		//Son clases que "envuelven" a los primitivos
		//para otorgarles ciertas funcionalidades
		
		Byte by = 100;
		Short sh = 30000;
		Integer in = 20000000;
		Long lo = 900000000000L;
		Float fl = 31.898909F;
		Double du = 31.8988677;
		Character letra = 'a';
		
		by.toString(); //Gracias a los tipo wrapper o envoltorio
		//ahora ls variables son capaces de utilizar métodos
		
		//Darle salida  a nuestros datos en consola
		//System.out.println da un salto de linea
		System.out.println("Hola mundo");
		//System.out.print imprime los valores en la misma linea
		System.out.print(nombre);
		
		//Syso + ctrl + espacio 
		//sout + ctrl + espacio
		//Escribe la linea System.out.println mas facilmente
		System.out.println();
		
		//Ejemplo de una suma de dos numeros con salida en consola
		System.out.println(11+20);
		
		int x = 11;
		int y = 20;
		
		System.out.println(x+y);
		
		//Concatenacion - Es la union o combinacion
		//de dos o más cadenas de caracteres
		//Si queremos que una operacion se reconozca como tal
		//debemos encerrarla entre parentesis
		System.out.println("La suma es " + (x + y));
		
		System.out.println("Mi nombre es " + nombre);
		
	} //Cierre del main
	
}//Cierre de la clase
