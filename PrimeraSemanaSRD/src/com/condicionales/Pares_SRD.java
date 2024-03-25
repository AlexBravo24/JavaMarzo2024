package com.condicionales;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Pares_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int n;
        
        System.out.println("Ingresa un número:");
        n=d.nextInt();
        
        if(n%2==0){
            System.out.println("El número "+n+" es par");
        }else{
            System.out.println("El número "+n+" es impar");
        }
    }
}
