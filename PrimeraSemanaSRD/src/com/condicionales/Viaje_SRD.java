package com.condicionales;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Viaje_SRD{
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int n;
        
        System.out.println("****************VIAJE ESCOLAR****************");
        System.out.println("\nIngresa la cantidad de alumnos:");
        n=d.nextInt();
        
        if(n>=100){
            int pago=n*65;
            System.out.println("Los alumnos pagan: $"+pago);
        }else if(n>50 & n<99){
            int pago=n*70;
            System.out.println("Los alumnos pagan: $"+pago);
        }else if(n>=30 & n<=49){
            int pago=n*30;
            System.out.println("Los alumnos pagan: $"+pago);
        }else if(n<30){
            System.out.println("Los alumnos pagan: $4000");
        }
    }
}
