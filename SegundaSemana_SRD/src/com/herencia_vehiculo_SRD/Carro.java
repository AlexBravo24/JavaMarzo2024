package com.herencia_vehiculo_SRD;

/**
 *
 * @author sebas
 */
public class Carro extends Vehiculo{
    
    private int puertas, llantas;
    private boolean cajuela;
    
    public Carro(){
        
    }
    
    public Carro(int port, int tire, boolean trunk, 
            String marca, String modelo, String matricula, int anio){
        super(marca, modelo, anio, modelo);
        this.puertas=port;
        this.llantas=tire;
        
    }
    
    public int getLlantas(){
        return llantas;
    }
    
    public void setLlantas(int llantas2){
        this.llantas=llantas2;
    }
    
    public int getPuertas(){
        return puertas;
    }
    
    public void setPuertas(int puertas2){
        this.puertas=puertas2;
    }
    
    public boolean getCajuela(){
        return cajuela;
    }
    
    public void setCajuela(boolean cajuela2){
        this.cajuela=cajuela2;
    }
    
    @Override
    public String toString(){
        return "Automovil\n"+
                "marca: "+getMarca()+"\n"+
                "modelo: "+getModelo()+"\n"+
                "año:"+getAnio()+"\n"+
                "numPuertas: "+puertas+"\n"+
                "numLlantas: "+llantas+" \n";
    }
}
