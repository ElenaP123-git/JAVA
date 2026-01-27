package INICIAL.Boletin1; // 1 SOLO NUM ALEATORIO

import java.util.Scanner;
import java.util.Random;

public class ej10_a {
    public static void main(String[]args){
        ej10_a referencia = new ej10_a();

        int primerIntento = referencia.pido_num();          // PRIMER NÚMERO
        int resultado = referencia.adivino_numero(primerIntento); // SE PASA A LA FUNCIÓN

        System.out.println("El número era: " + resultado);
    }

    int pido_num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        return numero;
    }

    int adivino_numero(int intento){
        Random random = new Random();
        int aleatorio = random.nextInt(1,5); // número entre 1 y 5
        int contador = 1; // ya hiciste un intento en el main

        while (intento != aleatorio){
            System.out.println("Fallaste...");
            intento = pido_num();   // SE PIDE OTRO NÚMERO
            contador++; // +1
        }

        System.out.println("Acertaste!!");
        System.out.println("Intentos: " + contador);

        return aleatorio;
    }
}
