package INICIAL.Boletin3; // magic

import java.util.Scanner;

public class ej3_correct {

    public static void main(String[] args) {
        ej3_correct ref = new ej3_correct();
        Scanner sc = new Scanner(System.in);

        ref.menu();
        int opcion = ref.pido_region(sc);
        int calculo_votos = ref.calculo_votos(opcion, sc);
        System.out.println("Los votos totales en la región " + opcion + " son: " + calculo_votos);
    }

    void menu() {
        System.out.println("Región nº1 --> 10 provincias");
        System.out.println("Región nº2 --> 4 provincias");
        System.out.println("Región nº3 --> 6 provincias");
        System.out.println("Región nº4 --> 1 provincia");
    }

    int pido_region(Scanner sc) {
        System.out.println("Escoge una región (1-4): ");
        int opcion = sc.nextInt();
        sc.nextLine(); // LIMPIA EL BUFFER
        return opcion;
    }

    int calculo_votos(int opcion, Scanner sc) {

        int total_votosA = 0;
        int total_votosB = 0;
        int total_abst = 0;

        int maxA = -1;
        int maxB = -1;

        String provMaxA = "";
        String provMaxB = "";

        boolean altaAbst = false;

        int numProvincias = 0;

        if (opcion == 1) numProvincias = 10;
        else if (opcion == 2) numProvincias = 4;
        else if (opcion == 3) numProvincias = 6;
        else if (opcion == 4) numProvincias = 1;
        else {
            System.out.println("Opción inválida");
        }

        for (int i = 1; i <= numProvincias; i++) {

            System.out.println("Nombre provincia " + i + ": ");
            String nombre_prov = sc.nextLine();

            System.out.println("Número de votos A: ");
            int votosA = sc.nextInt();

            System.out.println("Número de votos B: ");
            int votosB = sc.nextInt();

            System.out.println("Abstenciones: ");
            int abstenciones = sc.nextInt();
            sc.nextLine(); // LIMPIA EL BUFFER

            // ACUMULADORES
            total_votosA += votosA;
            total_votosB += votosB;
            total_abst += abstenciones;

            // MAXIMOS A
            if (votosA > maxA) {
                maxA = votosA;
                provMaxA = nombre_prov;
            }

            // MAXIMOS B
            if (votosB > maxB) {
                maxB = votosB;
                provMaxB = nombre_prov;
            }

            // ALTA ABSTENCIÓN
            if (abstenciones > 100000) {
                altaAbst = true;
            }
        }

        int total_votos = total_votosA + total_votosB;

        System.out.println("Votos totales A: " + total_votosA);
        System.out.println("Votos totales B: " + total_votosB);
        System.out.println("Abstenciones totales: " + total_abst);

        System.out.println("Provincia con más votos A: " + provMaxA);
        System.out.println("Provincia con más votos B: " + provMaxB);

        if (altaAbst) {
            System.out.println("ALTA ABSTENCIÓN");
        }

        return total_votos;
    }
}

