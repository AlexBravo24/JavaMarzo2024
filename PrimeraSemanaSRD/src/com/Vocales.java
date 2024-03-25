package com;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Vocales {
    public static void main(String[] args){
        Scanner d=new Scanner( System.in );
        String texto, resultado;
        
        System.out.println("Ingresa una palabra:");
        texto=d.nextLine();
        
        resultado=texto.replaceAll("[a, e, i, o, u, A, E, I, O, U]", "*");
        
        System.out.println("Palabra: "+resultado);

        
    }
}
