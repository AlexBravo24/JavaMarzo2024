package com;

/**
 *
 * @author sebas
 */
public class EstructurasCondicionales{
    public static void main(String[] args){
        int x=9;
        
        if(x<10){
            System.out.println("El número "+x+" es mayor que 10");
        }else{
            System.out.println("El número "+x+" es menor que 10");
        }
        
        /*Condiciones compuestas con operadores lógicos:
        AND, OR, NOT, DIFERENTE DE, IGUAL DE
        &&(AND): Devuelve el bloque o valor "true" cuando se cumplen
        las condiciones requeridas*/
        
        if(x<1 & x>9){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        
        /*|| (OR): Devuelve un valor "true" si al menos una condicion de las
        declaradas se cumple*/
        
        if(x>1 | x<9){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        /*== (IGUAL DE): Compara entre valores que indiquemos, si los valores
        son iguales, devuelve un true*/
        
        if(x==10){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        /*!=(DIFERENTE DE): Compara entre valores que indiquemos, si los valores
        son diferentes, devuelve un true*/
        
        if(x!=20){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        //! (NOT): Niega una condición
        if(!(x<10)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        
        
        /*if-else anidado: No permite realizar varias opciones*/
        
        int dia=3;
        
        if(dia==1){
            System.out.println("Lunes");
        }else if(dia==2){
            System.out.println("Martes");
        }else if(dia==3){
            System.out.println("Miércoles");
        }else if(dia==4){
            System.out.println("Jueves");
        }else if(dia==5){
            System.out.println("Viernes");
        }else if(dia==6){
            System.out.println("Sábado");
        }else if(dia==7){
            System.out.println("Domingo");
        }else{
            System.out.println("Error");
        }
        
        
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;    
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
