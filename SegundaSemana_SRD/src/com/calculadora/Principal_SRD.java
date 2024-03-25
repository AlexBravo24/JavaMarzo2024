package com.calculadora;
import java.util.*;

/**
 *
 * @author sebas
 */
public class Principal_SRD{
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int bandera=0, selector=0;
        
        do{
            do{
                try{
                    System.out.println("\nMENU DE OPCIONES\n");
                    System.out.println("[1] Sumar");
                    System.out.println("[2] Restar");
                    System.out.println("[3] División");
                    System.out.println("[4] Multiplicación");
                    System.out.println("[0] Salir");
                    
                    System.out.println("\nElige una opción:");
                    selector=d.nextInt();
                
                    if(selector>=0 && selector<=4){
                        bandera=1;
                    }else{
                        System.err.println("Opción no disponible, intente de nuevo");
                    }
                }catch(Exception s){
                    System.err.println("Opcion invalida, programa finalizado");
                    bandera=2;
                }
            }while(bandera==0);
            
            if(selector==1){
                Calculadora_SRD suma=new Suma_SRD();
                Suma_SRD sum=new Suma_SRD(suma.Calculos(), "Casio", "Negro", true, 200);
                System.out.println(sum);
            }else if(selector==2){
                Calculadora_SRD resta=new Resta_SRD();
                
                Resta_SRD rest=new Resta_SRD((int)resta.Calculos(), "Casio", "Negro", true, 200);
                System.out.println(rest);
            }else if(selector==3){
                Calculadora_SRD division=new Division_SRD();
                Division_SRD div=new Division_SRD(division.Calculos(), "Casio", "Negro", true, 200);
                System.out.println(div);
            }else if(selector==4){
                Calculadora_SRD multiplo=new Multiplicacion_SRD();
                Multiplicacion_SRD mult=new Multiplicacion_SRD(multiplo.Calculos(), "Casio", "Negro", true, 200);
                System.out.println(mult);
            }else if(selector==0){
                System.out.println("Gracias por todo");
                bandera=2;
            }
        }while(bandera!=2);
    }
}
