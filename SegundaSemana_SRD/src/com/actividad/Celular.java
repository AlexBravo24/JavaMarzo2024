package com.actividad;

/**
 *
 * @author sebas
 */
public class Celular{
    private String marca, modelo, color;
    private Camara camara;
    private Procesador process;
    private RAM memoria;
    
    public Celular(String nom, String model, String iro, Procesador CPU, Camara camera, RAM memory){
        super();
        this.marca=nom;
        this.modelo=model;
        this.color=iro;
        this.process=CPU;
        this.camara=camera;
        this.memoria=memory;
        
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String brand){
        this.marca=brand;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public Camara getCamara(){
        return camara;
    }
    
    public void setCamara(Camara cam){
        this.camara=cam;
    }
    
    public Procesador getCPU(){
        return process;
    }
    
    public void setCPU(Procesador cpu){
        this.process=cpu;
    }
    
    public RAM getProcesador(){
        return memoria;
    }
    
    public void setProcesador(RAM rem){
        this.memoria=rem;
    }
    
    public String toString(){
        return "Celular=(Marca: "+marca+"\nModelo: "+modelo+"\nColor: "+color+
                "\nProcesador= "+process+"\nCámara= "+camara+"\nRAM= "+memoria+")";
    }
}
