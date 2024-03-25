package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //vamos a crear nuestra base de datos
		
		//declaramosnuestro HashMap
		
		Map<Integer, Cuenta> cuentas = new HashMap <Integer, Cuenta>();
		
		//Formas de agregar cuentas a nuestro HashMap
		
		Cuenta alex = new Cuenta ("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 1000, 100, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 1000, "Debito"));
		
		
		//si nos acrodamos para recuperar el valor de un objeto en i HashMap
//		System.out.println(cuentas.get(1003));
		
		//crear nuevo cajero
		
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		//probar el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//quiero retirar de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 11000));
		System.out.println(angelopolis.depositar(1003, 100));
	}

}
