package INICIAL.Listas_4; // PRINT EN VEZ DE PRINTLN HACE QUE NO HAYA SALTO DE LINEA

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        ej5 ref = new ej5();

        int [] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i= 0; i < numeros.length; i++){
            System.out.println("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("La lista normal es:");
        System.out.print("[");
        for (int i= 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            if(i < numeros.length -1 ){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("La lista invertida es: "); // LISTA INVERTIDA!!!
        System.out.print("[");
        for (int i= numeros.length -1; i >= 0; i--){ //EMPIEZA EN EL ÚLTIMO NUMERO, TERMINA EN EL PRIMERO Y VA PARA ATRÁS
            System.out.print(numeros[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
