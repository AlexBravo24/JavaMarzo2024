package com;

public class Estudiante {
	private String matricula;
	private String turno;
	private String horario;
	private String grado;
	
	Estudiante(){
		
	}

	public Estudiante(String matricula, String turno, String horario, String grado) {
		super();
		this.matricula = matricula;
		this.turno = turno;
		this.horario = horario;
		this.grado = grado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", turno=" + turno + ", horario=" + horario + ", grado=" + grado
				+ ", toString()=" + super.toString() + "]";
	}

	
}
