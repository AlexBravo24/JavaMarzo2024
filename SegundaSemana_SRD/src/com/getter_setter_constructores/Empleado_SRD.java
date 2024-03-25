package com.getter_setter_constructores;

/**
 *
 * @author sebas
 */
public class Empleado_SRD extends Persona{
    private String RFC, puesto, turno;
    private double salario;
    
    public Empleado_SRD(){
        
    }
    
    public Empleado_SRD(String nombre, String genero, int edad,
            String rfc, String job, String shift, double salary){
        super(nombre, genero, edad);
        this.RFC=rfc;
        this.puesto=job;
        this.turno=shift;
        this.salario=salary;
        
    }
    
    public String getRFC(){
        return RFC;
    }
    
    public void setRFC(String rfc2){
        this.RFC=rfc2;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuesto(String puesto2){
        this.puesto=puesto2;
    }
    
    public String getTurno(){
        return turno;
    }
    
    public void setTurno(String turno2){
        this.turno=turno2;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario2){
        this.salario=salario2;
    }
    
    @Override
    public String toString(){
        return "Empleado= [RFC: "+RFC+", puesto: "+puesto+"\nturno: "+turno+", salario: $"+salario+"]";
    }
}
