package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\pabli\\Desktop\\fichero.txt";
		String linea = "";
		
		try {
			//Clase File - Representacion del archivo en memoria
			File archivo = new File(ruta);
			
			//Escritura de archivos - FileWriter
			FileWriter writer = new FileWriter(archivo);
			writer.write("Hola perros :v");
			writer.write("\n");
			writer.write("Linea añadida perros :v");
			writer.close();
			
			//Para poder leer el archivo hacemos uso de la clase FileReader
			FileReader fr = new FileReader(archivo);
			
			//Para leer el contenido del archivo se usa la clase Bufferedreader
			BufferedReader buffer = new BufferedReader(fr);
			
			
			while ((linea =buffer.readLine()) != null) {
				System.out.println("Contenido: "+linea);	
			}
			 
			
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
	}

}
