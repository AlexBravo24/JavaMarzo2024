package com;

public class Principal {

	public static void main(String[] args) {
		// ¿Expresiones o funciones Lamda 
		//son expresiones o funciones "anonimas"
		//que implementan una interface funcional
		
		//esto nos permite definir ese motodo
		//para su uso inmediato, sin necesidad
		//de crear una clase que lo defina
		
	//	Cientifica calculadora = new Cientifica();
		
		//su operador es (->)
		// su sintaxis es (parametros) -> {(cuerpo del lamda)}
		
		// crear una instancia de una clase anonima que implemente
		//nuestra interface funcional
	
		IFuncional suma = (item1,item2) -> System.out.println("la suma es: "+(item1+item2));
	    //puedo utilizar el metodo operacion atraves del objeto suma
		suma.operacion(10, 11);
		IFuncional resta = (item1,item2) -> System.out.println("la resta es: "+(item1-item2));
		resta.operacion(11, 10);
	}

}
