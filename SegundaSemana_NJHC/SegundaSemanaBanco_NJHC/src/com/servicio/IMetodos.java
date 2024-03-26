package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
//Aqui declaramos las operaciones que la clase encagada de la logica tendra que resolver
	
	//consultar una cuenta de banco 
	public Cuenta consulta(int numeroCuenta);
	
	//Retirar recursos de nuestra cuenta si es correcta devolveremos un ticket
	
	public Ticket retirar (int numeroCuenta, double monto);
	
	//depositar recursos en nuestra cuenta
	
	public Ticket depositar (int numeroCunta, double monto);
	
	
	
	
}
