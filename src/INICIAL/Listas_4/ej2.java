package INICIAL.Listas_4;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce números: ");
            numeros[i] = sc.nextInt();
        }
        int max = numeros[0];
        int min = numeros[0];

        for (int i = 0; i < 5; i++) {
            if (max < numeros[i]) {
                max = numeros[i];
            }
            if (min > numeros[i]) { // mejor poner if if antes que else if porque en ese caso, se lee después de que el if no se cumpla
                min = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
    }
}