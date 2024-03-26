package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {

		// Creamos nuestra base de datos

		// Declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		// Para agregar cuentas en nuestro HashMap
		// 1.- Crear una cuenta y agregarla despues

		Cuenta brandon = new Cuenta("Brandon", 13000, 4000, 50000, "Debito");
		cuentas.put(1001, brandon);

		// 2.- Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Alex", 15000, 5000, 60000, "Debito"));
		cuentas.put(1003, new Cuenta("Areli", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Liliana", 500, 100, 150000, "Debito"));

		// Si nos acordamos, para recuperar el valor de un objeto en el HashMap
		// System.out.println(cuentas.get(1004));

		// Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);

		// Probar el metodo consultar
		System.out.println(angelopolis.consultar(1006));

		// Voy a probar el método Retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));

		// Retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));

		// Vamos a probar el método Depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));

		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100));

	}

}
