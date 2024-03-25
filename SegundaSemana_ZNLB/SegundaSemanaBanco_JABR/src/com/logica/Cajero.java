package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	//En el paquete com.logica, se encuetra la clase
	// encargada de resolver las operaciones
	
	//vamos a declarar unos atributos de nuestro cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//declarar variable auxiliar para incrementar el folio en nuestro ticket
	
	private int folio=1;
	
	public Cajero () {}
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}





	@Override
	public Cuenta consultar(int numeroCuenta) {
		
		//Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;
		
		//entonces asignamos posteriormente la cuenta si existe en el hashmap
		cuenta = cuentas.get(1001);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		//buscar cuentas y validaciones
		//primero si se encuentra la cuenta o localiza la cuenta, la asignamos
		//para manipularla
		if(consultar(numeroCuenta) !=null); {
			Cuenta cuenta = consultar(numeroCuenta);
			//localizamos la cuenta para manipular
			//realizamos validaciones
			if (monto>9000) {
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			} else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			}else {//si actualizamos el saldo de nuestra cuenta
				//actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); //realizamos el retiro
				//Ahora se emite un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo() , sucursal, 1);
				return ticket;
			}
			
			
			
		} 

}
	
	
	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El sado excedera el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo() , sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay cuenta asociada a ese cliente");
			return ticket;
		}
		
		
		
		
		
		
	}

}
