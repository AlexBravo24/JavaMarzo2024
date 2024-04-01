package com.modelo;

public class Cuenta {
	
	// En el paquete com.modelo guardamos la informacion 
	//de los objetos o entidades a los cuales queremos acceder
	//en este ejemplo necesitamos crear varias cuentas de 
	//usuarios y las agregaremos a un hash map para simular
	//una pequeña BD
	
	private String usuario;
	private double saldo;
    private double saldomin;
    private double saldomax;
    private String TipoCuenta;
    
    public Cuenta() {}

	public Cuenta(String usuario, double saldo, double saldomin, double saldomax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldomin = saldomin;
		this.saldomax = saldomax;
		TipoCuenta = tipoCuenta;
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

	public double getSaldomin() {
		return saldomin;
	}

	public void setSaldomin(double saldomin) {
		this.saldomin = saldomin;
	}

	public double getSaldomax() {
		return saldomax;
	}

	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}

	public String getTipoCuenta() {
		return TipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		TipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldomin=" + saldomin + ", saldomax=" + saldomax
				+ ", TipoCuenta=" + TipoCuenta + "]";
	}
    
    
}
