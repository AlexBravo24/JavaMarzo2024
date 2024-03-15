package com.ciclos;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Palindromo_SRD{
    public static boolean ValidarPalindromo(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
       
        System.out.println("Ingresa una palabra:");
        String palabra=d.nextLine();
       
        if(ValidarPalindromo(palabra)==true){
            System.out.println("La palabra "+palabra+" es palíndromo");
        }else{
            System.out.println("La palabra "+palabra+" no es palíndromo");
        }
   }
}
