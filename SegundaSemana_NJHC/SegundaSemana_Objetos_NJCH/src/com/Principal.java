package com;

public class Principal {

	public static void main(String[] args) {
		// Crear nuestro primer objeto de la clase persona con su contructor vacio
		//syntaxsis
		//clase instanci (variable u objeto) = new Clase()
		Persona persona1 = new Persona ();
		
		
		//Ejemplo de crear a un segundo objeto persona pero con el contrusctor que me pide los atributoss
		//desde un inicio 
		Persona persona2 = new Persona ("Juan", "Masculino");
		
		//Persona.setEdad(50); //todos los objetos persona tendran asignada la edad de 50 , se elimina ya ue el metodo setEdad ya no exite
		
		//	Asignando valores a los atributos de mi persona1 que esta vacio a este momento
		
	//	persona1.nombre="Alex"; --->forma incorrecta de asignar valores a los atributos de nuestro objetos.
		//hay que protegerlos con los modificadores de acceso
		
		//ESTABLECEMOS UN VALOR A MI PERSONA1 (vacio)
		//en el caso de su nombre
		
		persona1.setNombre("Alex");
		
		//ejemplo del uso del metodo get, para recuperar el nombre de persona1
		
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		//recuperamos el valor de nombre en persona2 en nombre
		
		// que ocurre si quiero mandar a imprimir mi objeto en consola directamente
		System.out.println(persona2); //nos imprime // com.Persona@15db9742
		
		
		//realizar 3 clases para crear 3 diferentes objetos
		//cada objeto que quieran modelar, debe contar con por lo menos 3 atributos
		// crear metodos constructores (vacio) y con todos los parametros
		// crear getters y setters
		//crear el metodo tostring()
		
		//una vez creada la pantilla o clase van a instanciar sus objetos en esta misma clase principal
		// e instancian uno vacio, uno con todos los atributos
		// y mandar a imprimir en consola
		
		//Ejemplo
		//objeto celular
		//Celular 
		
		Celular iPhone = new Celular ();
		
		Celular samsung = new Celular("Samsung", "S23", "Black", 22000.99);
		
		iPhone.setModelo("15");
		System.out.println(iPhone);
		
		System.out.println(samsung);
		
		// voy a imprimir a la persona1 con el nombre de Alex
		System.out.println(persona1);
		
		// con modificadores static , creamos atributos o metodos de clase.Aplica para
		/*todos los objetos creados de esa clase
		 * 
		 * con static aun podemos modificar el valor para todos los objetos
		 * de la clase, si fuera necesario, ejemplo, actualizar un precio
		 * 
		 * con static final, creamos valores inmutables y no pueden ser
		 * modificados, por ejemplo Pi es un numero ue no va a cambiar
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//Modelar 3 objetos - Mínimo 3 atributos por objeto
		//PRIMER OBJETO
		Fruta naranja = new Fruta("Naranja", 12, 2.25, "Madura");
		Fruta manzana = new Fruta();
		
		manzana.setName("Manzana");
		manzana.setWeight(125.68);
		manzana.setEstado("Pasada");
		
		System.out.println(naranja);
		System.out.println(manzana);
		
		//SEGUNDO OBJETO
		
		Animal ballena = new Animal("Ballena", "Antonieta", 54, 67348.12, "Marino", "Azul y blanco" );
		Animal gato = new Animal();
		gato.setNombre("Güero");
		gato.setColor("Atigrado Naranja");
		gato.setPeso(5.98);
		
		System.out.println(ballena);
		System.out.println(gato);
		
		//TERCER OBJETO
		
		Juguete carrito = new Juguete("Carrito", "Hot Wheels Volkswagen Beetle", "Mattel", "En Empaque");
		Juguete muñeca = new Juguete(){};
		muñeca.setTipo("Muñeca de trapo");
		muñeca.setEstado("Gastada");
		
		System.out.println(carrito);
		System.out.println(muñeca);
		

	}

}
