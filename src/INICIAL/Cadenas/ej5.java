package INICIAL.Cadenas; // con contains

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine().toLowerCase();

        System.out.println("Introduce una secuencia de letras:");
        String secuencia = sc.nextLine().toLowerCase();

        if (palabra.contains(secuencia)){
            System.out.println("Sí aparece");
        }
        else{
            System.out.println("No aparece");
        }
    }
}
