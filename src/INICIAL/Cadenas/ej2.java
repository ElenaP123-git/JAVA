package INICIAL.Cadenas;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String  nombre = sc.nextLine().toLowerCase();

        int contador = 0;
        for (int i = 0; i < nombre.length();i++){
            String letras = nombre.substring(i,i+1); // recorre todas las letras (SUBSTRING)
            if (! "aeiou".contains(letras) && letras.compareTo("a") >= 0 && letras.compareTo("z") <= 0){ // ! CONTAINS y COMPARETO (para abecedario)
                contador++;
            }
        }
        System.out.println("Hay " + contador + " consonantes");
    }
}
