package programacion.Tema1.ActividadesU1Java.Introduccion;

import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = sc.nextInt();
        if (num1 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Un número es menor que 0");
        }
    }

}
