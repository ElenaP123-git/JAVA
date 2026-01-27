package INICIAL.Listas_4;

import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        String [] nombres = new String[5];
        String [] copia = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Introduce un nombre: ");
            nombres[i] = sc.nextLine();
        }
        for (int i = 0; i < nombres.length; i++){
            copia [i] = nombres[i]; // copia elemento por elemento
        }
        System.out.print("[");
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i]);
            if (i < copia.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
