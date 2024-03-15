package com.arrays;

/**
 *
 * @author sebas
 */
public class Media_SRD{
    public static void main(String args[]){
        int media, suma=0;
        int[] arreglo=new int[100];
        for (int i=0;i<arreglo.length;i++){
            arreglo[i] = i+1;
            System.out.println(arreglo[i]);
            suma+=i+1;
        }
        media=suma/arreglo.length;
        System.out.println("La suma da "+suma);
        System.out.println("La media da "+media);
    }
}