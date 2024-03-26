package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class JavaFRW_NJHC {


	public static void main(String[] args) {
			/* uso de las Clases File, FileReader, FileWritter, y BufferedReader
			 * cada una nos sirve para ua tarea especifica
			 * Con ellas podemos acceder, leer, modificar archivos, etc.
			 * File - identifica la ruta del archivo
			 * FileReader nos permite abrir el archivo en modo lectura
			 * BufferedReader - nos permite leer el contenido del archivo y acceder al mismo
			 * 
			 */

			/*Realizando lectura de un archivo.
			 * Estructura try and catch
			 * El try va a intentar ejecutar lo que tenemos dentro de el
			 * mientras que el cath va a atrapar una excepción o error.
			 * A veces eb la comunicacipon con archivos externos pueden haber
			 * errores que impidan ejecutar el programa.
			 */
			//Declaramos un String  donde podamos guardar la informacion que vamos
			// a leer y acceder al mismo
			
			 String linea;	//Declaro una variable para guardar las lineas a leer.
			
			 /*
			  * Utilizar una estructura try y catch para intentar realizar la comunicacion o lectura
			  * del archivo y asi poder controlar una excepcion si esta surgiera
			  */
			 
			 try {	//Intenta ejecutar el siguiente bloque de codigo
				
//				 //clase File - Representacion del archivo en memria
//				 File archivo = new File("C:\\Users\\Admin\\Desktop.fichero.txt");
//				
//				 //Para poder leer el archivo hacemos uso de la clase FileReader 
//				 FileReader fr = new FileReader(archivo);
////				Ahora si vamos a leer el contenido del archvo con BufferedReader
//				 
//				 BufferedReader buffer = new BufferedReader(fr);
//				
//									/*
//									 * Ahora ue ya podemos acceder al contenido y leerlo, lo voy a guardar en mi string linea para
//									 * poder mostrarlo finalmente en consola
//									 * 
//									 */
//				linea = buffer.readLine();
//				System.out.println(linea);
//				
//				while ((linea = buffer.readLine()) !=null) {
//					System.out.println(linea);
//				}
			// ******//Escritura de archivos = FileWriter***
				 String nombre = "\nGENERACION 170";
						 File archivo = new File("C:\\Users\\Admin\\Desktop\\fichero.txt");
//					//Hacemos uso de la clase FileWriter para escribir informacion en el archivo
						 FileWriter line = new FileWriter(archivo, true); //agrego el valor booleano para respetar la informacion
						 //contenida en nuerto archivo originalmente
						 
					//utilizamos el metodo .write para escribir en nuerto archivo el valor del
						 //String nombre
					line.write(nombre);
				///*********
					//Para confirmar la escritura, utilizamos el metodo .close()
					line.close();
					
			 } catch(Exception e) { //Si algo falla,se controla la excepcion //Si hay algún error lo atrapa en una excepcion.
				 System.out.println("No se encontro el archivo ");
				 e.printStackTrace();// Ese metodo me permite ver la traza de error en consola
				 // es decir, ver la excepcion ue se atrapo aui
				 
			 }
	}
}
			 





























//			 
//			try {	//Intenta ejecutar el siguiente bloque de codigo
//				File archivo = new File("C:\\Users\\We are Benito\\Desktop\\fichero.txt");
//				/* Con esta clase tenemos una representacion en memoria
//				 * del archivo
//				 */
//				FileReader fr = new FileReader(archivo);
//				
//				//FileReader sabe leer el contenido del archivo.
//				BufferedReader buffer = new BufferedReader(fr);
//				/*BufferedReader lee el contenido del archivo para 
//				*traerlo de este lado a java (?)
//				*/
//				while ((linea = buffer.readLine()) != null) {
//					System.out.println("Línea: " + linea);
//					/*
//					 * Asignamos el valor de buffer a una linea y mientras
//					 * esta tenga datos o contenido lo mostraremos en consola
//					 */
//				}
//			//Realizar escritura de archivos
//				
//				String linea_a = "\n abcdefg\n"; 	// Vamos a intentar oasar estos
//													// caracteres al archivo mediante
//													// fileWriter
//				FileWriter line = new FileWriter(archivo, true);
//				/*Pasamos el valor del archivo que vamos  a escribir y que exista
//				 * Traemos un ciclo para escribir caracteres en la linea
//				 */
//				
//				for(int i = 0 ; i < linea_a.length() ; i++) {
//					line.write(linea_a.charAt(i) + "\n");
//					//Escribimos cada caracter recorrido en el String en una nueva linea
//				}
//				
//				line.close();
//				buffer.close();
//			}catch(Exception ex) {	//Si algo falla,se controla la excepcion //Si hay algún error lo atrapa en una excepcion.
//				System.out.println("ERROR 404: File not Found");}
