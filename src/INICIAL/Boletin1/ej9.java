package INICIAL.Boletin1;

import java.util.Scanner;

public class ej9 {
    public static void main(String[]args){
        ej9 ref = new ej9();

        int numero1;
        int numero2;

        do {
            numero1 = ref.pido_numeros("Introduce un número: ");
            numero2 = ref.pido_numeros("Introduce otro número: ");

            if (numero1 != 0 && numero2 != 0) {
                int suma = ref.sumar(numero1, numero2);
                System.out.println("La suma es: " + suma);
            }

        } while (numero1 != 0 && numero2 != 0); // tienen que cumplirse las dos o no se cumple ninguna

        System.out.println("Fin del programa");
    }

    int pido_numeros(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        return sc.nextInt();
    }

    int sumar(int a, int b){
        return a + b;
    }
}
