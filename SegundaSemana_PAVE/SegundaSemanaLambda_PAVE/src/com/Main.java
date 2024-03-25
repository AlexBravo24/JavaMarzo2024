package com;

public class Main {

	public static void main(String[] args) {
		// Expresiones o Funciona Lambda son expresiones o funciones anonimas que implementan una inteface funcional
		
		//Permite definir ese metodo para su uso inmediato, sin necesidad de crear una clase que lo defina,
		
		// su operador es (->), su sintaxis es (parametros) -> {(cuerpo de lamda)}
		
		IFuncional suma = (a,b) -> System.out.println("La suma es: "+(a+b));
		IFuncional resta = (a,b) -> System.out.println("La resta es: "+(a-b));
		
		resta.operacion(22,13);
		suma.operacion(2,13);
	}

}
