package com;

public abstract class TiposDeDatos { //Apertura de la clase

	public static void main (String [] args) {//Apertura del metodo main
		//Comentarios de una sola linea
		//Ejemplo de una declaración variable
		//Sin valor asignado
		byte numero1;
		
		numero1 = 127;
		
		//Ejemplo de declaración de variables
		//con valor asignado inicialente
		byte b = 120; //1 byte -128 a 127
		short s = 32767; //2 bytes
		int i = 2147483647; //4bytes de memoria
		long l = 2147483647; //8 bytes de memoria y necesitan del sufijo L
		//para admitir los valores mas alla de los int
		
		//El tipo de dato mas utilizado mas utilizado son los de tipo int
		
		float f = 3.1416F; //4 bytes y necesita el sufijo F para
		// guardar los valores
		double d= 3.1416; // 8 bytes de memoria
		
		//El tipo de dato mas utilizado para decimales es tipo Double
		
		//Tipos de datos primitivos
		//Booleanos
		//Caracter
		
		boolean evalua = false; //solo admite valores true o false
		//y son utiles para evaluar expresiones o condicciones
		
		char caracter =','; //Puede almacenar solo un caracter
		//Y se almacena entre comilla simple
		
		//Tipos de datos no primitivos
		//Tipos de datos objeto, estructurados o referenciales
		
		//Los tipos de datos objeto inician con la letra mayuscula
		//por que provienen de clases
		
		//String - cadenas de texto
		String nombre = "Zuriel Lehovec";
		
		String numeros = "129000";
		
		//Tipos de dato envoltorio
		//Son para clases que "envuelven" a los primitivos
		// para otorgarles ciertas funcionalidades
		
		Byte by= 100;
		Short sh= 30000;
		Integer in = 20000000;
		Long lo = 90000000000L;
		Float fl = 31.898909F;
		Double du = 31.8988677;
		Character letra = 'a';
		
		by.toString(); //Gracias a los lipo wrapper o envoltoria
		//ahora las variables son capaces de utilizasr metodos
		
		//Darle salida a nuestros datos en consola
		//System.out.println da un saltoe de linea
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
		
		//Concalenación
		System.out.println("La suma es " + (x+y));
		
		System.out.println("Mi nombre es" + nombre);
	
		
		
	} //Cierre del metodo main
	
	/*Comentario
	 * *de
	 * Multiples
	 * saltos 
	 * de linea
	 * 
	 * El metodo main es el metodo principal
	 * que nos permite ejecutar nuestra clase o programa
	 * y es el punto de entrada o salida de datos
	 */
	
} //Llave que cierra la clase
