package com.servicio;

import com.modelo.Cuentas;
import com.respuesta.Ticket;

public interface IMetodos {
	//Aqui se declaran las operaciones que la clase encargada de la logica tendra que resolver
	
	public Cuentas Consultar(int numeroCuenta);
	
	public Ticket retirar(int numeroCuenta,double monto);
	
	public Ticket depositar(int numeroCuenta,double monto);
}
