package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
// Aqui declaramos las operaciones que 
//la clase encargada de la logica tendra que resolver

	// consultar informacion de la cuenta
	public Cuenta consultar(int numeroCuenta);

	// retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// depositar recursos a nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);
}
