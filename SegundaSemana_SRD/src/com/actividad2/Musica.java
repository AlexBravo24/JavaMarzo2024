package com.actividad2;

/**
 *
 * @author sebas
 */
public class Musica{
    private String nombre, genero, pais;
    private int trayectoria=14;
    
    public Musica(){
        
    }
    
    public Musica(String nom, String gen, String tip, int trayecto){
        super();
        this.nombre=nom;
        this.genero=gen;
        this.pais=tip;
        this.trayectoria=trayecto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String name){
        this.nombre=name;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String gender){
       this.genero=gender;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setTipo(String country){
        this.pais=country;
    }
    
    public int getTrayectoria(){
        return trayectoria;
    }
    
    public void setTrayectoria(int trajectory){
        this.trayectoria=trajectory;
    }
    
    @Override
    public String toString(){
        return "Nombre del Grupo: "+nombre+"\nGenero musical: "+genero+"\nPaís de Origen: "+pais+"\nAños de trayectoria: "+trayectoria;
    }
}
