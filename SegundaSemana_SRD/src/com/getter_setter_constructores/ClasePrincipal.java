package com.getter_setter_constructores;

/**
 *
 * @author sebas
 */
public class ClasePrincipal{
    public static void main(String[] args){
        Persona person=new Persona();
        /*person.nombre="";
        person.genero="";
        person.edad=29;*/
        person.setNombre("Sebastian");
        person.setGenero("Masculino");
        person.setEdad(25);
        
        Persona person2=new Persona("Sebastian", "Masculino", 16);
        person2.setEdad(16);
       
        System.out.println("Nombre: "+person2.getNombre());
        System.out.println("Género: "+person.getGenero()); 
        System.out.println("Edad: "+person.getEdad());
        
        
        System.out.println("\n"+person);
       
        System.out.println("\n"+person2);
    }
}
