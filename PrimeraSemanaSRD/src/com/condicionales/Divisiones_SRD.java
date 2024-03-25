package com.condicionales;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Divisiones_SRD{
    public static void main(String[] args){
        try{
            Scanner d=new Scanner(System.in);
            int v, v2, div;
        
            System.out.println("*****************DIVISIONES*****************");
        
            System.out.println("\nIngresa un valor:");
            v=d.nextInt();
        
            System.out.println("\nIngresa un segundo valor:");
            v2=d.nextInt();
        
            div=v/v2;
        
            System.out.println("\nEl resultado de tu division es: "+div);
        }catch(Exception s){
            System.out.println("\nError: 0 no es un número divisible");
            System.err.println("Código de error: "+s);
        }
    }
}
