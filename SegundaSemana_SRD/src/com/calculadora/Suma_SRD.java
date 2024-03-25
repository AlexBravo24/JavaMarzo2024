package com.calculadora;

/**
 *
 * @author sebas
 */
public class Suma_SRD extends Calculadora_SRD{
    
    private double suma;
    
    public Suma_SRD(){
        
    }
    
    public Suma_SRD(double addition, String marca, String color, boolean estilo, double precio){
        super(marca, color, estilo, precio);
        this.suma=addition;
    }
    
    public double getSuma(){
        return suma;
    }
    
    public void setSuma(double suma2){
        this.suma=suma2;
    }
    
    @Override
    public double Calculos(){
        try{
            Suma();
        }catch(Exception s){
            System.err.println("Error: "+s);
        }
        return v+v2;
    }
    
    @Override
    public String toString(){
        return "\nCALCULADORA\n"
                + "Marca: "+getMarca()+"\n"
                + "Color: "+getColor()+"\n"
                + "Precio: "+getPrecio()+"\n"
                + "¿Es científica?: "+getEstilo()+"\n"
                + "Suma: "+getSuma();
    }
    
    @Override
    public void Sumar(int i, int s){
        
    }
    
    @Override
    public void Restar(int i, int s){
        
    }
    
    @Override
    public void Dividir(int i, int s){
        
    }
    
    @Override
    public void Multiplicar(int i, int s){
        
    }
    
}
