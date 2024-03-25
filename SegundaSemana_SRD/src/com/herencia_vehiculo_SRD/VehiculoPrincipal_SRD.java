package com.herencia_vehiculo_SRD;

/**
 *
 * @author sebas
 */
public class VehiculoPrincipal_SRD{
    public static void main(String[] args){
        Carro automovil=new Carro(4, 4, true, "Mercedes", "MSJSD9892", "SR4-PD2", 2020);
        Motocicleta motocicleta=new Motocicleta("Italika", "ATTK81983", 2019, "ES8273", 4);
        
        System.out.println(automovil);
        System.out.println(motocicleta);
    }
}
