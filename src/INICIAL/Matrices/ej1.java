package INICIAL.Matrices;

import java.util.Scanner;
import java.util.Random;

public class ej1 {
    public static void main(String[] args) {
        ej1 referencia = new ej1();

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Número de filas: ");
        int filas = sc.nextInt();

        System.out.println("Número de columnas: ");
        int columnas = sc.nextInt();

        int matriz[][] = new int[filas][columnas];

        referencia.relleno_matriz(matriz, random);
        referencia.muestro_matriz(matriz);

        System.out.println("Introduce una fila: ");
        int fila = sc.nextInt();

        int suma_filas = referencia.suma_filas(matriz, fila);
        System.out.println("La suma de la fila " + fila + " es " + suma_filas);

        int maximo_numero = referencia.mayor_numero(matriz);
        System.out.println("El mayor número de la matríz es el: " + maximo_numero);

        referencia.busco_posición(matriz, maximo_numero);
    }

    void relleno_matriz(int[][] matriz, Random random) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(1, 51); // 1-50
            }
        }

    }

    void muestro_matriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // salto de linea (printea fila por fila)
        }
    }

    int suma_filas(int[][] matriz, int fila) {
        int suma = 0;

        for (int i = 0; i < matriz[fila].length; i++) {
            suma += matriz[fila][i];
        }
        return suma;
    }

    int mayor_numero(int[][] matriz) {
        int max = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (max < matriz[i][j]) {
                    max = matriz[i][j];
                }
            }
        }

        return max;
    }

    void busco_posición(int[][] matriz, int maximo_numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (maximo_numero == matriz[i][j]) {
                    System.out.println("Número mayor en fila: " + i + " y columna " + j);
                }
            }
        }
    }
}
