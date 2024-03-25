package com.condicionales;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Semana_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int day;
        
        System.out.println("**************DIAS DE LA SEMANA**************");
        System.out.println("Ingresa un número:");
        day=d.nextInt();
        
        if(day==1){
            System.out.println("Lunes");
        }else if(day==2){
            System.out.println("Martes");
        }else if(day==3){
            System.out.println("Miércoles");
        }else if(day==4){
            System.out.println("Jueves");
        }else if(day==5){
            System.out.println("Viernes");
        }else if(day==6){
            System.out.println("Sábado");
        }else if(day==7){
            System.out.println("Domingo");
        }else{
            System.out.println("Error");
        }
    }
}
