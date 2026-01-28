package programacion.Tema1.ActividadesU1Java.Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Matrices {
    public static void main(String[] args) {
        Ejercicio3Matrices referencia=new Ejercicio3Matrices();
        int[][] mapaEstelar = new int[5][5];
        referencia.generarMapaEstelar(mapaEstelar);
        int opcion=0;
        do {
            opcion=referencia.pintoMenu();
            if (opcion==1) {
                referencia.mostrarMapa(mapaEstelar);
            }
            else if (opcion==2){
                referencia.identificarAmenazas(mapaEstelar);
            }
            else if (opcion==3) {
                int suma=referencia.calculoEscudo(mapaEstelar);
                System.out.println("La suma de todo el mapa es de: "+suma);
            }
            else if (opcion==4){
                referencia.zonaSegura(mapaEstelar);
            }

        } while (opcion != 5);

    }

    int pintoMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Mostrar mapa estelar");
        System.out.println("2. Identificar amenazas (energía > 80)");
        System.out.println("3. Calcular el Escudo");
        System.out.println("4. Encontrar refugio");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        return opcion;
    }

    void generarMapaEstelar(int[][] mapaEstelar) {
        Random random = new Random();
        for (int fila = 0; fila < mapaEstelar.length; fila++) {
            for (int columna = 0; columna < mapaEstelar[fila].length; columna++) {
                mapaEstelar[fila][columna] = random.nextInt(101);
            }
        }
    }

        // Muestra la matriz completa
    void mostrarMapa(int[][] mapaEstelar) {
        System.out.println("Mapa Estelar:");
        for (int i = 0; i < mapaEstelar.length; i++) {
            for (int j = 0; j < mapaEstelar[0].length; j++) {
                System.out.print(mapaEstelar[i][j] + " ");
            }
            System.out.println();
        }
    }

        // Identifica zonas con energía superior a 80
    void identificarAmenazas(int[][] mapaEstelar) {
        System.out.println("Zonas de alta energía (posibles agujeros negros):");
        boolean hayAmenazas = false;

        for (int fila = 0; fila < mapaEstelar.length; fila++) {
            for (int columna = 0; columna < mapaEstelar[fila].length; columna++) {
                if (mapaEstelar[fila][columna] > 80) {
                    System.out.println("Amenaza en [" + fila + "][" + columna + "] -> Energía: " + mapaEstelar[fila][columna]);
                    hayAmenazas = true;
                }
            }
        }

        if (!hayAmenazas) {
            System.out.println("No se detectaron amenazas.");
        }
    }

    int calculoEscudo(int[][]mapaEstelar){
        int suma = 0;
        for (int i = 0; i < mapaEstelar.length; i++) {
            for (int j = 0; j < mapaEstelar[i].length; j++) {
                suma += mapaEstelar[i][j];
            }
        }
        return suma;
    }

    void zonaSegura(int[][] mapaEstelar){
        int valorMinimo = mapaEstelar[0][0];
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < mapaEstelar.length; i++) {
            for (int j = 0; j < mapaEstelar[i].length; j++) {
                if (mapaEstelar[i][j] < valorMinimo) {
                    valorMinimo = mapaEstelar[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("Valor mínimo: " + valorMinimo);
        System.out.println("Posición -> Fila: " + fila + ", Columna: " + columna);
    }
}