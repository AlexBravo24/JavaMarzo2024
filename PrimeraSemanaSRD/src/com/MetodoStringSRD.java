package com;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class MetodoStringSRD {
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        
        System.out.println("Ingresa una frase:");
        String cadena=d.nextLine();
        
        System.out.println("Ingresa una segunda frase:");
        String cadena2=d.nextLine();
        
        /*El método .length(): Nos regresa el tamaño de nuestra cadena de caracteres,
        es decir, cuantas letras tiene nuestra frase*/
        
        System.out.println("Método .length(): "+cadena.length());
        
        /*El método charr.At(): Nos devuelve el carácter de acuerdo a la posición 
        en la que se encuentre dicho carácter, necesita de un parámetro del tipo entero,
        este indica el carácter que deseas seleccionar*/
        System.out.println("Método .charAt(aquí agregas el paramétro del tipo entero)"+cadena.charAt(1));
        
        //El método substring: Devuelve una subcadena a partir del índice espscificado
        System.out.println("Método substring(parámetro1) con un parámetro: "+cadena.substring(1));/*Desde que caracter quieres que empiece tu cadena
        (Nota: Siempre se empieza desde el número 0)*/
        System.out.println("Método substring(inicio, final) con dos parámetro: "+cadena.substring(0, 3));/*Usa dos parámetros, el primero desde donde empieza 
        la cadena y el segundo desde donde quieres que termine*/
        
        //.toLowerCase(): Convierte una cadena de carácteres en minúsculas
        //.toUpperCase(): Convierte una cadena de carácteres en mayúsculas
        System.out.println("Método .toLowerCase()"+cadena.toLowerCase());
        System.out.println("Método .toUpperCase()"+cadena.toUpperCase());
        
        /*Método .equals(): Compara el valor de un objeto contra otro,
        compara el valor de un string contra otro*/
        System.out.println("Método .equals(): "+cadena.equals(cadena2));
        
        /*Método .equalsIgnoreCase(): Hace lo mismo que el método .equals()
        sólo que en esta ignora mayúsculas y minúsculas*/
        System.out.println("Método .equalsIgnoreCase(): "+cadena.equalsIgnoreCase(cadena2));
        
        //Método .contentEquals(): Compara la cantidad de carácteres entre 2 strings
        System.out.println("Método .contentEquals()"+cadena.contentEquals(cadena2));

        /*Método .replace(carácter reemplazado, carácter de reemplazo): Nos permite cambiar
        el carácter especificado con otro*/
        System.out.println("Método .replace(): "+cadena.replace("a", "e"));
        
        
        
    }
}
