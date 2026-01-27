package INICIAL.Cadenas;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine();

        String invertido = "";

        for (int i = nombre.length()-1; i >= 0; i--) {

            String letra = nombre.substring(i, i+1); // aquí es donde las letras voltean su orden por lo de arriba

            invertido = invertido + letra;
        }

        System.out.println("Invertido: " + invertido);

    }
}
