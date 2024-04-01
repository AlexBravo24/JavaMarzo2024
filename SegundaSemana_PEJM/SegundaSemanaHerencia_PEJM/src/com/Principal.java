package com;

public class Principal {
	public static void main(String[] args) {
//		no se puede crear objetos de una clase abstracta , solo 
//		se pueden acceder a sus datos mediante una clase hija
//		como empleado o estudiante
//	Persona juan = new Persona("","",1);
 Empleado empleado = new Empleado("pavel", "Masculino", 12, "JIUM11K21", "director general","matutino", 12750.00);
 Alumno alumno = new Alumno("Mateo","Masculino", 13, 18361094,891278, 6, "Matutino", 7);
 System.out.println(alumno);
 System.out.println(empleado);
 
 //probando metodo dormir
 
 alumno.dormir();
 //probando metodo saludar
 String Hello=empleado.saludar();
 System.out.println(Hello);
 
 //probando metodo saludar polimorfico
 alumno.saludar("hola guenas guenas");
 alumno.saludar("son las :", "10:30 de la mañana");
 alumno.saludar();
 alumno.sumar(10, 2);
 alumno.comer(" ensalada");
 empleado.comer("piña");
 
 //ejemplo de polimorfismo de asignacion
 
 Persona Pavel = new Alumno("Pavel ", "masculino",24, 18361094, 718712897, 11, "Matutino", 12);
 System.out.println(Pavel);
}
}