package com.logica;

import java.util.Map;
import java.util.Date;

import com.modelo.Cuentas;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	private String sucursal;
	private Map<Integer,Cuentas> cuentas;
	
	private int folio = 1;
	
	Cajero(){
		
	}
	
	public Cajero(String sucursal, Map<Integer, Cuentas> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuentas Consultar(int numeroCuenta) {
		Cuentas cuenta = null;
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		//Buscando la cuenta y se hacen validaciones
		if(Consultar(numeroCuenta) != null) {
			Cuentas cuenta = Consultar(numeroCuenta);
			
			if(monto>9000) { //si el monto excede el maximo del cajero
				System.out.println("El monto a retirar excede el máximo permitido por cajero");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo Insuficiente para realizar el retiro");
				return ticket;
			}else if( (cuenta.getSaldo() - monto) <  cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++,new Date(),cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(Consultar(numeroCuenta) != null) {
			Cuentas cuenta = Consultar(numeroCuenta);
			//validaciones
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el máximo permitido en la cuenta");
				return ticket;
			}else if( (cuenta.getSaldo() +monto)> cuenta.getSaldoMax()){
				System.out.println("El saldo excedería el máximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++,new Date(),cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}
	

}
