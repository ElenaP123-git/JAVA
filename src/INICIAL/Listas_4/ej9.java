package INICIAL.Listas_4;

import java.util.Scanner;

public class ej9 {
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

        System.out.println("Dime el nombre que quieres buscar: ");
        String nom = sc.nextLine();

        int contador = 0;
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++){
            if (nombres[i].equals(nom)){ // es equals, ojito
                encontrado = true;
                contador++;
            }
        }
        if (encontrado){
            System.out.println("El nombre introducido sí está en la lista y ha salido " + contador + " veces");
        }
        else{
            System.out.println("Nombre no encontrado");
        }
    }
}
