package com.arrays;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class ArraysTeclado_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int []arreglo=new int[10];
        int valor;
        String name="";
        System.out.println("ARREGLOS CON TECLADO");
        for(int i=0;i<10;i++){
            System.out.println("Ingresa un valor al array "+(i+1)+":");
            valor=d.nextInt();
            arreglo[i]=valor;
        }
        
        for(int i=0;i<10;i++){
            System.out.println("Ingresa un nombre:");
            name=d.nextLine();
        }
        System.out.print("Arreglo: ");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(name+": "+arreglo[i]+" ");
        }
        System.out.println();
        
    }
}
