package INICIAL.Listas_4;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Introduce un nombre: ");
            nombres[i] = sc.nextLine();
        }
        System.out.println("Lista normal: ");
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i]);
            if (i < nombres.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Lista inversa: ");
        System.out.print("[");
        for (int i = nombres.length - 1; i >= 0; i--){
            System.out.print(nombres[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
