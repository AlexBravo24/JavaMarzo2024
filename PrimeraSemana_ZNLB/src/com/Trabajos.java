package com;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Trabajos {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int b = 1;
		
		while (b <12) {
			x = 12*b;
			System.out.println("12" + "x" + b + "=" + x);
			b++;
		}
	
	}
	
	public static void main1(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
    int x = 0;
    int b = 1;
    int c = 0;
    int s = 0;
    System.out.println("escribe el numero que quiere multiplicar" );
    c = input.nextInt();
    System.out.println("hasta que numero" );
    s = input.nextInt();
    while (b<=s) {
        x = c*b;
        System.out.println(c + "x" + b + "=" + x);
        b++;
    }
	
	input.close();
	
	
}
	
	public static void main11(String[] args) throws Exception{
		// TODO Auto-generated method stub

		 Thread dormir = new Thread();
	        for (int hora = 0; hora <= 23; hora++){
	            for (int minutos = 0; minutos <= 59; minutos++){
	                for (int segundos = 0; segundos <= 59; segundos++){
	                    System.out.println("La hora es: " + String.format("%02d:%02d:%02d", hora, minutos, segundos));
	                    Thread.sleep(10);
	                }
	            }
	        }

	        while (true){
	            LocalTime currenttime = LocalTime.now();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	            String hora = currenttime.format(formatter);
	            System.out.println("La hora es: " + hora);

	            Thread.sleep(1000);
	        }

	    }
	
	
	public static class InteresMensual {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			 double monto = 1000;
		        double ganancia = 0.02;

		        for (int i = 1; i <= 12; i++){
		            monto = monto * (1 + ganancia);
		            System.out.println("Tu monto en el mes " + i + " es de: " + String.format("%.2f", monto));
		        }

		        System.out.println("Tu dinero al final del año es: $" + String.format("%.2f", monto));
		        
		}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

		
