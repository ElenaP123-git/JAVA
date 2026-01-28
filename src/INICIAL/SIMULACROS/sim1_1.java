package INICIAL.SIMULACROS;

import java.util.Scanner;

public class sim1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // EJERCICIO 2
        System.out.println("Introduce números (termina con -1):");

        double[] lista = new double[100]; // numeros con decimales tmb (double)
        int contador = 0;

        double num = sc.nextDouble();

        do {
            lista[contador] = num; // en la posición del contador (0,1,,2...) se introduce el número
            contador++;
            num = sc.nextDouble();

        } while (num != -1 && contador < 100);

        System.out.println("Números mayores que sus 3 anteriores:");

        int totalMayores = 0;

        for (int i = 3; i < contador; i++) {
            if (lista[i] > lista[i - 1] &&
                    lista[i] > lista[i - 2] &&
                    lista[i] > lista[i - 3]) {

                System.out.print((int)lista[i] + " "); // imprime los números mayores que sus 3 anteriores
                totalMayores++;
            }
        }

        System.out.println("\nHay " + totalMayores + " números mayores que sus 3 anteriores.");

    }
}
