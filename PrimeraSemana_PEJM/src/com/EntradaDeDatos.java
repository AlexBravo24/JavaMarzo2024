package com;
import java.util.Scanner;

public class EntradaDeDatos {
  public static void main(String[] args) 
{
	int edad;
	double estatura;
	
	@SuppressWarnings("resource")
	Scanner entrada = new Scanner (System.in);
	System.out.println("introduce tu edad: ");
	edad= entrada.nextInt();
	System.out.println("introduce tu estatura: ");
	estatura= entrada.nextDouble();
	System.out.println("tu edad es: "+ edad + " y tu estatura es: " + estatura);
}
}
