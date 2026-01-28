package programacion.Tema1.ActividadesU1Java.Switch;

import java.util.Scanner;

public class Ejercicio6Switch {
    static void main() {
        System.out.println("Habitacion    Camas    Planta");
        System.out.println("1.Azul          2      Primera");
        System.out.println("2.Roja          1      Primera");
        System.out.println("3.Verde         3      Segunda");
        System.out.println("4.Rosa          2      Segunda");
        System.out.println("2.Gris          1      Tercera");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num1=sc.nextInt();
        switch (num1){
            case 1:
                System.out.println("Nº camas: 2");
                break;
            case 2:
                System.out.println("Nº camas: 1");
                break;
            case 3:
                System.out.println("Nº camas: 3");
                break;
            case 4:
                System.out.println("Nº camas: 2");
                break;
            case 5:
                System.out.println("Nº camas: 1");
                break;
            default:
                System.out.println("Error");
        }
    }
}
