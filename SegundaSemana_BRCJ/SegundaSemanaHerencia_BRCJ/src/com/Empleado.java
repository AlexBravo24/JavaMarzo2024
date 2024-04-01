package com;

//HERENCIA - Se realiza con la palabra reservada extends
public class Empleado extends Persona {

	private String rfc;
	private String puesto;
	private String turno;
	private double salario;

	public Empleado() {

	}

	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, String turno, double salario) {
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", puesto=" + puesto + ", turno=" + turno + ", salario=" + salario
				+ ", toString()=" + super.toString() + "]";
	}

	//Las clases hija que heredan de una clase abstracta se ven obligadas a implementar los m�todos abstractos y definen c�mo
	//se va a realizar
	@Override
	public void comer(String comida) {
		System.out.println("Soy un empleado y voy a comer" + comida);
	}
	
	public void checarEntrada() {
		System.out.println("Entrando a las 8:00 am");
	}

}