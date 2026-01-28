package programacion.Tema1.ActividadesU1Java.Introduccion;

import java.util.Scanner;

public class Ejercicio002 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
