package com.herencia_vehiculo_SRD;

/**
 *
 * @author sebas
 */
public class Motocicleta extends Vehiculo{
    private int cilindrada;
 
    public Motocicleta(){
        
    }
    
    public Motocicleta(String marca, String modelo, int anio, String matricula, int cilindrada){
        super(marca, modelo, anio, matricula);
        this.cilindrada=cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta\n" +
                "marca: "+getMarca()+"\n"+
                "modelo: "+getModelo()+"\n"+
                "matricula: "+getMatricula()+"\n"+
                "año: "+getAnio()+"\n"+
                "cilindrada: "+cilindrada;
    }
}
