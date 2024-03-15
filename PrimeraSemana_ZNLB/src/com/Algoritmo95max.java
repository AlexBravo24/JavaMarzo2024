package com;
import java.util.Scanner;
public class Algoritmo95max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
        int x = 0;
        int b = 1;
        int c = 0;
        int s = 0;
        System.out.println("escribe el numero que quiere multiplicar" );
        c = input.nextInt();
        System.out.println("hasta que numero" );
        s = input.nextInt();
        while (b<=s) {
            x = c*b;
            System.out.println(c + "x" + b + "=" + x);
            b++;
        }
		
		input.close();
		
		
	}

}
