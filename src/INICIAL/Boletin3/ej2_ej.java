package INICIAL.Boletin3;

import java.util.Scanner;

public class ej2_ej {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ej2_ej ref = new ej2_ej();

        System.out.println("Dime el numero de arboles: ");
        int numArboles = sc.nextInt();

        String[] tipo = new String[numArboles];
        int[] diametro = new int[numArboles];
        int[] altura = new int[numArboles];
        int[] edad = new int[numArboles]; // solo se usará si es tipo B

        ref.datoarboles(sc, tipo, diametro, altura, edad, numArboles);
        ref.muestraFinal(tipo, altura, diametro, edad);
    }

    void datoarboles(Scanner sc, String[] tipo, int[] diametro, int[] altura, int[] edad, int numArboles) {

        for (int i = 0; i < numArboles; i++) {

            System.out.println("Árbol " + (i + 1));
            System.out.println("Tipo (A o B): ");
            tipo[i] = sc.next().toUpperCase();

            System.out.println("Dime diámetro: ");
            diametro[i] = sc.nextInt();

            System.out.println("Dime altura: ");
            altura[i] = sc.nextInt();

            if (tipo[i].equals("B")) {
                System.out.println("Dime edad: ");
                edad[i] = sc.nextInt();
            } else {
                edad[i] = 0; // para evitar basura
            }
        }
    }

    void muestraFinal(String[] tipo, int[] altura, int[] diametro, int[] edad) {

        // MEDIA DE ALTURAS
        int totalAltura = 0;
        for (int h : altura) totalAltura += h;
        double mediaAltura = (double) totalAltura / altura.length;
        System.out.println("Media de alturas: " + mediaAltura);

        // ALTURA MÁXIMA Y MÍNIMA
        int maxAltura = altura[0];
        int minAltura = altura[0];
        boolean hayMas30 = false;

        for (int h : altura) {
            if (h > maxAltura) maxAltura = h;
            if (h < minAltura) minAltura = h;
            if (h > 30) hayMas30 = true;
        }

        System.out.println("Altura máxima: " + maxAltura);
        System.out.println("Altura mínima: " + minAltura);

        // DIÁMETRO MÁXIMO Y MÍNIMO
        int maxDiam = diametro[0];
        int minDiam = diametro[0];

        for (int d : diametro) {
            if (d > maxDiam) maxDiam = d;
            if (d < minDiam) minDiam = d;
        }

        System.out.println("Diámetro máximo: " + maxDiam);
        System.out.println("Diámetro mínimo: " + minDiam);

        // MEDIA DE EDADES DE TIPO B
        int totalEdad = 0;
        int contadorB = 0;

        for (int i = 0; i < tipo.length; i++) {
            if (tipo[i].equals("B")) {
                totalEdad += edad[i];
                contadorB++;
            }
        }

        if (contadorB > 0) {
            double mediaEdad = (double) totalEdad / contadorB;
            System.out.println("Media de edades (tipo B): " + mediaEdad);
        } else {
            System.out.println("No hay árboles de tipo B.");
        }

        // ÁRBOLES DE MÁS DE 30 METROS
        if (hayMas30) {
            System.out.println("Existen árboles de más de 30 m.");
        }
    }
}
