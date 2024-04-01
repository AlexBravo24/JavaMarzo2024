package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// crear nuestro primer objeto de la clase persona con su constructor vacio
		Persona persona1 = new Persona(); 
	    Persona persona2 = new Persona("pablo","hombre",15);
	    
	    Equipos equipo3 = new Equipos("ARSENAL");
	    Equipos equipo2 = new Equipos("FC BARCELONA", 5,"ESPAÑA");
	    Equipos equipo1 = new Equipos();
	    
	   // Equipos.setTemporada(2022);//se puede modificar desde la clase principal 
	    persona1.setNombre("pavel");
	    persona1.setGenero("masculino");
	    persona1.setEdad(11);
	    equipo1.setNombre("MANCHESTER CITY");
	    equipo1.setPais("INGLATERRA");
	    equipo1.setTitulos(1);
	    
	   System.out.println(persona2);
	   System.out.println(persona1);
	   System.out.println("3 clubes con titulos de la champios league");
	   System.out.println(equipo1);
	   System.out.println(equipo2);
	   System.out.println(equipo3);
	}
	

}
