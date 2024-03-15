package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {

		// Uso de las clases File, FileRider y BufferedReader
		// Cada uno nos sirve para una tarea especifica
		// File - Identifica la ruta de un archivo
		// FileReader - Nos permite abrir el archivo en modo lectura
		// Buffereader - Nos permite leer el contenido del archivo y acceder al mismo

		// Declaramos un String en donde podamos guardar la informaci�n que leeremos de
		// un archivo prueba
		String linea;

		// Utilizar una estructura Try and Catch para intentar realizar la comunicaci�n
		// o lectura del archivo y as� poder controlar una excepcion si est� surgiera

		try { // Intentar ejecutar el siguiente bloque de c�digo

			// Clase File - Representaci�n del archivo en memoria
//			File archivo = new File("C:\\Users\\Bran\\Desktop\\fichero.txt");
//
//			// Para poder leer el archivo hacemo uso de la clase FileReader
//			FileReader fr = new FileReader(archivo);
//
//			// Ahora si vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//
//			// Ahora que ya podemos acceder al contenido y leerlo, se guardar� en String
//			// linea para poder mostrarlo finalmente en consola
//			// linea = buffer.readLine();
//
//			// Si quiero leer m�s lineas de texto, voy a recurrir al uso de un ciclo
//			while ((linea = buffer.readLine()) != null) {
//				System.out.println(linea);
//			}

			// Escritura de archivos - FileWriter
			String nombre = "\nGENERACI�N 161"; // \n - es introducir un salto de linea

			File archivo = new File("C:\\Users\\Bran\\Desktop\\fichero.txt");

			// Hacemos uso de la clase FileWriter para escribir informaci�n en el archivo
			FileWriter line = new FileWriter(archivo, true); // Agrego el valor booleano TRUE para respetar la
																// informaci�n contenida en nuestro archivo original

			// Utilizamos el m�todo .Write para escribir en nuestro archivo el valor del
			// String nombre
			line.write(nombre);

			// Para confirmar la escritura utilizamos el m�todo .close
			line.close();

		} catch (Exception e) { // Si algo falla se controla la excepci�n
			System.out.println("No se encontr� el archivo");
			e.printStackTrace(); // Este m�todo permite ver la traza de error en consola
		}

	}

}