package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Camara canon = new Camara("canon", 2, 108);
         Procesador snap = new Procesador("Amlogic", "Snapdragon", 3.5);
         Ram ddr1 = new Ram("kingston", "ddr1", 8);
          Champions t2024 = new Champions("Temporada-2024", "Grupo C", 5);
          Copa rey= new Copa("Copa del rey", "semifinales", "Atletic club", 12);
          Champions temp2024 = new Champions("Temporada-2024", "Grupo A", 14);
          Copa rey2= new Copa("Copa del rey", "semifinales", "Atletico de MAdrid", 17);
         Celular lg = new Celular("LG", "A5", "negro", canon,snap, ddr1);
         Equipo Barcelona = new Equipo("Barcelona", "España", 31,t2024,rey);
         Equipo Real = new Equipo("Real madrid", "España", 37,temp2024,rey2);
         System.out.println(lg);
         System.out.println(Barcelona);
         System.out.println(Real);
	}

}
