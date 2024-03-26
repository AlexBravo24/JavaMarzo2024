package com;

public class Persona {

	// Clase padre
	    private String nombre;
	    private int edad;
	    
	    public Persona() {
			
		}
	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }
	    
	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public int getEdad() {
	        return edad;
	    }
	    
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
		}
	    
	    
	}


