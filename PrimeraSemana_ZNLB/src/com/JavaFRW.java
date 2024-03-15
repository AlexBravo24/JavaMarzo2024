package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		
		//uso de las clases File, FileReader y BufferedReader 
		//cada uno sirve para una tarea especifica
		//File- identifica la ruta del archivo
		//FileReader- permite abrir el archivo en modo lectura
		//BufferedReader permite leer el contenido de archivo y acceder al mismo

		//Declara un String donde podamos guardar la información
		//que vamos a leer de un archivo de prueba
		
		String linea;

		//utilizar una estructura try & catch para intentar realizasr la comunicacion
		//o lectura del archivo y asi poder controlar una excepcion si esta surgiera
		
		try {//Intenta ejecutar el siguiente bloque de codigo
			//Clase file - representación del archivo en memoria
//				
//			
//			//Para poder leer el archivo hacemos uso de la clase File reader
//			FileReader fr = new FileReader(archivo);
//			
//			//vamos a leer el contenido del archivo con BufferedReader
//			BufferedReader buffer = new BufferedReader(fr);
//			
//			//Ahora que ya podemos acceder al contenido y leerlo, se va a guardar en
//			//mi String linea para poder mostrarlo finalmente en consola
//			
////			linea = buffer.readLine();
//			//While linea es para leer mas lineas de texto
//			while ((linea = buffer.readLine()) !=null) {
//				System.out.println(linea);
//			}
			
			//Escritura de archivo -FileWriter
			
			String nombre = "\nGeneración 157"; //\n es introducir un salto de linea en cualquier nivel de String
			
			File archivo = new File ("C:\\Users\\necro\\OneDrive\\Desktop\\fichero.txt");
			
			//hacemos uso de la clase FileWriter para escribir información en el archivo
			FileWriter line = new FileWriter(archivo, true); //Agrego el valor booleano true para respetar la infomación
			//contenida en nuestro archivo originalmente
			
			//Utilizamos el metodo .write para escribir en nuestro archivo el valor del String nombre
			
			line.write(nombre);
			
			//para confirmar la escritura utilizamos el metodo.close
			
			line.close();
			
		} catch (Exception e) { //si algo falla se controla la exception
			System.out.println("No se encontro el archivo");
			e.printStackTrace(); //este metodo permite ver la traza de error en consola
			//es decir ver la excepción (error) que se atrapo aqui	
		}
		
		
		
		
		
		
		
	}

}
