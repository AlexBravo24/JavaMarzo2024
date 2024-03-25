package com.actividades.logica;

import com.actividades.modelo.Cuentas_SRD;
import com.actividades.respuesta.Ticket;
import com.actividades.servicio.Metodos;
import java.util.*;

/**
 *
 * @author sebas
 */
public class Cajero_SRD implements Metodos{
    
    private String sucursal;
    private Map<Integer, Cuentas_SRD> cuentas;
    private int folio=1;
    
    public Cajero_SRD(){
        
    }
    
    public Cajero_SRD(String branch, Map<Integer, Cuentas_SRD> operations){
        super();
        this.sucursal=branch;
        this.cuentas=operations;
    }
    
    @Override
    public Cuentas_SRD consultar(int numCuenta){
        Cuentas_SRD cuenta=null;
        if(cuentas.get(numCuenta)!=null){
            cuenta=cuentas.get(numCuenta);
            return cuenta;
        }else{
            System.out.println("La cuenta no existe");
            return cuenta;
        }
    }
    
    @Override
    public Ticket retirar(int numCuenta, double monto){
        Ticket ticket=null;
        if(consultar(numCuenta)!=null){
            Cuentas_SRD cuenta=consultar(numCuenta);
            if(monto>9000){
                System.out.println("El monto excede a lo máximo permitido en el cajero");
                //return ticket;
            }else if(cuenta.getSaldo()<monto){
                System.out.println("Saldo insuficiente para hacer el retiro");
                return ticket;
            }else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()){
                System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
                return ticket;
            }else{
                System.out.println("¡¡RETIRO EXITOSO!!");
                cuenta.setSaldo(cuenta.getSaldo()-monto);
                ticket=new Ticket(new Date(), cuenta.getUsuario(), sucursal, cuenta.getSaldo(), 1, folio++);
                return ticket;
            }
        }else{
            System.out.println("No existe cuenta asosiada con este cliente");
            return ticket;
        }
        return ticket;
    }
    
    @Override
    public Ticket depositar(int numCuenta, double monto){
        Ticket recibo=null;
        if(consultar(numCuenta)!=null){
            Cuentas_SRD deposito=consultar(numCuenta);
            if(monto>deposito.getSaldoMax()){
                System.out.println("El monto a depositar excede al máximo permitido en la cuenta");
                return recibo;
            }else if(deposito.getSaldo()+monto>deposito.getSaldoMax()){
                System.out.println("El saldo excedería el máximo permitido en la cuenta");
                return recibo;
            }else{
                System.out.println("¡¡DEPOSITO EXITOSO!!");
                deposito.setSaldo(deposito.getSaldo()+monto);
                recibo=new Ticket(new Date(), deposito.getUsuario(), sucursal, deposito.getSaldo(), 1, folio++);
                return recibo;
            }
        }else{
            System.out.println("La cuenta no existe");
            return recibo;
        }
    }
    
}
