package programacion.Tema1.ActividadesU1Java.Introduccion;

import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = sc.nextDouble();
        double mayor = num1;
        if (num2 > mayor && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
    }
}
