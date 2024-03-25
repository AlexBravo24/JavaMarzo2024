package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// expresiones o funciones lambda
		//son expresiones o funciones "anonimas"
		//que implementan una interface funcional
		
		//Esto nos permite definir ese metodo para su uso inmediato, sin necesidad de crear
		//una clase que lo defina

		//su operador es (->)
		//su sintaxis es (parametros) -> {( cuerpo de lambda)};
		
		//crear una nueva instancia de clase anomia, que implementa
		//nuestra interface funcional
		
		IFuncional suma = (item1, item2) -> System.out.println("La suma es: " + (item1 + item2));
		
		//puedo utilizar el metodo llamado operacion, a traves del objeto suma
		suma.operacion(19, 2);
		
		
		IFuncional resta = (x, y) -> System.out.println("La suma es: " + (x - y));
		
		resta.operacion(10, 7);
	}

}
 