package com.getter_setter_constructores;

/**
 *
 * @author sebas
 */
public class HerenciaPrincipal_SRD{
    public static void main(String[] args){
        Persona BEATRIZ=new Persona("Beatriz", "Femenino", 23);
        Empleado_SRD beatriz=new Empleado_SRD("Beatriz", "Femenino", 30, "BZRP293490", "Desarrolladora", "Matutino", 3000.0);
        System.out.println(BEATRIZ+"\n"+beatriz);
        BEATRIZ.saludar("Y que paso", "son las 10");
        System.out.println("");
        
        Persona EDWIN=new Persona("Edwin", "Masculino", 30);
        Empleado_SRD edwin=new Empleado_SRD("Edwin", "Masculino", 30, "EWCZ92383", "Desarrollador", "Matutino", 30000.0);
        System.out.println(EDWIN+"\n"+edwin);
        System.out.println(EDWIN.Saludo2("Y como andamos\n"));
        
        Persona YUKIKO=new Persona("Yukiko", "Femenino", 20);
        Estudiante_SRD yukiko=new Estudiante_SRD("Matutino", "8am a 2pm", "YKKZK8839289", 2, "Yukiko", "Femenino", 20);
        System.out.println(YUKIKO+"\n"+yukiko);
        System.out.println(yukiko.regreso());
        
        YUKIKO.Saludo("Que onda como estan");
        YUKIKO.Suma(10, 5);
        
        yukiko.Estudio();
        System.out.println("");
        String info=yukiko.toString();
        System.out.println(info);   
    }
}
