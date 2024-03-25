package com.api;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author sebas
 */
public class API{
    public static void main(String[] args) {
        Stream<String> nombres=Stream.of("Luis", "Cristofer", "Alex", "José Manuel")
                .filter(item->item.contains("i"));
        //System.out.println(nombres);
        
        List<String> nom=nombres.collect(Collectors.toList());
        //System.out.println(nom);
        
        List<Persona> ogirinal=new ArrayList<Persona>();
        
        List<Persona> filtrado=new ArrayList<Persona>();
        
        ogirinal.add(new Persona("Nancy", "Femenino", 23));
        ogirinal.add(new Persona("Cristofer", "Masculino", 20));
        ogirinal.add(new Persona("Nora", "Femenino", 22));
        ogirinal.add(new Persona("Luis", "Masculino", 22));
        
        System.out.println(ogirinal);
        
        for(int i=0;i<ogirinal.size();i++){
            System.out.println("\n"+ogirinal.get(i));
        }
        
        /*for(Persona i:ogirinal){
            System.out.println("\n"+i);
        }*/
        
        ogirinal.forEach(a->System.out.println("\n"+a));
        
        for(Persona i:ogirinal){
            if(i.getGenero().equals("Masculino")){
                filtrado.add(i);
                System.out.println("\n"+i);
            }
        }
        
        //Filtrar con el API Stream a las personas del género femenino
        /*filtrado=ogirinal.stream()
                .filter(item->item.getGenero().equals("Femenino"))
                .collect(Collectors.toList());
        
        System.out.println("");
        filtrado.forEach(System.out::println);*/
        
        //Ordenar la edad de las personas por edad ascendente
        /*filtrado=ogirinal.stream().sorted(Comparator.comparing(Persona::getEdad))
                .collect(Collectors.toList());
        
        filtrado.forEach(System.out::println);*/
        
        long conteo=ogirinal.stream().count();
        
        System.out.println("\nCantidad de personas: "+conteo);
        
        boolean no_one=ogirinal.stream().anyMatch(a->a.getEdad()<30);
        
        System.out.println("\nAlgunas de las edades son menores a 30: "+no_one);
        
        boolean all=ogirinal.stream().allMatch(a->a.getEdad()<30);
        
        System.out.println("\nTodos las edades son menores a 30: "+all);
        
        Optional<Persona> menorEdad=ogirinal.stream().min(Comparator.
                comparing(Persona::getEdad));
        
        System.out.println("\n¿Cuál es la persona con la edad más baja?\n"+menorEdad);
    }
}
