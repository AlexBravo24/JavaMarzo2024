package com.actividades.servicio;

import com.actividades.modelo.Cuentas_SRD;
import com.actividades.respuesta.Ticket;

/**
 *
 * @author sebas
 */
public interface Metodos{
    
    public Cuentas_SRD consultar(int numCuenta);
    public Ticket retirar(int numCuenta, double monto);
    public Ticket depositar(int numCuenta, double monto);
}
