package INICIAL.Listas_4;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        String [] nombres = new String [5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++){
            System.out.println("Introduce un nombre: ");
            nombres[i] = sc.nextLine();
        }
        System.out.println("La lista es: ");
        System.out.print("[");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]);
            if (i < nombres.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Dame una letra: ");
        String letra = sc.nextLine();

        boolean encontrado = false;
        int contador =0;

        for (int i = 0; i < nombres.length; i++){
            if (nombres[i].substring(0,1).equals(letra)){ // mira cada nombre
                contador++;
                encontrado = true;
            }
        }
        if (encontrado){
            System.out.println("Hay " + contador + " nombres que empiezan por esa letra");
        }
        else{
            System.out.println("No hay ningún nombre con esa letra");
        }
    }
}
