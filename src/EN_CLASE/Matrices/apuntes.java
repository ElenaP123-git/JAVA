package EN_CLASE.Matrices;

import java.util.Scanner;

public class apuntes {
    public static void main(String[] args) {
        /****************************************************
         *                 APUNTES DE JAVA
         *                    MATRICES
         *            — versión clara para examen —
         ****************************************************/

/***********************
 *      1. ¿QUÉ ES UNA MATRIZ?
 ***********************/

/*
 Una matriz es un ARRAY de ARRAYS.
 Es decir: una tabla con filas y columnas.

 En Java se declara así:
 tipo[][] nombre = new tipo[filas][columnas];
*/

/***********************
 *      2. DECLARACIÓN
 ***********************/

        int[][] matriz = new int[3][4];
// 3 filas, 4 columnas

        String[][] nombres = new String[2][3];
// 2 filas, 3 columnas

/***********************
 *      3. ASIGNAR VALORES
 ***********************/

        matriz[0][0] = 5;
        matriz[1][2] = 9;
        nombres[0][1] = "Ana";

/***********************
 *      4. RECORRER UNA MATRIZ
 ***********************/

/*
 Para recorrer una matriz se usan DOS bucles:
 - uno para las filas (i)
 - otro para las columnas (j)
*/

        for (int i = 0; i < matriz.length; i++) {                 // filas
            for (int j = 0; j < matriz[i].length; j++) {          // columnas
                System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

/***********************
 *      5. LEER DATOS EN UNA MATRIZ
 ***********************/

        Scanner sc = new Scanner(System.in);

        int[][] notas = new int[2][3]; // 2 alumnos, 3 asignaturas

// 1. RELLENAR MATRIZ
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Introduce nota del alumno " + (i+1) + ", asignatura " + (j+1) + ": ");
                notas[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

// 2. IMPRIMIR MATRIZ
        System.out.println("Matriz de notas:");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " "); // para que haya espacio entre números
            }
            System.out.println(); // para que se imprima en forma de matriz ([x][0] y abajo [x][1])
        }


/***********************
 *      6. SUMAR UNA FILA (ej: total de un alumno)
 ***********************/

        int fila = 0; // primera fila
        int sumaFila = 0;

        for (int j = 0; j < notas[fila].length; j++) {
            sumaFila += notas[fila][j];
        }

        System.out.println("Suma de la fila 0: " + sumaFila);

/***********************
 *      7. SUMAR UNA COLUMNA (ej: total de una asignatura)
 ***********************/

        int columna = 1; // segunda columna
        int sumaColumna = 0;

        for (int i = 0; i < notas.length; i++) {
            sumaColumna += notas[i][columna];
        }

        System.out.println("Suma de la columna 1: " + sumaColumna);

/***********************
 *      8. BUSCAR EL MÁXIMO EN TODA LA MATRIZ
 ***********************/

        int max = notas[0][0];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }
            }
        }

        System.out.println("El valor máximo de la matriz es: " + max);

/****************************************************
 * FIN DE LOS APUNTES
 ****************************************************/

    }
}
