package com.actividad;

/**
 *
 * @author sebas
 */
public class Smartphone{
    public static void main(String[] args){
        Camara canon=new Camara("Canon", 2, 48);
        Procesador snapdragon=new Procesador("AmLogic", "Snapdragon", 3.5);
        RAM kingston=new RAM("Kingston", "DDR5", 8);
        
        Celular motorola=new Celular("Motorola", "e32", "azul", snapdragon, canon, kingston);
        
        System.out.println("Tú smartphone: "+motorola);
        
    }
}
