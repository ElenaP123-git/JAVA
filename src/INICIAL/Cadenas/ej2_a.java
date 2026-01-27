package INICIAL.Cadenas; // SIN COMPARE TO

import java.util.Scanner;

public class ej2_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = sc.nextLine().toLowerCase();

        int contador = 0;

        // todas las consonantes del abecedario
        String consonantes = "bcdfghjklmnñpqrstvwxyz";

        for (int i = 0; i < nombre.length(); i++) {
            String letra = nombre.substring(i, i+1); // SUBSTRING

            if (consonantes.contains(letra)) { // CONTAINS
                contador++;
            }
        }

        System.out.println("Hay " + contador + " consonantes");
    }
}
