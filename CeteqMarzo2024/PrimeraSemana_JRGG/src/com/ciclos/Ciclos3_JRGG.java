package com.ciclos;
import java.util.Scanner;

public class Ciclos3_JRGG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        String cadena = scanner.nextLine().toLowerCase();
        cadena = cadena.replace(" ", "");
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
            System.out.println(cadenaInvertida);
        }
        System.out.println(cadenaInvertida);
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
}
