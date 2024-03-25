package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//antes de crear el celular, debemos crear los objetos
		// que formaran parte de los celulares

		Camara canon = new Camara("Canon", 2, 48);
		
		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);
		
		Ram kingston = new Ram("Kingston", "DDR5", 8);
		
		
		//Ahora si ya podemos crear nuestro celuilar y
		//pasamos nuestros valores de camara, cpu y ram
		
		Celular motorola = new Celular("Motorola", "Z2", "Negro", canon, snap, kingston);
	
		//imprimir en consola el celular
		System.out.println(motorola);
		
		//Crear objeto que se ponga de otros 3
		
//		Tamaño tamaño = new Tamaño(10, 24, 2);
//		
//		SalidaAudio salidaAudio = new SalidaAudio(1080, "HDMI", 720);
//		
//		ConsumoEnergia consumoEnergia = new ConsumoEnergia("4W", "3w", "1w");
//	
//		NintendoSwitch Oled = NintendoSwitch (tamaño, salidaAudio, consumoEnergia);
//		
//		System.out.println(Oled);
		
				
	
		
		
		
		
		
	}

	private static NintendoSwitch NintendoSwitch(Tamaño tamaño, SalidaAudio salidaAudio,
			ConsumoEnergia consumoEnergia) {
		// TODO Auto-generated method stub
		return null;
	}

}
