package com.actividad2;

/**
 *
 * @author sebas
 */
public class MusicaPrincipal{
    public static void main(String[] args){
        
        //Constructor vacío con metodos getter y setter
        Musica music=new Musica();
        
        music.setNombre("Man With a Mission");
        music.setGenero("Rock y musica anime");
        music.setTipo("Shibuya, Tokyo, Japón");
        music.setTrayectoria(14);
        
        
        System.out.println("Nombre del Grupo: "+music.getNombre());
        System.out.println("Género musical: "+music.getGenero());
        System.out.println("Lugar proveniente: "+music.getPais());
        System.out.println("Años de trayectoria: "+music.getTrayectoria());
        
        //Constructor con parámetros
        Musica music2=new Musica("Grupo Firme", "Regional Mexicano", "Tijuana, Baja California, México", 9);
        
        System.out.println("\nNombre del Grupo: "+music2.getNombre());
        System.out.println("Género musical: "+music2.getGenero());
        System.out.println("País proveniente: "+music2.getPais());
        System.out.println("Años de trayectoria: "+music2.getTrayectoria());
        
        //Método toString()
        Musica music3=new Musica("Fuerza Regida", "Regional Mexicano", "Tijuana, Baja California, México", 8);
        
        System.out.println("\n"+music3);
    }
}
