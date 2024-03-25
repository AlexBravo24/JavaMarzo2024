package com.api;

/**
 *
 * @author sebas
 */
public class Persona{
    private String nombre, genero;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String nombre, String genero, int edad){
        super();
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
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
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int age){
        this.edad=age;
    }
    
    public String toString(){
        return "PERSONA\n"
                +"Nombre: "+nombre+"\n"
                +"Género: "+genero+"\n"
                +"Edad: "+edad;
    }
}
