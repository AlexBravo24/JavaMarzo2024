package com;

public class TiposDeDatos {  //Apertura de la clase tipos de datos

	public static void main (String [] args) { //apertura del metodo main
		//comentarios de una sola linea
		//los cuales no interfieren con 
		//la ejecucion del codigo
		
		/*comenarios
		 * de
		 * multiples
		 * lineas
		 * Y el comentario
		 * se va apliando conforme damos
		 * saltos
		 * de
		 * linea
		 * 
		 * El metodo main es el metodo principal que nos permite
		 * ejecutar nuestra clase i programa
		 * y es el punto de entrada o salida de datos
		 */
		// podemos presionar el boton guardar o CTRL + S para guardar los cambios en el codigo
		
		//TIPOS DE DATOS
		//NUMERICOS ENTEROS
		
		//Ejemplo de una declaracion de variables 
		//sin valor asignado 
		//primero ira el TIPO de dato (byte) numerico entero, despues ira el nombre de la variable
		byte numero1;// aqui estoy creando una variable (numero1) de tipo de dato byte pero al terminarlo con ; no esoy guardando nada dentro de ella
		
		//Posteriormente puedo guardar u valor en dicha variable y asiganarle
		//Rango de valores de tipo byte ---> tamaño de  1 byte de memoria y almacena desde el -128 a 127
		numero1 = 127;    // aqui ya tenemos asignado un valor (127) asignado a dicha vaiable, si yo le coloco 128 a numero1 me va a marcar error por ue dicho numero ya no lo puede contener, por que solo llega hasta el rango que soporta
		
		//Ejemplo de declaracion de variables con valor asignado inicialmente 
		//primero vamos a colocar el tipo (byte), despues el nombre de la variable(b) y por ultimo le asigno el valor 
		byte b = 120; //---> tamaño que ocupa 1 byte de memoria y admite desde el -128 a 127
		short s = 32767; // ---> tamaño que ocupa 2 byte de memoria y admite desde el -32,768 a 32,767
		int i = 2147483647;  // ---> tamaño que ocupa 4 byte de memoria y admite desde el 2147483648 a 2147483647
		// para el tipo long se requiere colocar al final una L o l para que pueda admitir mas valores que del tipo int
		long l =2147483648L;// --->tamaño que ocupa 8 byte de memoria, necesita del sufijo L para admitit los valores mas alla de los int , y admite  desde 9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		
		//El tipo de dato mas utlizado o comodin son los de tipo int
		
		//TIPOS DE DATOS PRIMITIVOS
		//NUMERIOS EN PUNTO O COMA FLOTANTE (DECIMALES)
		
		// byte b1 = 3.14.16; // este no me lo permite ya que la variable byte solo puede contener numeros enteros 
		// para el tipo float se requiere colocar al final una L o l para que pueda admitir el valor
		//float f = 3.1416;
		float f = 3.1416F;// --->tamaño que ocupa 8 byte de memoria, necesita del sufijo F para guardar los valores
		double d = 3.1415926535897932384626433832795028841971693993;// --->tamaño que ocupa 8 byte de memoria,Rango de valor hasta 15 dígitos en decimal
		
		//El tipo de dato mas utlizado para decimales es del tipo double
		
		//TIPO DE DATOS PRIMITIVOS
		//BOOLEANOS--- boolean
		//CARATER--- char
		
		boolean evalua = false; //solo admite valores true o false y son ultiles para evaluar expresiones o condiciones 
		
		char caracter = ',';     //para almacenar una valor en la variable caracter se deben colocar las '' y dentro de ellas colocar el valor, se puede almacenar desde simbolos, numeros, letras, etc...
		//Solo puede almacenar un caracter y se almacena entre comillas simples
		
		//TIPOS DE DATOS NO PRIMITIVOS
		//TIPOS DE DATO OBJETOS, ESTRUCTURADOS O REFERENCIALES 
		
		//A diferencia de los tipo de dato primitivos inician con minuscula, los tipo de dato objeto inician con letra mayuscula
		//porque provienen de clases
		
		//Sring - nos permite almacenar cadenas de texto
		//primero ira el TIPO de dato (String) cadenas de texto , despues ira el nombre de la variable (nombre)
		String nombre = "Nadia Jazmin";
		//se puede usar para colocar igualmente numero pero solo para imprimir a pantalla, ya que lo reconoce como texto toma como caracter
		//entonces en consola nos va imprimir 129000, y este valor no se puede usar para realizar una operacion numerica
		String numero = "129000";
		
		//Tipo de dato envoltorio  
		// Son clases que  "envuelven" a los primitivos  para otorgarles ciertass funcionalidades
	    
		Byte by = 100;
		Short sh = 30000;
		Integer in = 20000000;
		Long l0 = 900000000000l;
		Float fl = 31.898909F;
		Double du = 31.8988677;
		Character letra = 'a';
		
		//Diferencia entre los tipos de datos envoltorios a los tipos primitivos
		//van otorgarle ciertas propiedades a los primitivos 
		
		by.toString ();// Gracias a los tipo wapper o envoltorio ahora las variables son capaces de utilizar métodos  
		
		// Line para darle salida a nuestros datos en consola 
		System.out.print("Hola mundo"); //dentro del () podemos colocar y sea nombre de la variable que quermos visualizar en consola
		// o podemos pasar un valor directo 
		System.out.print(nombre);// imprime el valor que tiene asignada la variable nombre 
		
		//System.out.print();// imprime los valores en la misma linea
		// al ejecutar se vera Hola mundoNadia Jazmin, todo junto por que print lo ue hace es imprimir en la primera linea lo ue se le indique
		// para que existe un salto de linea lo que debemos usar el println
		
		System.out.println(); // imprime y da un salto de linea
		System.out.println("Hola mundo"); //dentro del () podemos colocar y sea nombre de la variable que quermos visualizar en consola
		// o podemos pasar un valor directo 
		System.out.println(nombre);// imprime el valor que tiene asignada la variable nombre 
		//atajo para escribir el System.out.println mas rapido Syso + ctr + espacio
		//sout + ctrl + espacio 
		
		//Ejemplo de una suma de dos numeros con salida en consola
		System.out.println(11+20);
		
		int x = 11;
		int y = 20;
		
		System.out.println(x+y);
		//Concatenacion - Es la union o combinacion de dos o mas cadenas de caracteres, si queremos que una operacion se reconozca como tal debemos encerrarla entre parentesis
		//System.out.println("La suma es : " x+y);// el resultado sera :la suma es 1120 , ya que estamos conbinando cadenas de texto con valores numericos
		//entramos a una función llamada concatenación, por ello tenemos ue separar con paréntesis + () para que se reconosca como operacion 
		System.out.println("La suma es : " + (x+y)); //Nos va imprimir La suma es: 31 , ya que toma el valor de las dos variables x, y ,nos  da el resultado correcto
		
		System.out.println("Mi nombre es : " + nombre); //Nos va imprimir el valor que tiene la variable nombre ya definido anteriormente 
		
		
		
	}// cierre del metodo main
}// cierre de la clase tipos de datos
