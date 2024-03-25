package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// Aqui declaramos las operaciones que la clase encargada de la lógica tendra
	// que resolver

	// Consultar una cuenta
	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos de nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);

}
