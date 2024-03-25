package com.actividades.respuesta;

import java.util.*;

/**
 *
 * @author sebas
 */
public class Ticket{
    
    private Date fechaHora;
    private String usuario, sucursal;
    private double saldo;
    private int ID_Cajero, folio;
    
    public Ticket(){
        
    }
    
    public Ticket(Date date, String user, String branch, 
            double balance, int ID_ATM, int invoice){
        super();
        this.fechaHora=date;
        this.usuario=user;
        this.sucursal=branch;
        this.saldo=balance;
        this.ID_Cajero=ID_ATM;
        this.folio=invoice;
        
    }
    
    public Date getFechaHora(){
        return fechaHora;
    }
    
    public void setFechaHora(Date fechaHora2){
        this.fechaHora=fechaHora2;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario2){
        this.usuario=usuario2;
    }
    
    public String getSucursal(){
        return sucursal;
    }
    
    public void setSucursal(String sucursal2){
        this.sucursal=sucursal2;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo2){
        this.saldo=saldo2;
    }
    
    public int getID_Cajero(){
        return ID_Cajero;
    }
    
    public void setID_Cajero(int ID_Cajero2){
        this.ID_Cajero=ID_Cajero2;
    }
    
    public int getFolio(){
        return folio;
    }
    
    public void setFolio(int folio2){
        this.folio=folio2;
    }
    
    public String toString(){
        return "\nTICKET\n"
                + "Fecha: "+fechaHora+"\n"
                + "Usuario: "+usuario+"\n"
                + "Sucursal: "+sucursal+"\n"
                + "Saldo: "+saldo+"\n"
                + "ID del Cajero: "+ID_Cajero+"\n"
                + "Folio: "+folio+"\n";
    }
}
