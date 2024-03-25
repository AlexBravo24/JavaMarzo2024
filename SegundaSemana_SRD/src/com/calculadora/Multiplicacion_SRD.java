package com.calculadora;

/**
 *
 * @author sebas
 */
public class Multiplicacion_SRD extends Calculadora_SRD{
    
    private double multiplicar;
    
    public Multiplicacion_SRD(){
        
    }
    
    public Multiplicacion_SRD(double multiplication, String marca, String color, boolean estilo, double precio){
        super(marca, color, estilo, precio);
        this.multiplicar=multiplication;
    }
    
    public double getMultiplicacion(){
        return multiplicar;
    }
    
    public void setMultiplicacion(double multiplicar2){
        this.multiplicar=multiplicar2;
    }
    
    @Override
    public double Calculos(){
        try{
            Multiplicacion();
        }catch(Exception s){
            System.err.println("Error: "+s);
        }
        return v*v2;
    }
    
    @Override
    public String toString(){
        return "\nCALCULADORA\n"
                + "Marca: "+getMarca()+"\n"
                + "Color: "+getColor()+"\n"
                + "Precio: "+getPrecio()+"\n"
                + "¿Es científica?: "+getEstilo()+"\n"
                + "Multiplicación: "+getMultiplicacion();
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
