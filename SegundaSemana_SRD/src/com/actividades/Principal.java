package com.actividades;
import com.actividades.logica.Cajero_SRD;
import com.actividades.modelo.Cuentas_SRD;
import java.util.*;

/**
 *
 * @author sebas
 */
public class Principal{
    public static void main(String[] args){
        Map<Integer, Cuentas_SRD> cuentas=new HashMap<Integer, Cuentas_SRD>();
        Cuentas_SRD jesus=new Cuentas_SRD("Jesús", "Débito", 13000, 4000, 50000);
        Cuentas_SRD edwin=new Cuentas_SRD("Edwin", "Débito", 10000, 1000, 20000);
        Cuentas_SRD fidel=new Cuentas_SRD("Fidel", "Débito", 2500, 100, 6000);
        Cuentas_SRD adelaido=new Cuentas_SRD("Adelaido", "Débito", 34000, 6000, 100000);
        Cuentas_SRD yukiko=new Cuentas_SRD("Yukiko", "Débito", 50000, 100, 200000);
        
        cuentas.put(1000, jesus);
        cuentas.put(1001, edwin);
        cuentas.put(1002, fidel);
        cuentas.put(1003, adelaido);
        cuentas.put(1004, yukiko);
        
        Cajero_SRD santander=new Cajero_SRD("Santander", cuentas);
        
        Scanner d=new Scanner(System.in);
        int bandera=0, selector=0;
        do{
            do{
                try{
                    System.out.println("************MENÚ DE OPCIONES*************");
                    System.out.println("1.- Mostrar usuarios");
                    System.out.println("2.- Consultar");
                    System.out.println("3.- Retirar");
                    System.out.println("4.- Depositar");
                    System.out.println("0.- Salir");
                    System.out.println("Elige una opción:");
                    selector=d.nextInt();
                
                    if(selector>=0 & selector<=4){
                        bandera=1;
                    }else{
                        System.out.println("\nOpción no disponible, intenté de nuevo\n");
                    }
                }catch(Exception s){
                    System.out.println("Error: No se admiten caracteres");
                    bandera=2;
                }
            }while(bandera==0);
            if(selector==1){
                Cuentas_SRD[] nombres={jesus, edwin, fidel, adelaido, yukiko};
                System.out.println("");
                for(int i=1;i<nombres.length;i++){
                    System.out.println(i+".- "+nombres[i]);
                }
            }else if(selector==2){
                System.out.println("Ingresa el numero de cuenta del usuario:");
                int num=d.nextInt();
                
                System.out.println("");
                System.out.println(santander.consultar(num));
            }else if(selector==3){
                System.out.println("Ingresa el numero de cuenta del usuario:");
                int num=d.nextInt();
                System.out.println("Ingresa la cantidad a retirar:");
                int retiro=d.nextInt();
                
                System.out.println("");
                System.out.println(santander.retirar(num, retiro));
            }else if(selector==4){
                System.out.println("Ingresa el numero de cuenta del usuario:");
                int num=d.nextInt();
                System.out.println("Ingresa la cantidad a depositar:");
                int retiro=d.nextInt();
                
                System.out.println("");
                System.out.println(santander.depositar(num, retiro));
            }else if(selector==0){
                System.out.println("Muchas gracias por usar bancos Sanatder, vuelva pronto");
                bandera=2;
            }
        }while(bandera!=2);
        //System.out.println(santander.consultar(1006));
        /*System.out.println(santander.retirar(1003, 10000));//Opcion 1
        System.out.println(santander.retirar(1003, 8000));//Retiro exitoso
        System.out.println(santander.retirar(1003, 8000));//Retiro exitoso
        System.out.println(santander.retirar(1003, 8000));//Retiro exitoso
        System.out.println(santander.retirar(1003, 4000));//Retiro exitoso
        System.out.println(santander.retirar(1003, 7000));//Opcion 2
        System.out.println(santander.retirar(1003, 4000));//Opcion 3
        //System.out.println(santander.consultar(1002));*/
        
        /*System.out.println(santander.depositar(1002, 8000));//Opcion 1
        System.out.println(santander.depositar(1002, 4000));//Opcion 2
        System.out.println(santander.depositar(1002, 2000));//Deposito exitoso*/
    }
}
