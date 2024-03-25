package com.listas;
import java.util.*;
/**
 *
 * @author sebas
 */
public class Listas{
    public static void main(String[] args) {
        List<String> lista=new ArrayList<String>();
        List<Integer> lista2=new ArrayList<Integer>();
        //Se genera una lista
        lista.add("Sebastian");
        lista.add("Cristofer");
        lista.add("Luis");
        lista.add("José Manuel");
        lista.add("Omar");
        
        System.out.println(lista);//Lista generada
        System.out.println(lista.get(3));/*El método .get(parametro) 
        devuelve el valor indicado a través del parámetro*/ 
        System.out.println(lista.contains("Luis"));/*El método .contains(parámetro)
        devuelve un booleano si el valor existe o no*/
        System.out.println(lista.indexOf("Luis"));/*El método .indexOf(parámetro)
        devuelve la posición donde se ubica el parámetro indicado*/
        System.out.println(lista.lastIndexOf("Luis"));/*Devuelve el indice donde
        se encuentra eal elemento la ultima vez*/
        System.out.println(lista.remove("Omar"));/*El método .remove() elimina el
        valor indicado mediante la posición o mediante el objeto, el parámetro puede 
        ser un int o un String*/
        lista.add(4, "Jonny");/*El método .add(), te permite agregar valores a la
        lista ya sea mediante un parámetro o dos si también quieres indicar su
        posición*/
        //Nota: El valor se reemplazara dependiendo de la posición que indiques
        System.out.println(lista);
        System.out.println(lista.set(2, "Luis"));
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        List<Object> elemento=new ArrayList();
        
        elemento.add("ZTE BLADE A71");
        elemento.add(3000.0);
        elemento.add(true);
        
        System.out.println(elemento);
        
        //Agregar datos a mi HashMap - .put(clave, valor)
        Map<Integer, String> usuario=new HashMap<Integer, String>();
        usuario.put(1, "ZTE BLADE A71");
        usuario.put(2, "MOTOROLA E6 PLAY");
        usuario.put(3, "HUAWEI Y9");
        usuario.put(4, "ZTE BLADE A51");
        
        //Imprimir en consola determinado valor contenido en una llave
        System.out.println(usuario.get(4));
        
        usuario.put(5, "ZTE V20 SMART");
        
        System.out.println(usuario.get(5));
        
        
        
    }
}
