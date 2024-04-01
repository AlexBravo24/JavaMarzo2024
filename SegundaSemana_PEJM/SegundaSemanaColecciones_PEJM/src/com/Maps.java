package com;

import java.util.HashMap;
import java.util.Map;

public class Maps {
public static void main(String[] args) {
//	la interfaz MAp asocia claves a valores.
//	//esta interface no puede copntener claves duplicadas(ID)
//	Pero si valores duplicados, cada clave puede tener 
//	asociado un valor como maximo.
//	
//	HashMap: esta implementacion almacena las claves en una tabla hash.
//	Es la que  mejor rendimiento tiene en los maps, pero esto
//	no garantiza un orden al momento de realizar iteraciones.
	
	
//Declarando un hashMap 
//El primer valor es el tipo de dato que funcionara como clave o llave (key)
//Ek segundo valor sera el tipo de dato a almacenar en dicha clave.
//Ej. vamos a declarar un HashMap para guardar elementos de tipo String
//1,"Adian"
//2,"Rafael"
//5,"Miguel"
//3,"Arasandi"
//3,"alexis" - las llaves no pueden repetirse
	
Map<Integer,String> usuarios = new HashMap<Integer,String>();
	
	usuarios.put(1,"Pavel");
	usuarios.put(2,"Oli");
	usuarios.put(3,"Alexis");
	usuarios.put(4,"Pavel");
	usuarios.put(5,"Arasandi");
	System.out.println(usuarios);
	System.out.println(usuarios.get(3));
	usuarios.put(4, "Enrique");
	System.out.println(usuarios);
	
Map<String,Double> decimal = new HashMap<String,Double>();
	
	decimal.put("Pavel",1800.328);
	decimal.put("Oli",120.12);
	
	System.out.println(decimal);
	System.out.println(decimal.get("Oli"));
	
	//para remover un elemento - .remove
	
	decimal.remove("Oli");
	System.out.println(decimal);
}
}


