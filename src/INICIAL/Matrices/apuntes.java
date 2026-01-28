package INICIAL.Matrices;

import java.util.Scanner;
import java.util.Random;   // ← añadido para el ejemplo con Random

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
                System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j]); // [0][0] = 5
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

        // 2. IMPRIMIR MATRIZ NOTAS
        System.out.println("Matriz de notas:");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " "); // por cada fila, se imprime abajo
            }
            System.out.println();
        }

        /***********************
         *      6. SUMAR UNA FILA
         ***********************/

        int fila = 0;
        int sumaFila = 0;

        for (int j = 0; j < notas[fila].length; j++) { // numeros de elementos de la fila 0
            sumaFila += notas[fila][j]; // suma los elementos de la fila 0
        }

        System.out.println("Suma de la fila 0: " + sumaFila);

        /***********************
         *      7. SUMAR UNA COLUMNA
         ***********************/

        int columna = 1;
        int sumaColumna = 0;

        for (int i = 0; i < notas.length; i++) {
            sumaColumna += notas[i][columna]; // suma los elementos de la columna 1
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
         *      9. EJEMPLO CON Random
         ****************************************************/

        /*
         Random sirve para generar números aleatorios.
         Aquí rellenamos una matriz 5x5 con números del 1 al 100.
        */

        System.out.println("=== MATRIZ ALEATORIA (Random) ===");

        Random r = new Random();
        int[][] aleatoria = new int[5][5];

        // Rellenar con números aleatorios
        for (int i = 0; i < aleatoria.length; i++) {
            for (int j = 0; j < aleatoria[i].length; j++) {
                aleatoria[i][j] = r.nextInt(1,101); // 1 a 100
            }
        }

        // Mostrar matriz aleatoria
        for (int i = 0; i < aleatoria.length; i++) {
            for (int j = 0; j < aleatoria[i].length; j++) {
                System.out.print(aleatoria[i][j] + "\t"); // tabulador 1    2   3
            }
            System.out.println(); // salto después de cada linea
        }


        /****************************************************
         *      10. MEDIA DE TODOS LOS VALORES (AÑADIDO)
         ****************************************************/

        int sumaTotal = 0;
        int elementos = notas.length * notas[0].length;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sumaTotal += notas[i][j];
            }
        }

        double media = (double) sumaTotal / elementos;
        System.out.println("Media de todos los valores: " + media);


        /****************************************************
         *      11. MATRIZ TRANSPUESTA (AÑADIDO)
         ****************************************************/

        int filasT = notas.length;
        int columnasT = notas[0].length;

        int[][] transpuesta = new int[columnasT][filasT];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                transpuesta[j][i] = notas[i][j];
            }
        }

        System.out.println("=== MATRIZ TRANSPUESTA ===");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }


        /****************************************************
         *      12. ¿ES SIMÉTRICA? (AÑADIDO)
         ****************************************************/

        if (notas.length != notas[0].length) {
            System.out.println("La matriz NO es simétrica porque no es cuadrada.");
        } else {
            boolean simetrica = true;

            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas.length; j++) {
                    if (notas[i][j] != notas[j][i]) {
                        simetrica = false;
                    }
                }
            }

            if (simetrica) {
                System.out.println("La matriz es SIMÉTRICA.");
            } else {
                System.out.println("La matriz NO es simétrica.");
            }
        }


        /****************************************************
         *      13. BUSCAR UN NÚMERO EN LA MATRIZ (AÑADIDO)
         ****************************************************/

        System.out.print("Introduce un número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                if (notas[i][j] == buscar) {
                    encontrado = true;
                    contador++;
                    System.out.println("Encontrado en posición [" + i + "][" + j + "]");
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número NO está en la matriz.");
        } else {
            System.out.println("Aparece " + contador + " veces.");
        }


        /****************************************************
         * FIN DE LOS APUNTES
         ****************************************************/
    }
}
