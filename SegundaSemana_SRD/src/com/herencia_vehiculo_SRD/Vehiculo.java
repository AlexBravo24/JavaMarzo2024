package com.herencia_vehiculo_SRD;

/**
 *
 * @author sebas
 */
public class Vehiculo{
    
    private String marca, modelo, matricula;
    private int anio;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String brand, String model, int year, String license){
        super();
        this.marca=brand;
        this.modelo=model;
        this.anio=year;
        this.matricula=license;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca2){
        this.marca=marca2;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo2){
        this.modelo=modelo2;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula2){
        this.matricula=matricula2;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio2){
        this.anio=anio2;
    }
    
    public String toString(){
        return "[Marca: "+marca+", modelo: "+modelo+", matrícula: "+matricula+", Año: "+anio+"]";
    }
}
