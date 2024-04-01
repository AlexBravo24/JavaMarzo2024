package com;

public class Alumno extends Persona{
	private int numeroDecontrol;
	private int nss;
	private int semestre;
	private String turno;
	private int nMaterias;
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String genero, int edad, int numeroDecontrol, int nss, int semestre, String turno,
			int nMaterias) {
		super(nombre, genero, edad);
		this.numeroDecontrol = numeroDecontrol;
		this.nss = nss;
		this.semestre = semestre;
		this.turno = turno;
		this.nMaterias = nMaterias;
	}
	public int getNumeroDecontrol() {
		return numeroDecontrol;
	}
	public void setNumeroDecontrol(int numeroDecontrol) {
		this.numeroDecontrol = numeroDecontrol;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getnMaterias() {
		return nMaterias;
	}
	public void setnMaterias(int nMaterias) {
		this.nMaterias = nMaterias;
	}
	@Override
	public String toString() {
		return "Alumno [numeroDecontrol=" + numeroDecontrol + ", nss=" + nss + ", semestre=" + semestre + ", turno="
				+ turno + ", nMaterias=" + nMaterias + ", toString()=" + super.toString() + "]";
	}
	//una vez declarada abstracta la clase persona 
	//las clases hijas que heredan de una clase abstracta 
	//se ven obligadas a implementar los metodos 
	//abstractos y definir como se van a realizar 
	@Override
	public void comer(String comida) {
		// TODO Auto-generated method stub
		System.out.println("comete esta"+ comida);
	}
	
}
