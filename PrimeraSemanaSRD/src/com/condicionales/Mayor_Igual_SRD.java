package com.condicionales;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Mayor_Igual_SRD {
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int n, n2;
        
        System.out.println("PROGRAMA QUE INDICA SI LOS NÚMEROS SON MAYOR O IGUALES\n");
        System.out.println("Ingresa tú primer número:");
        n=d.nextInt();
        
        System.out.println("\nIngresa un segundo número:");
        n2=d.nextInt();
        
        if(n>n2){
            System.out.println("El primer número "+n+" es mayor que el segundo número "+n2);
        }else if(n==n2){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("El segundo número "+n2+" es mayor que el primer número 1"+n);
        }
        
    }
}
