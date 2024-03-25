package com.actividad;

/**
 *
 * @author sebas
 */
public class Camara{
    private String marca;
    private double lente, pixeles;
    
    public Camara(){
        
    }
    
    public Camara(String m, double l, double p){
        super();
        this.marca=m;
        this.lente=l;
        this.pixeles=p;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String mar){
        this.marca=mar;
    }
    
    public double getLente(){
        return lente;
    }
    
    public void setLente(double len){
        this.lente=len;
    }
    
    public double getPixeles(){
        return pixeles;
    }
    
    public void setPixeles(double pix){
        this.pixeles=pix;
    }
    
    @Override
    public String toString(){
        return "[marca: "+marca+", tamaño de la lente: "+lente+", megapixeles: "+pixeles+"mp]";
    }
}
