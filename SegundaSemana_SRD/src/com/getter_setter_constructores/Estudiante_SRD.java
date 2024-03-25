package com.getter_setter_constructores;

/**
 *
 * @author sebas
 */
public class Estudiante_SRD extends Persona{
    private String turno, horario, matricula;
    private int grado;
    
    public Estudiante_SRD(){
        
    }
    
    public Estudiante_SRD(String shift, String schedule,
        String enrollment, int grade, String name, String gander, int age){
        super(name, gander, grade);
        this.turno=shift;
        this.horario=schedule;
        this.matricula=enrollment;
        this.grado=grade;
    }
    
    public String getTurno(){
        return turno;
    }
    
    public void setTurno(String turno2){
        this.turno=turno2;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public void setHorario(String horario2){
        this.horario=horario2;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula2){
        this.matricula=matricula2;
    }
    
    public int getGrado(){
        return grado;
    }
    
    public void setGrado(int grado2){
        this.grado=grado2;
    }
    
    public void Estudio(){
        System.out.println("Estoy estudiando");
    }
    
    public String regreso(){
        return "Estoy regresando";
    }
    
    @Override
    public String toString(){
        return "Estudiante= [Turno: "+turno+", horario: "+horario+", matrícula: "+matricula+", grado: "+grado+"]";
    }
}
