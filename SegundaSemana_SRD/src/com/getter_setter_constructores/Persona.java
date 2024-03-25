package com.getter_setter_constructores;

/**
 *
 * @author sebas
 */
public class Persona{

    private String nombre, genero;
    private int edad;
    
    public Persona(){
        
    }
    
    public Persona(String nom, String gen, int edad){
        super();
        this.nombre=nom;
        this.genero=gen;
        this.edad=edad;
    }
    
    /*public Persona(String n){
        super();
        this.nombre=n;
    }*/
    
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
    
    public void Saludo(String saludo){
        System.out.println(saludo);
    }
    
    public String Saludo2(String saludo){
        return saludo;
    }
    
    public void saludar(String saludo, String hora){
        System.out.println(saludo+" "+hora);
    }
    
    public void Suma(int v, int v2){
        System.out.println("La suma de los valores es: "+(v+v2));
    }
    
    @Override
    public String toString(){
        return "Persona=[nombre: "+nombre+", género: "+genero+", edad: "+edad+"]";
    }
}
