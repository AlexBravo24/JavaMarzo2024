package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// vamos a crear la base de datos

		// declarar hashMap

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		// para agregar cuentas en nuestro HashMAp podemos hacerlo
		// de dos formas
		// creando la cuenta y agregandola despues

		Cuenta alex = new Cuenta("Alex", 15000, 3000, 40000, "debito");
		
		cuentas.put(1001, alex);
		
		//creando cuentas directamente en el HashMap
		
		cuentas.put(1002,new Cuenta("Oliva", 12000, 2000, 20000, "debito"));
		cuentas.put(1003,new Cuenta("Pavel", 4000, 2000, 30000, "debito"));
		cuentas.put(1004,new Cuenta("Rolas", 500, 100, 12000, "debito"));
		cuentas.put(1005,new Cuenta("Dalia", 1200, 1000, 10000, "debito"));
		
		//crear nuevo cajero
		
		Cajero angelopolis = new Cajero("Angelopolis",cuentas);
		
		System.out.println(angelopolis.consultar(1004));
		//probar metodo retirar exitoso
	    System.out.println(angelopolis.retirar(1001,8000));	
	  //probar metodo retirar por debajo del minimo
	    System.out.println(angelopolis.retirar(1001,4001));	
	  //probar metodo retirar saldo insuficiente
	    System.out.println(angelopolis.retirar(1001,8000));	
	  //probar metodo retirar a usuario inexistente
	    System.out.println(angelopolis.retirar(1006,8000));	
	  //depositar exediendo saldo maximo
	    System.out.println(angelopolis.depositar(1001, 34000));
	  //depositar exitoso
	    System.out.println(angelopolis.depositar(1001, 4000));	    
	}
}
