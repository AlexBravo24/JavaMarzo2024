package com;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona juan = new Persona("Juan","Masculino",27);
		
		System.out.println(juan);
		
		//Employee jorge = new Employee("Jorge","Masculino",33,"JRG9776","Desarrollador","Matutino",30000);
		Employee jorge = new Employee("JRG9776","Desarrollador","Matutino",30000);
		System.out.println(jorge);
		
		Estudiante eunice = new Estudiante("16680263", "Matutino", "07:00 - 15:00", "Sexto");
		System.out.println(eunice);
		
		
	}

}
