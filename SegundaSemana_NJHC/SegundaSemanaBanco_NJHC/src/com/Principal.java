package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;



public class Principal {

	public static void main(String[] args) {
		// vamos a crrear nuestra base de datos
		
		//Declaramos nuestro HashMap
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		
		//Para agregar cuentas n nuestro HashMap podemos hacerlo de dos formas
		//1.-creando la cuenta y agregandola despues , ejemplo:
		
		Cuenta alex = new Cuenta ("Alex", 13000, 4000, 50000, "Debito");
	
		cuentas.put (1001, alex);
		
		//creando las cuentas directamente en el HashMap
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("¨Pablo", 500, 100, 10000, "Debito"));
		
		// Si nos acordamos  para recuperar el valor de un objeto en mi hashMap
		//System.out.println(cuentas.get(1003));// nos da la informacion de Humberto : Humberto", 10000, 1000, 20000, "Debito"
	
		//creaar mi nuevo cajero 
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//probamos el metod consultar
		System.out.println(angelopolis.consulta(1001)); // nos regresa la cuenta null ya  que la cuenta esta vacia

		//probar el meto retirar exitoso
		System.out.println(angelopolis.retirar(1001, 8000));// tiene 13000 le voy a retirar 8000 se le resta 5000 Ticket [folio=1, fechaHora=Tue Mar 25 13:08:17 CST 2024, usuario=Alex, saldo=5000.0, sucursal=Angelopolis, idCajero=1]
		System.out.println(angelopolis.retirar(1001, 10000));// El monto a retirar excede el máximo permitido que es de 9000 por cajero
		
		//Ejemplo 2
		//Probando el metodo retirar exitoso retirando de 2 cajeros
		
		System.out.println(angelopolis.retirar(1001,9000));
		System.out.println(angelopolis.retirar(1001,1000));
				
		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006,6000));
				
		//Probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));// alex contaba con solo 4000 y se emite otro ticket y se hace el deposito de 50000 el total en su cuenta sera de 9000
		System.out.println(angelopolis.depositar(1003, 21000)); // el monto excede el maximo permitido
		
		
	}

}
