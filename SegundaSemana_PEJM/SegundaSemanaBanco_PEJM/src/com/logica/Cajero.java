package com.logica;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	//En el paquete com.logica se encuentra la clase de resolver las operaciones
	
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;
	//declarar variable auxiliar para
	//incrementar el folio en el ticket
	private int folio=1;
	
	public Cajero() {
		super();
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// TODO Auto-generated method stub
		Cuenta cuenta=null;
	  
		cuenta=cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		Ticket ticket= null;
		//buscar la cuenta y necesitamos hacer validaciones
		//primero si se encuentra la cuenta, se asigna para manipularla
		if(consultar(numeroCuenta) !=null)
		{
			Cuenta cuenta= consultar(numeroCuenta);
			//una vez localizamos la cuenta para manipular
			//realizamos ciertas validaciones
			if(monto>9000)
			{
				System.out.println("ha superado el monto maximo permitido por el cajero");
				return ticket;
			}
			else if (cuenta.getSaldo()<monto)
			{
				System.out.println("no cuentas con saldo suficiente , tu saldo actual es: "+ cuenta.getSaldo());
				return ticket;
			}else if ((cuenta.getSaldo()-monto)<cuenta.getSaldomin())
			{
				System.out.println("El retiro dejara por debajo del minimo a la cuenta");
				return ticket;
			}else 
			{
				//si el retiro puede realizarse
				//actualizamos saldo
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			//como la operacion es exitosa, se emite nuevo tiket
			
			ticket= new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
			return ticket;
			}
		}
		else
		{
		System.out.println("no existe una cuenta asociada a ese cliente");
		return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket= null;
		//buscar la cuenta y necesitamos hacer validaciones
		//primero si se encuentra la cuenta, se asigna para manipularla
		if(consultar(numeroCuenta) !=null)
		{
			Cuenta cuenta= consultar(numeroCuenta);
			//una vez localizamos la cuenta para manipular
			//realizamos ciertas validaciones
			
			if ((cuenta.getSaldo()+monto)>cuenta.getSaldomax())
			{
				System.out.println("El deposito exederia el saldo maximo que puede tener en su cuenta");
				return ticket;
			}else 
			{
			//si el retiro puede realizarse
			//actualizamos saldo
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			//como la operacion es exitosa, se emite nuevo tiket
			
			ticket= new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
			return ticket;
			}
		}
		else
		{
		System.out.println("no existe una cuenta asociada a ese cliente");
		return ticket;
		}
	}

}
