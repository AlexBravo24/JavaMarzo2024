package com.labda;

/**
 *
 * @author sebas
 */
public class Labda{
    public static void main(String[] args){
        Funcional suma=(valor, valor2)-> System.out.println("La suma es de: "+(valor+valor2));
        suma.operacion(20, 5);
        
        Funcional resta=(valor, valor2)-> System.out.println("La resta es de: "+(valor-valor2));
        resta.operacion(20, 5);
        
        Funcional division=(valor, valor2)-> System.out.println("La división es de: "+(valor*valor2));
        division.operacion(10, 5);
        
        Funcional multiplicacion=(valor, valor2)-> System.out.println("La multiplicación es de: "+(valor/valor2));
        multiplicacion.operacion(20, 5);
    }
}
