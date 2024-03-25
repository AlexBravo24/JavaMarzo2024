package com;

public abstract class Estudiante extends Persona {

	private String semestre;
	private String carrera;
	private double matricula;
	
	public Estudiante(String nombre, String genero, int edad, String semestre, String carrera, double matricula) {
		super(nombre, genero, edad);
		this.semestre = semestre;
		this.carrera = carrera;
		this.matricula = matricula;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Estudiante [semestre=" + semestre + ", carrera=" + carrera + ", matricula=" + matricula
				+ ", toString()=" + super.toString() + "]";
	}
	

	
	
}
