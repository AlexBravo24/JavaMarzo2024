package com.logica;
import java.util.Date;
import java.util.Map;
import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;


public class Cajero implements IMetodos{
// En el paquete com.logica se encuentra la clase encargada de resolver las operaciones
	//vamos a declarar unos atributos de nuestro cajero
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;// el map lo llamaremos cuentas
	
	//Declarams una variable auxiliar para incrementar el folio en el ticket
	
	private int folio=1;
	
	public Cajero() {// constructor vacio
		
	}
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {// construnctor sin FOLIO
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta consulta(int numeroCuenta) {
		/*
		 * Necesitamos crear una cuenta vacia inicialmente
		 */
		
		Cuenta cuenta =null;// si se pide una cuenta como (1006) nos retorna un valor null ya que la cuenta no existe
		
		//Entonces para que no regrese null : asignamos posteriormente la cuenta si existente en el HashMap
		//si la cuenta existe se asigna y la guardamos
		cuenta = cuentas.get(numeroCuenta);
	
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		//Vamos a buscar la cuenta y necesitamos hacer una validaciones 
		/*
		 * Primero , si se encuentra o localiza la cuenta, la asignamos para manipularla
		 */
		if(consulta(numeroCuenta) !=null) {
			Cuenta cuenta = consulta (numeroCuenta);
			//una ves localizamos la cunta para manipural
			//realizamos ciertas validaciones
			
			
			if(monto>9000) { //validamos si el monto excede el maximo del cajero
				System.out.println("El monto a retirar excede el máximo permitido por cajero");
				return ticket;
			}else if(cuenta.getSaldo()<monto) {// si el saldo es menor al monto a retirar
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
			System.out.println("No exite una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(consulta(numeroCuenta) != null) {
			Cuenta cuenta = consulta(numeroCuenta);
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
		
	}//cierre de ticket

} // cierre de cajero
