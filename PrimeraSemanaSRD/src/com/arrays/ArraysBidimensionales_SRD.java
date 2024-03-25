package com.arrays;

/**
 *
 * @author sebas
 */
public class ArraysBidimensionales_SRD{
    public static void main(String[] args){
        /*Arrays Bidimensionales: Nos permite almacenar
        datos en forma tabular, pasando a un concepto
        de "Tabla", permitiendo tener datos de filas y
        columnas
        Declarar un array bidimensional con su tamaño*/
        
        int matriz[][]=new int[3][3];
        
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        
        matriz[1][0]=4;
        matriz[1][1]=5;
        matriz[1][2]=6;
        
        matriz[2][0]=7;
        matriz[2][1]=8;
        matriz[2][2]=9;
        
        /*Declara una matriz o array bidimensional con valores
        asignados desde el inicio*/
        
        int [][]matriz2={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        /*Para recorrer este array necesitamos 2 ciclos for,
        uno anidado dentro de otro*/
        
        //System.out.println(matriz2.length);
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.print(matriz2[i][j]+" ");
            }
        }
        System.out.println("\n");
        
       /*Existe una clase en Java que nos permite almacenar más
        de un tipo de dato, esta clase es Object*/
       
       Object[] array={"Sebastian", 5, true, 7.5, 3.55F};
       
       for(Object i:array){
           System.out.println(i);
       }
       
       
       
       
    }
}
