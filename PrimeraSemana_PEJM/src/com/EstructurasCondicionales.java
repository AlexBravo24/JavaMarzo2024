package com;

public class EstructurasCondicionales {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
//int x =11;
//    if (x<10)
//       {
//	     System.out.println("si");
//       }
//    	else
//    	 System.out.println("no");
//	
//	if (x>1 && x<12)
//	   {
//		System.out.println("si");
//	   }
//	else
//		System.out.println("no");
//	if (x>1 || x<12)
//	   {
//		System.out.println("si");
//	   }
//	else
//		System.out.println("no");
//	if (x==10)
//    {
//	     System.out.println("si");
//    }
// 	else
// 	 System.out.println("no");
//	if (!(x>1))
//    {
//	     System.out.println("si");
//    }
// 	else
// 	 System.out.println("no");
	
	int dia=9;
	if (dia==1)
	{
		System.out.println("Lunes");
	}
	else if(dia==2)
	{
		System.out.println("Martes");
	}
	else if(dia==3)
	{
		System.out.println("Miercoles");
	}
	else if(dia==4)
	{
		System.out.println("Jueves");
	}
	else if(dia==5)
	{
		System.out.println("Viernes");
	}
	else if(dia==6)
	{
		System.out.println("Sabado");
	}
	else if(dia==7)
	{
		System.out.println("Domingo");
	}
	else if(dia>=8)
	{
		System.out.println("Error");
	}
	
switch (dia) {
case 1:
	System.out.println("Lunes");
	break;
case 2:
	System.out.println("Martes");
	break;
case 3:
	System.out.println("Miercoles");
	break;
case 4:
	System.out.println("Jueves");
	break;
case 5:
	System.out.println("Viernes");
	break;
case 6:
	System.out.println("Sabado");
	break;
case 7:
	System.out.println("Domingo");
	break;
default:
	System.out.println("La semana solo tiene 7 dias intente de nuevo");
	break;
	
}	
}
}
