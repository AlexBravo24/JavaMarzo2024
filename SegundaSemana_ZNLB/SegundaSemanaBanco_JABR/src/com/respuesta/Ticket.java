package com.respuesta;

import java.util.Date;

public class Ticket {

	//el proposito de esta clase es responder si las operaciones
	// se realizarion con exito o no
	
	private int folio;
	private Date fechaHora;
	private String usuario;
	private double saldo;
	private String Sucursal;
	private int idCajero;
	
	public Ticket () {}

	public Ticket(int folio, Date fechaHora, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.usuario = usuario;
		this.saldo = saldo;
		Sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return Sucursal;
	}

	public void setSucursal(String sucursal) {
		Sucursal = sucursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", Sucursal=" + Sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
	
	
	
	
	
	
}

