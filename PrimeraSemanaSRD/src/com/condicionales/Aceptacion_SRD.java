package com.condicionales;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Aceptacion_SRD{
    public static void main(String[] args){
        InputStream source=System.in;
        Scanner d=new Scanner(source);
        int nota, edad;
        String sexo;
        
        
        System.out.println("Ingresa tú nota:");
        nota=d.nextInt();
        
        System.out.println("\nIngresa tú edad:");
        edad=d.nextInt();
        
        System.out.println("Ingresa tú sexo:");
        sexo=d.nextLine();
        
        if(nota>=5 & edad>=18 & sexo.equalsIgnoreCase("M")){
            System.out.println("Posible");
        }else if(nota>=5 & edad>=18 & sexo.equalsIgnoreCase("F")){
            System.out.println("Aceptada");
        }else{
            System.out.println("No aceptado");
        }
        
    }
}
