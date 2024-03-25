package com;

/**
 *
 * @author sebas
 */
public class TipoDatos {

    public static void main(String[] args){
        byte numbe_one, b;//1 byte: El tipo byte solo tiene un rango de 127 bytes: -128 a 127
        
        numbe_one=127;
        
        short s=32767;//2 bytes: -32768 a 32767
        int i=2147483647;//4 bytes: 2147483648 a 2147483647
        b=120;
        long l=2147483648L;//8 bytes y sugiere un sufijo L para admitir los valores más alla del int
        
        //El tipo de dato más utilizado es el int
        
        /*TIPOS DE DATOS PRIMITIVOS
        Númerico en punto o coma flotante
        El tipo de dato más utilizado en decimales es el double*/
        
        float f=3.1416F;
        
        double r=3.1416190928938;
        
        
        //BOOLEANOS: Solo admmiten 2 valores true y false
        
        boolean verdadero=true;
        boolean falso=false;
        
        //Carácter
        
        char caracter='@';//Solo puede almacenar un carácter y esta se almacena entre comillas
        
        String nombre="Sebastián";/*Almacenan cadenas de texto, tambien puedes almacensar números
        pero no puedes realizar operaciones con ellos ya que solo es texto y nada más*/
        
        Byte by=100;
        Short sh=30000;
        Integer in=20000000;
        Long large=900000000000L;
        Float flotante=31.898909F;
        Double du=31.8988677;
        Character ch='c';
        
        System.out.println("Hola mundo, me llamo: ");/*Impresion en consola, lo que esta entre ""es lo que se imprime
        con print se imprime en linea recta y al agregarle "ln" da un salto de linea*/
        System.out.println(nombre);
        
        
        int x=23;
        int y=44;
        System.out.println("La suma es: "+ (x+y));
    }
    
}
