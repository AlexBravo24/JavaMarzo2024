package com.arrays;

/**
 *
 * @author sebas
 */
public class ArrayCinco_SRD{
    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5};
        int []array2=new int[array.length];
        
        for(int i=(array.length-1),j=0;i>=0;i--,j++){
            array2[j]=array[i];
            System.out.print(array2[j]+" ");
        }
        System.out.println("");
    }
}
