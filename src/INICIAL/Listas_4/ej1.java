package INICIAL.Listas_4;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int [] numeros = new int [5];

        for (int i =0; i < numeros.length; i++){
            System.out.println("Introduce los números: ");// para recorrer arrays se empieza desde 0 porque es su posición 1, a además hay que noner < porque el 5 no existe (0,1,2,3,4)
            numeros[i] = sc.nextInt(); // en la lista numeros, añado en la posición i, lo que se introduzca
            // aquí no hace falta un sc.nextLine(); eso se pone cuando despues voy a pedir un nextLine()
    }
        // fuera del bucle (con otro) podemos imprimir la lista completa
        System.out.println("La lista completa es:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // para que salga como en python
        System.out.print("["); // PRINT EN VEZ DE PRINTLN PARA QUE NO HAYA SALTO DE LÍNEA
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
