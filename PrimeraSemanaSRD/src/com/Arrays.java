package com;

/**
 *
 * @author sebas
 */
public class Arrays{
    public static void main(String[] args){
        try{
            /*Arrays o arreglos: Son una estructura que nos
            permite almacenar cantidad de elementos en común
            de un tipo de dato.
            Desventajas: No pueden crecer en tiempo de 
            ejecución*/
        
            //Ejemplo de array sin tamaño ni valor
            int []numero;
        
            //Ejemplo de array con tamaño iniciado
            int []num2=new int[5];
        
            /*Los arrays almacenan valores desde el posición 0,
            por lo cual la ultima posición almacenada eata en
            el ejemplo 4*/
        
            num2[0]=101;
            num2[1]=102;
            num2[2]=103;
            num2[3]=104;
            num2[4]=105;


            //System.out.println(num2[7]);
            
            String []nom={"Sebastián", "Catalina", "Erick", "Gabriela"};
            
            for(int i=0;i<num2.length;i++){
                System.out.print(num2[i]+" ");
                //System.out.println(i+".- "+nom[i]);
            }
            System.out.println();
            //System.out.println(nom[0]);
            
            
        }catch(Exception s){
            System.out.println("Error: La posición no existe");
        }
    }
}
