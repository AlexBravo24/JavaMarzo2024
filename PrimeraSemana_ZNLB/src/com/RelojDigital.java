package com;

import java.lang.Thread;


public class RelojDigital {

	public static void main(String[] args) throws Exception{
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

	       

	    }
		
		
	
		
	}
	


