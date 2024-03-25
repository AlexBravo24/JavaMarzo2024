package com.condicionales;
import java.io.IOException;
import java.util.Scanner;
        
/**
 *
 * @author sebas
 */
public class Mayusculas{
    public static void main(String[] args) throws IOException{
        Scanner d=new Scanner(System.in);
        String frase;
        
        System.out.println("Ingresa una frase:");
        frase=d.nextLine();
        
        System.out.println(reconocerFrase(frase));
        
    }
    public static boolean reconocerFrase(String s){
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i);
            
            if(!LetraMayuscula(l)){
                return false;
            }else{
                return true;
            }
            
        }
        return true;
        
    }
    
    public static boolean LetraMayuscula(char c){
        return c>='A' & c<='Z';
    }
}
