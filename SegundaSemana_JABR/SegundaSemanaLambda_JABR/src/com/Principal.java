package com;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones o Funciones Lambda
		//Son expresiones o funciones "anonimas"
		//que implementan una interface
		//funcional

		//Esto nos permite definir ese método para
		//su uso inmediato, sin necesidad de crear
		//una clase que lo defina
		
		//Su operador es (->)
		//Su sintaxis es (parametros) -> {(cuerpo de lambda)};
		
		//Crear una instancia de una clase anonima, que implemente
		//nuestra interface funcional
		IFuncional suma = (item1,item2) -> System.out.println("La suma es: " +(item1+item2));
		
		//Puedo utilizar el método llamado operacion, a través del objeto suma
		suma.operacion(19, 2);
		
		IFuncional resta = (x,y) -> System.out.println("La resta es: " + (x-y));
		
		resta.operacion(10, 7);
		
	}

}
