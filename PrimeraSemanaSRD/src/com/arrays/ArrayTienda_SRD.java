package com.arrays;

/**
 *
 * @author sebas
 */
public class ArrayTienda_SRD{
    public static void main(String[] args){
        int []precios={34, 18, 20, 14, 25};
        
        String[]productos={"Coca: ", "Doritos mix", "Donas Expolvoreadas: ", "Cheetos", "Roles"};
        
        for(int i=0;i<precios.length;i++){
            System.out.println(productos[i]+": $"+precios[i]);
        }
    }
}
