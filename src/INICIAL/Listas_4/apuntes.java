package INICIAL.Listas_4;

import java.util.Scanner;

public class apuntes {
    public static void main(String[] args) {

/****************************************************
 *                 APUNTES DE JAVA
 *           ARRAYS Y CADENAS (STRINGS)
 *            — versión clara para examen —
 ****************************************************/

        /***********************
         *      1. ARRAYS
         ***********************/

/*
 Un array en Java es una estructura de tamaño fijo.
 No se puede ampliar ni reducir una vez creado.
 Se usa cuando sabemos cuántos elementos habrá.
*/

// Declaración de arrays
        int[] numeros = new int[5];        // array de 5 enteros
        String[] nombres = new String[10]; // array de 10 Strings

// Asignación de valores
        numeros[0] = 7;
        nombres[1] = "Sevilla";

// Recorrer un array con un bucle for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]); // imprime elementos en posición i
        }

/*
 .length → devuelve el tamaño del array
 OJO: es sin paréntesis porque es una propiedad, no un método.
*/

        // Leer datos del usuario y guardarlos en un array
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce nota " + (i+1) + ": ");
            notas[i] = sc.nextInt();
        }

        /************ BUSCAR MÁXIMO EN UN ARRAY ************/

        int max = notas[0]; // suponemos que el primero es el mayor

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }

        System.out.println("La nota más alta es: " + max);

        /************ MÁXIMO CON NOMBRE ASOCIADO ************/

        String[] alumnos = {"Ana", "Luis", "Marta"};
        int[] examenes = {7, 9, 8};

        int maxNota = examenes[0];
        String alumnoMax = alumnos[0];

        for (int i = 1; i < examenes.length; i++) {
            if (examenes[i] > maxNota) {
                maxNota = examenes[i];
                alumnoMax = alumnos[i];
            }
        }

        System.out.println("La nota más alta es de: " + alumnoMax);

    }
}
