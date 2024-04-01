package com;

public class Empleado extends  Persona {
	private String rfc;
	private String puesto;
	private String turno;
	private Double salario;
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, String turno, Double salario) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.turno = turno;
		this.salario = salario;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Informacion del empleado: \n rfc=" + rfc + ", puesto=" + puesto + ", turno=" + turno + ", salario=" + salario
				+ "\n datos personales: " + super.toString();
	}
	@Override
	public void comer(String comida) {
		// TODO Auto-generated method stub
		System.out.println("hora de comer " + comida);
	}
	
	

}
