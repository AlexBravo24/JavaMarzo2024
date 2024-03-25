package com.calculadora;

/**
 *
 * @author sebas
 */

public class Cientifica extends Calculadora_SRD implements ITermometro{
    
    @Override
    public void Sumar(int i, int s){
        System.out.println("Tú suma es de: "+(i+s));
    }
    
    @Override
    public void Restar(int i, int s){
        System.out.println("Tú resta es de: "+(i-s));
    }
    
    @Override
    public void Dividir(int i, int s){
        System.out.println("Tú división es de: "+(i/s));
    }
    
    @Override
    public void Multiplicar(int i, int s){
        System.out.println("Tú multiplicación es de: "+(i*s));
    }

    @Override
    public double Calculos() {
        throw new UnsupportedOperationException("");
    }
    
    @Override
    public void tomarTemperatura(){
        System.out.println("Temperatura ambiente normal");
    }
}
