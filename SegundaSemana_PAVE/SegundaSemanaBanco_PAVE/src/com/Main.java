package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuentas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Cuentas> cuentas = new HashMap<Integer,Cuentas>();
		
		Cuentas alex = new Cuentas("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		cuentas.put(1002, new Cuentas("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuentas("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuentas("¨Pablo", 500, 100, 10000, "Debito"));
		
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probando el método consultar
		System.out.println(angelopolis.Consultar(1001));
		
		//Probando el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001,9000));
		System.out.println(angelopolis.retirar(1001,9000));
		
		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006,6000));
		
		//Probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		System.out.println(angelopolis.depositar(1003, 21000));
		
		
		/*for(Integer i: cuentas.keySet()) {
			System.out.println("No. Cuenta: "+i+" Info: "+cuentas.get(i));
		}*/
	}

}
