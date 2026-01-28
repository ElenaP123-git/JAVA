package INICIAL.SIMULACROS;

import java.util.Scanner;
import java.util.Random;

public class sim2_sin_def {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Máximo de jugadas permitidas
        int maxJugadas = 100;

        int[] numeroApostado = new int[maxJugadas];
        int[] cantidadApostada = new int[maxJugadas];
        int[] sumaDados = new int[maxJugadas];
        int[] ganancia = new int[maxJugadas];

        int contadorJugadas = 0;
        int opcion = 0;

        while (opcion != 3) {

            System.out.println("1. Apostar");
            System.out.println("2. Mostrar historial");
            System.out.println("3. Retirarse");
            System.out.print("Elige opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    if (contadorJugadas >= maxJugadas) {
                        System.out.println("No se pueden registrar más jugadas.");
                        break;
                    }

                    System.out.print("Número apostado (2-12): ");
                    int numero = sc.nextInt();

                    System.out.print("Cantidad apostada (€): ");
                    int cantidad = sc.nextInt();

                    int d1 = random.nextInt(6) + 1; // 0-5 | es lo mismo que poner (0,6)
                    int d2 = random.nextInt(6) + 1;
                    int suma = d1 + d2;

                    int resultado = 0;
                    if (suma == numero) {
                        resultado = cantidad * 2;
                        System.out.println("Has acertado. Ganaste " + resultado + "€");
                    } else {
                        resultado = -cantidad;
                        System.out.println("Has perdido " + cantidad + "€");
                    }

                    numeroApostado[contadorJugadas] = numero;
                    cantidadApostada[contadorJugadas] = cantidad;
                    sumaDados[contadorJugadas] = suma;
                    ganancia[contadorJugadas] = resultado;

                    contadorJugadas++;

                    break;

                case 2:
                    if (contadorJugadas == 0) {
                        System.out.println("No hay historial todavía.");
                        break;
                    }

                    for (int i = 0; i < contadorJugadas; i++) {
                        String texto = ganancia[i] >= 0 ? "ganando" : "perdiendo";
                        System.out.println("En la " + (i + 1) + "º jugada apostó al valor "
                                + numeroApostado[i] + " y sumó " + sumaDados[i] + ", "
                                + texto + " " + Math.abs(ganancia[i]) + "€");
                    }
                    break;

                case 3:
                    int saldo = 0;
                    for (int i = 0; i < contadorJugadas; i++) {
                        saldo += ganancia[i];
                    }
                    System.out.println("Saldo final: " + saldo + "€");
                    System.out.println("Gracias por jugar.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

    }
}
