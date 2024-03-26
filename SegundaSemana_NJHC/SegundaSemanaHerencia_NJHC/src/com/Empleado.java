package com;
//La HERENCIA se realiza con la palabra reservada extends y despues el nombre de la case ue se va heredar
public class Empleado extends Persona {
// la clase empleado ahora se convierte en una clase hija por ue esta heredando atributos y metodos de la clase persona
	
	private String rfc;
	private String puesto;
	private String turno;
	private double salario;
	
	public Empleado () {
		
	}

	//clase padre
	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, String turno, double salario) {
		super(nombre, genero, edad);//constructor
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

// las clases hijas que heredan de una clase abstracta
	//de ven obligadas a implementar los metodos abstractos y definir
	//COMO se va a realizar 
	@Override
	public void comer(String comida) {
		System.out.println("Soy un empleado y voy a comer " + comida);
		
	}
	
	public void checarEntrada() {
		System.out.println("Entrando a las 8:00 am");
	}
	
	
	
}
