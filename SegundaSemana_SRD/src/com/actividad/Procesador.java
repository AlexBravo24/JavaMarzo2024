package com.actividad;

/**
 *
 * @author sebas
 */
public class Procesador{
    private String marca, modelo;
    private double frecuencia;
    
    public Procesador(){
        
    }
    
    public Procesador(String m, String mo, double f){
        super();
        this.marca=m;
        this.modelo=mo;
        this.frecuencia=f;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String ma){
        this.marca=ma;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String mo){
        this.modelo=mo;
    }
    
    public double getFrecuencia(){
        return frecuencia;
    }
    
    public void setFrecuencia(double fr){
        this.frecuencia=fr;
    }
    
    @Override
    public String toString(){
        return "[marca: "+marca+", modelo: "+modelo+", frecuencia: "+frecuencia+"]";
    }
}
