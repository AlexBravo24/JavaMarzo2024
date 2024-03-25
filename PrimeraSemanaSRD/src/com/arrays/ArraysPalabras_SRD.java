package com.arrays;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class ArraysPalabras_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int s=0;
        System.out.println("ARRAYS CON PALABRAS");
        
        System.out.println("\nIngresa una palabra:");
        String palabra=d.nextLine();
        
        char caracter[]=new char[palabra.length()];
        System.out.print("\nArreglo: ");
        for(int i=0;i<palabra.length();i++){
            s+=1;
            caracter[i]=palabra.charAt(i);
            System.out.print(caracter[i]+", ");
        }
        
        System.out.println("\n\nLa palabra consta de "+s+" letras");
        
    }
}
