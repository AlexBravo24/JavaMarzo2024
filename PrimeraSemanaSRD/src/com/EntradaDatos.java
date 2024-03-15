package com;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class EntradaDatos{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int edad;
        double estatura;
        
        System.out.println("Ingresa tú edad:");
        edad=d.nextInt();
        
        System.out.println("Ingresa tú estatura:");
        estatura=d.nextDouble();
        
        System.out.println("Tú edad es de "+edad+" y mides "+estatura+"m");
    }
}
