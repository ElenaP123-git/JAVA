package INICIAL.Listas_4; // otra forma de hacerlo (IA)

import java.util.Scanner;

public class ej11_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];

        // Leer nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce un nombre: ");
            nombres[i] = sc.nextLine();
        }

        // Mostrar lista
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 1. Encontrar la longitud máxima (sin contar espacios)
        int max = 0;
        for (int i = 0; i < nombres.length; i++) {
            int longitud = nombres[i].replace(" ", "").length();
            if (longitud > max) {
                max = longitud;
            }
        }

        // 2. Mostrar los nombres que tienen esa longitud
        System.out.println("El nombre más largo tiene " + max + " letras y es/son:");
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].replace(" ", "").length() == max) {
                System.out.println(nombres[i]);
            }
        }
    }
}
