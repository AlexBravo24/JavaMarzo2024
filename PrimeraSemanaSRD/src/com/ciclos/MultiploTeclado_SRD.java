package com.ciclos;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class MultiploTeclado_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        
        System.out.println("**********TABLA DE MULTIPLAR POR TECLADO**********");
        
        System.out.println("Ingresa un múltiplo:");
        int x=d.nextInt();
        
        System.out.println("Ingresa la cantidad de la tabla:");
        int i=d.nextInt();
        System.out.println("");
        
        for(int s=1;s<i+1;s++){
            int resultado=s*x;
            System.out.println(x+" x "+s+" = "+resultado);
        }
    }
}
