package com.actividad;

/**
 *
 * @author sebas
 */
public class RAM{
    private String marca, tipo;
    private double tamano;
    
    public RAM(){
        
    }
    
    public RAM(String m, String t, double ta){
        super();
        this.marca=m;
        this.tipo=t;
        this.tamano=ta;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String ma){
        this.marca=ma;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String ti){
        this.tipo=ti;
    }
    
    public double getTamano(){
        return tamano;
    }
    
    public void setTamano(double ta){
        this.tamano=ta;
    }
    
    @Override
    public String toString(){
        return "[marca: "+marca+", tipo: "+tipo+", tamaño: "+tamano+"]";
    }
}