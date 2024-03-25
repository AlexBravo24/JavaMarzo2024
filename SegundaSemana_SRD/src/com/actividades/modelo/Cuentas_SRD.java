package com.actividades.modelo;

/**
 *
 * @author sebas
 */
public class Cuentas_SRD{
    
    private String usuario, tipoCuenta;
    private double saldo, saldoMin, saldoMax;
    
    public Cuentas_SRD(){
        
    }
    
    public Cuentas_SRD(String usuario, String tipoCuenta, 
            double balance, double balanceMin, double balanceMax){
        super();
        this.usuario=usuario;
        this.tipoCuenta=tipoCuenta;
        this.saldo=balance;
        this.saldoMin=balanceMin;
        this.saldoMax=balanceMax;
        
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario2){
        this.usuario=usuario2;
    }
    
    public String getTipoCuenta(){
        return usuario;
    }
    
    public void setTipoCuenta(String tipocuenta2){
        this.tipoCuenta=tipocuenta2;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo2){
        this.saldo=saldo2;
    }
    
    public double getSaldoMin(){
        return saldoMin;
    }
    
    public void setSaldoMin(double saldoMin2){
        this.saldoMin=saldoMin2;
    }
    
    public double getSaldoMax(){
        return saldoMax;
    }
    
    public void setSaldoMax(double saldoMax2){
        this.saldoMax=saldoMax2;
    }
    
    public String toString(){
        return "CUENTA\n"
                + "Usuario: "+usuario+"\n"
                + "Tipo de cuenta: "+tipoCuenta+"\n"
                + "Saldo: "+saldo+"\n"
                + "Saldo mínimo: "+saldoMin+"\n"
                + "Saldo máximo: "+saldoMax+"\n";
    }
}
