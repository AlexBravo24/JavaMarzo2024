package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	//Aqui declaramos las operaciones que la clase encargadad de la logica
	//tendra que resolver
	
	//consultar una cuenta de banco
	public Cuenta consultar (int numeroCuenta);
	
	//retirar de recursos de la cuenta
	public Ticket retirar (int numeroCuenta, double monto);
	
	// Depositar de recursos de la cuenta
	public Ticket depositar (int numeroCuenta, double monto);
	
	
}
