package com;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		persona p1 = new persona("Pablo Antonio","Bacman",25);
		System.out.println(p1);
		
		System.out.println("Datos desde el constructor");
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Genero: "+p1.getGenero());
		System.out.println("Edad: "+p1.getEdad());
		
		System.out.println("Cambiando Datos . . .");
		p1.setNombre("Pablo Antonio Update");
		p1.setGenero("Mobiliario");
		p1.setEdad(26);
		
		System.out.println("Imprimiendo nuevos datos");
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Genero: "+p1.getGenero());
		System.out.println("Edad: "+p1.getEdad());
		
		System.out.println("---------------------- Objeto 1------------------------");
		perro dog = new perro("solo vino","mestizo",1);
		System.out.println(dog);
		
		System.out.println("Datos desde el constructor");
		System.out.println("Nombre: "+dog.getNombre());
		System.out.println("Raza: "+dog.getRaza());
		System.out.println("Edad: "+dog.getEdad());
		
		System.out.println("Cambiando Datos . . .");
		dog.setNombre("Puchis");
		dog.setRaza("Cholo");
		dog.setEdad(4);
		
		System.out.println("Imprimiendo nuevos datos");
		System.out.println("Nombre: "+dog.getNombre());
		System.out.println("Raza: "+dog.getRaza());
		System.out.println("Edad: "+dog.getEdad());
		
		System.out.println("---------------------- Objeto 2------------------------");
		celular phone = new celular("Sansunc","S23 Ultra","humilde");
		System.out.println(phone);
		
		System.out.println("Datos desde el constructor");
		System.out.println("Marca: "+phone.getMarca());
		System.out.println("Modelo: "+phone.getModelo());
		System.out.println("Color: "+phone.getColor());
		
		System.out.println("Cambiando Datos . . .");
		phone.setMarca("Aifon");
		phone.setModelo("15 plas");
		phone.setColor("Violeta");
		
		System.out.println("Imprimiendo nuevos datos");
		System.out.println("Marca: "+phone.getMarca());
		System.out.println("Modelo: "+phone.getModelo());
		System.out.println("Color: "+phone.getColor());
		
		System.out.println("---------------------- Objeto 3------------------------");
		heroe jiro = new heroe("Bacman","Dinero","masculino");
		System.out.println(jiro);
		
		System.out.println("Datos desde el constructor");
		System.out.println("Nombre: "+jiro.getNombre());
		System.out.println("Poder: "+jiro.getPoder());
		System.out.println("Genero: "+jiro.getGenero());
		
		System.out.println("Cambiando Datos . . .");
		jiro.setNombre("Aironmen");
		jiro.setPoder("Ingeniero");
		jiro.setGenero("masculino");
		
		System.out.println("Imprimiendo nuevos datos");
		System.out.println("Nombre: "+jiro.getNombre());
		System.out.println("Poder: "+jiro.getPoder());
		System.out.println("Genero: "+jiro.getGenero());
	}

}
