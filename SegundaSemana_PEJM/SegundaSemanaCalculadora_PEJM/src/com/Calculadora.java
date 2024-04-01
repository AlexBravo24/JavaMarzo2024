package com;

public abstract class Calculadora {
   private String marca,modelo,color;
   private double precio;
public Calculadora() {
	super();
}
public Calculadora(String marca, String modelo, String color, double precio) {
	super();
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
	this.precio = precio;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
@Override
public String toString() {
	return " marca: " + marca + "\n modelo: " + modelo + "\n color:" + color + "\n precio:" + precio+ " Pesos mexicanos";
}
   public abstract void suma(int a,int b);
   public abstract void resta(int a,int b);
   public abstract void multiplicacion(int a,int b);
   public abstract void division(double a,double b);
   
   public abstract void suma(int a,int b, int c);
   public abstract void resta(int a,int b, int c);
   public abstract void multiplicacion(int a,int b , int c);
   public abstract void division();
public void tomarTemperatura() {
	// TODO Auto-generated method stub
	
}
}

