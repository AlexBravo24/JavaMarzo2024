package com.calculadora;

/**
 *
 * @author sebas
 */
public class Resta_SRD extends Calculadora_SRD{
    
    private double resta;
    
    public Resta_SRD(){
        
    }
    
    public Resta_SRD(int substraction, String marca, String color, boolean estilo, double precio){
        super(marca, color, estilo, precio);
        this.resta=substraction;
        
    }
    
    public double getResta(){
        return resta;
    }
    
    public void setResta(double resta2){
        this.resta=resta2;
    }
    
    @Override
    public double Calculos(){
        try{
            Resta();
        }catch(Exception s){
            System.err.println("Error: "+s);
        }
        return v-v2;
    }
    
    @Override
    public String toString(){
        return "\nCALCULADORA\n"
                + "Marca: "+getMarca()+"\n"
                + "Color: "+getColor()+"\n"
                + "Precio: "+getPrecio()+"\n"
                + "¿Es científica?: "+getEstilo()+"\n"
                + "Resta: "+getResta();
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
