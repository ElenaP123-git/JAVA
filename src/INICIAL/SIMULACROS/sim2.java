package INICIAL.SIMULACROS;

import java.util.Scanner;
import java.util.Random;

public class sim2 {

    public static void main(String[] args) {

        sim2 ref = new sim2();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int maxJugadas = 100;

        int[] numeroApostado = new int[maxJugadas];
        int[] cantidadApostada = new int[maxJugadas];
        int[] sumaDados = new int[maxJugadas];
        int[] ganancia = new int[maxJugadas];

        int contadorJugadas = 0;
        int opcion = 0;

        while (opcion != 3) {

            ref.mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    contadorJugadas = ref.apostar(
                            sc, random,
                            numeroApostado, cantidadApostada,
                            sumaDados, ganancia,
                            contadorJugadas
                    );
                    break;

                case 2:
                    ref.mostrarHistorial(
                            numeroApostado, cantidadApostada,
                            sumaDados, ganancia,
                            contadorJugadas
                    );
                    break;

                case 3:
                    ref.mostrarSaldoFinal(ganancia, contadorJugadas);
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // ------------------ FUNCIONES ------------------

    void mostrarMenu() {
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar historial");
        System.out.println("3. Retirarse");
        System.out.print("Elige opción: ");
    }

    int apostar(Scanner sc, Random random,
                int[] numeroApostado, int[] cantidadApostada,
                int[] sumaDados, int[] ganancia,
                int contador) {

        if (contador >= numeroApostado.length) {
            System.out.println("No se pueden registrar más jugadas.");
            return contador;
        }

        System.out.print("Número apostado (2-12): ");
        int numero = sc.nextInt();

        System.out.print("Cantidad apostada (€): ");
        int cantidad = sc.nextInt();

        int d1 = random.nextInt(6) + 1;
        int d2 = random.nextInt(6) + 1;
        int suma = d1 + d2;

        int resultado;
        if (suma == numero) {
            resultado = cantidad * 2;
            System.out.println("Has acertado. Ganaste " + resultado + "€");
        } else {
            resultado = -cantidad;
            System.out.println("Has perdido " + cantidad + "€");
        }

        numeroApostado[contador] = numero;
        cantidadApostada[contador] = cantidad;
        sumaDados[contador] = suma;
        ganancia[contador] = resultado;

        return contador + 1;
    }

    void mostrarHistorial(int[] numeroApostado, int[] cantidadApostada,
                          int[] sumaDados, int[] ganancia,
                          int contador) {

        if (contador == 0) {
            System.out.println("No hay historial todavía.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            String texto = ganancia[i] >= 0 ? "ganando" : "perdiendo";
            System.out.println("En la " + (i + 1) + "º jugada apostó al valor "
                    + numeroApostado[i] + " y sumó " + sumaDados[i] + ", "
                    + texto + " " + Math.abs(ganancia[i]) + "€");
        }
    }

    void mostrarSaldoFinal(int[] ganancia, int contador) {
        int saldo = 0;
        for (int i = 0; i < contador; i++) {
            saldo += ganancia[i];
        }
        System.out.println("Saldo final: " + saldo + "€");
        System.out.println("Gracias por jugar.");
    }
}
