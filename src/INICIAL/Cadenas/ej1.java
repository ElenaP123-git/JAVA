package INICIAL.Cadenas;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String  nombre = sc.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i < nombre.length();i++){
            String letras = nombre.substring(i,i+1); // recorre todas las letras (SUBSTRING)
            if ("aeiou".contains(letras)){ // CONTAINS
                contador++;
            }
        }
        System.out.println("Hay " + contador + " vocales");
    }
}
