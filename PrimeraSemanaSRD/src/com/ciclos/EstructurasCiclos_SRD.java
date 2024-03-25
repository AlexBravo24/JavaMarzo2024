package com.ciclos;

/**
 *
 * @author sebas
 */
public class EstructurasCiclos_SRD{
    public static void main(String[] args){
        int i=1;
        /* El ciclo while: Es un ciclo indeterminado
         * pero podemos agregar un incremento para detener
         * la condición por un momento
         **/
        
        /*while(i<5){
            System.out.println("Hola mundo");
            i++;
        }*/
        
        /** Ciclo do-while: Similar al ciclo while,
         * pero aquí aseguramos que el código se ejecute
         * por lo menos 1 vez, en caso de caer en una 
         * condición que sea imposible de cumplir, es decir,
         * primero se ejecuta el código y después se evalua
         * si se debe seguir ejecutando
         */
        
        /*do{
            System.out.println("¡Que onda!");
        }while(i!=2);*/
        
        
        /** Ciclo for: Se utiliza cuando conocemos o tenemos
         * una idea de cuantos una idea de cuantas veces 
         * queremos que se ejecute dicho código o se realice
         * una acción
         * 
         * Si fuera en español
         * para(variable de control; condición; incremento o decremento);
         * 
         */
        
        for(int s=0;s<5;s++){
            System.out.println(s+".- Dark crow");
        }
        
        
    }
}
