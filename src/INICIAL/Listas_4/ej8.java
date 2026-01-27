package INICIAL.Listas_4;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Escribe un nombre: ");
            nombres[i] = sc.nextLine();
        }
        System.out.println("La lista es: ");
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++){
            System.out.print(nombres[i]);
            if (i < nombres.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
