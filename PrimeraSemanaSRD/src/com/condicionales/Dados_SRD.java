package com.condicionales;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Dados_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int resultado;
        
        System.out.println("¿Que número cayó de tú dado?:");
        resultado=d.nextInt();
        
        if(resultado==1){
            System.out.println("SEIS");
        }else if(resultado==2){
            System.out.println("CINCO");
        }else if(resultado==3){
            System.out.println("CUATRO");
        }else if(resultado==4){
            System.out.println("TRES");
        }else if(resultado==5){
            System.out.println("DOS");
        }else if(resultado==6){
            System.out.println("UNO");
        }else{
            System.out.println("Error: Número incorrecto");
        }
        
    }
}