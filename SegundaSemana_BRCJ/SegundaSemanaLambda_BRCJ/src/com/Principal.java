package com;

public class Principal {

	public static void main(String[] args) {

		// Expresiones o funciones Lambda son expresiones o funciones anonimas que
		// implemnetan el método de una interface
		// funcional

		// Esto nos permite definir ese métodopara su uso inmediato, sin necesidad de
		// crear una clase que lo defina
		// Su operador es (->)
		// Su sintaxis es (parametros) -> {(cuerpo lambda)};
		// Creamos una instancia de una clase anonima, que implemente nuestra interface
		// funcional
		IFuncional suma = (a, b) -> System.out.println("La suma es: " + (a + b));

		// Puedo utilizar el método llamada operación, a través del objeto suma
		suma.operacion(19, 2);

		IFuncional resta = (x, y) -> System.out.println("La resta es: " + (x - y));
		resta.operacion(15, 5);

	}

}