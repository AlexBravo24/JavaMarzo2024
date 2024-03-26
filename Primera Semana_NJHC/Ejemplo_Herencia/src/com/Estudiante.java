package com;

public class Estudiante extends Persona {
	// Clase hija

	    private int matricula;
	    private String turno;
	    private String horario;
	    private int grado;
	    
	    public Estudiante() {
			
		}
	    public Estudiante(String nombre, int edad, int matricula, String turno, String horario, int grado) {
	        super(nombre, edad); //constructor
	        this.matricula = matricula;
	        this.turno = turno;
	        this.horario = horario;
	        this.grado = grado;
	    }
	 // Getters y setters específicos para Estudiante
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
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
		public int getGrado() {
			return grado;
		}
		public void setGrado(int grado) {
			this.grado = grado;
		}
		@Override
		public String toString() {
			return "Estudiante [matricula=" + matricula + ", turno=" + turno + ", horario=" + horario + ", grado="
					+ grado + ", toString()=" + super.toString() + "]";
		}
	    
	    
	  
	    
	    
	}

