package programacion.Tema1.ActividadesU1Java.Introduccion;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        if (num1 < 0)
            System.out.println("Tu número es negativo");
        else {
            System.out.println("Tu número es positivo");
        }
    }
}
