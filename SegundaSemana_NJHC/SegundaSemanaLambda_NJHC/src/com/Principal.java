package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones o Funciona Lambda 
/*son expresiones o funciones anonimas que implementan una inteface funcional
	Esto nos permite definir ese metodo para su uso inmediato, sin necesidad de crear una clase que lo defina podemos implementar este metodo,
	su operador es (->), su sintaxis es (parametros) -> {(cuerpo de lamda)}
	*/			
			IFuncional suma = (item1,item2) -> System.out.println("La suma es: "+(item1+item2));// IFuncional suma = (x,y) -> System.out.println("La suma es: "+(x+y));  , IFuncional suma = (a,b) -> System.out.println("La suma es: "+(a+b));
			
			//puedo utilizar el metod llamado operacion del objeto suma
			suma.operacion(19,2);//le brindo los 2 números para realizar la operación
			
			
			IFuncional resta = (x,y) -> System.out.println("La resta es: "+(x-y));
				
				resta.operacion(10,7);
				

	}

}
