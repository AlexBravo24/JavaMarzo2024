package com.arrays;

import java.io.*;

/**
 *
 * @author sebas
 */
public class LectorSRD{
    public static void main(String[] args){
        /*Uso de la clase File, FileReader &
        BufferedReader, cada uno nos sirve para
        una tarea específica.
        File: Identifica la ruta del archivo
        FileReader: Nos permite abrir un archivo
        en modo de lectura
        BufferedReader: Nos permite leer el contenido
        del archivo y acceder al mismo
        FileWriter: Permite escribir la información del
        archivo
        */
        
        String linea="Java y Python unidos";
        
        try{
            File archivo=new File("C:\\Users\\sebas\\Desktop\\fichero.txt");
            FileReader lector=new FileReader(archivo);
            BufferedReader buffer=new BufferedReader(lector);
            FileWriter escribir=new FileWriter(archivo);
            /*La clase FileWriter: Nos permite modificar la información
            del archivo*/
            //linea=buffer.readLine();
            /*while((linea=buffer.readLine())!=null){
                System.out.println(linea);
            }*/
            //El método .write() nos permite escribir en
            //nuestro archivo el valor que lleve el String
            escribir.write(linea);
            //El método .close nos permite confirmar la
            //información del valor declarado
            escribir.close();
            //System.out.println(linea);
            System.out.println("Reescritura exitosa");
        }catch(IOException s){
            System.out.println("No se encontró el archivo");
            //s.printStackTrace();
        }
    }
}
