package INICIAL.Listas_4;

import java.util.Scanner;

public class ej11 {
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

        int max = 0;
        int [] medida_cada_nombre = new int [5];

        for (int i = 0; i < nombres.length; i++) {
            medida_cada_nombre[i]= nombres[i].replace(" ", "").length(); // hago el replace para que el programa NO cuete los espacios en nombres como "María Isabel"
            if (max < medida_cada_nombre[i]){
                max = medida_cada_nombre[i];
            }
            }
        System.out.println("El nombre más largo de la lista tiene " + max + " letras y es/son: ");

        for (int i = 0; i < nombres.length; i++){
            if (medida_cada_nombre[i] == max){
                System.out.println(nombres[i]);
            }
        }
        }
    }

