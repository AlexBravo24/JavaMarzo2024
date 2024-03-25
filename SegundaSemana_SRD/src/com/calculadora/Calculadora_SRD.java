package com.calculadora;
import java.util.*;

/**
 *
 * @author sebas
 */
public abstract class Calculadora_SRD{
    
    private String marca, color;
    private double precio;
    private boolean estilo;
    protected double v, v2;
    Scanner d=new Scanner(System.in);
    
    public Calculadora_SRD(){
        
    }
    
    public Calculadora_SRD(String brand, String iro, boolean style, double price){
        super();
        this.marca=brand;
        this.color=iro;
        this.estilo=style;
        this.precio=price;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca2){
        this.marca=marca2;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color2){
        this.color=color2;
    }
    
    public boolean getEstilo(){
        return estilo;
    }
    
    public void setEstilo(boolean estilo2){
        this.estilo=estilo2;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio2){
        this.precio=precio2;
    }
    
    public abstract double Calculos();
    public abstract void Sumar(int i, int e);
    public abstract void Restar(int i, int e);
    public abstract void Dividir(int i, int e);
    public abstract void Multiplicar(int i, int e);
    
    public void Multiplicacion(){
        try{
            System.out.println("\nIngresa el valor 1:");
            v=d.nextDouble();
            System.out.println("\nIngresa el valor 2:");
            v2=d.nextDouble();
        }catch(Exception s){
            System.out.println("\nNo se permiten letras o caracteres");
        }
    }
    
    public void Division(){
        try{
            System.out.println("\nIngresa el valor 1:");
            v=d.nextDouble();
            System.out.println("\nIngresa el valor 2:");
            v2=d.nextDouble();
        }catch(Exception s){
            System.out.println("\nNo se permiten letras o caracteres");
        }
    }
    
    public void Resta(){
        try{
            System.out.println("\nIngresa el valor 1:");
            v=d.nextDouble();
            System.out.println("\nIngresa el valor 2:");
            v2=d.nextDouble();
        }catch(Exception s){
            System.out.println("\nNo se permiten letras o caracteres");
        }
    }
    
    public void Suma(){
        try{
            System.out.println("\nIngresa el valor 1:");
            v=d.nextDouble();
            System.out.println("\nIngresa el valor 2:");
            v2=d.nextDouble();
        }catch(Exception s){
            System.out.println("\nNo se permiten letras o caracteres");
        }
    }
    
    public String toString(){
        return "CALCULADORA\n"
                + "Marca: "+marca+"\n"
                + "Color: "+color+"\n"
                + "Precio: "+precio+"\n"
                + "¿Es científica?: "+estilo;
    }
}
