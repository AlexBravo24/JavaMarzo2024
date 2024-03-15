package com.ciclos;

/**
 *
 * @author sebas
 */
public class Porcentaje_SRD{
    public static void main(String[] args){
        double inversion=1000, porcentaje = 0.02;
        double resultado=inversion*porcentaje;
        for(int i=1;i<=12;i++){
            double x=resultado*i;
            System.out.println("Mes "+i+": "+(x+inversion));
        }
    }
}
