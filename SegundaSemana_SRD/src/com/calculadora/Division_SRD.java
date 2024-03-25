package com.calculadora;

/**
 *
 * @author sebas
 */
public class Division_SRD extends Calculadora_SRD{
    
    private double dividir;
    
    public Division_SRD(){
        
    }
    
    public Division_SRD(double split, String marca, String color, boolean estilo, double precio){
        super(marca, color, estilo, precio);
        this.dividir=split;
    }
    
    public double getDivision(){
        return dividir;
    }
    
    public void setDivision(double dividir2){
        this.dividir=dividir2;
    }
    
    public double Calculos(){
        Division();
        if(v2==0){
            System.out.println("No puedes dividir entre 0");
        }
        return v/v2;
    }
    
    @Override
    public String toString(){
        return "\nCALCULADORA\n"
                + "Marca: "+getMarca()+"\n"
                + "Color: "+getColor()+"\n"
                + "Precio: "+getPrecio()+"\n"
                + "¿Es científica?: "+getEstilo()+"\n"
                + "División: "+getDivision();
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
