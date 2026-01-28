package programacion.Tema1.ActividadesU1Java.Introduccion;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        boolean rep = true;
        while (rep) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int num1 = sc.nextInt();
            if (num1 % 2 == 0) {
                System.out.println("Su número es par");
            } else {
                System.out.println("Su número es impar");
                rep = false;
            }
        }

    }
}
