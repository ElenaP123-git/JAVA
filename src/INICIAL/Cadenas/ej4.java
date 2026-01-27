package INICIAL.Cadenas;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine().toLowerCase();

        System.out.println("Introduce una letra:");
        String letra = sc.nextLine().toLowerCase();

        int contador = 0;

        for (int i= 0; i< nombre.length();i++){
            String letras = nombre.substring(i,i+1);
            if (letras.equals(letra)){
                contador++;
            }
        }
        System.out.println("En el nombre hay " + contador + " letras");
    }
}
