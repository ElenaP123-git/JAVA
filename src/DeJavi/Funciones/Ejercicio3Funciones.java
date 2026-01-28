package programacion.Tema1.ActividadesU1Java.Funciones;

import java.util.Scanner;

public class Ejercicio3Funciones {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado del rectángulo: ");
        int num1=sc.nextInt();
        System.out.println("Introduce la base del rectángulo: ");
        int num2=sc.nextInt();
        Ejercicio3Funciones referencia = new Ejercicio3Funciones();
        float area=referencia.areaRectangulo(num1, num2);
        System.out.println(area);
    }
    float areaRectangulo(int num1, int num2){
        float areas=num1*num2;
        return areas/2;
    }
}
