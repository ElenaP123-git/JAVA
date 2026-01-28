package programacion.Tema1.ActividadesU1Java.Funciones;

import java.util.Scanner;

public class Ejercicio2Funciones {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1=sc.nextInt();
        System.out.println("Introduce otro número: ");
        int num2=sc.nextInt();
        Ejercicio2Funciones referencia = new Ejercicio2Funciones();
        int multi=referencia.multiplicacion(num1, num2);
        System.out.println(multi);
    }

    int multiplicacion (int num1, int num2){
        int mult = num1* num2;

        return mult;
    }
}
