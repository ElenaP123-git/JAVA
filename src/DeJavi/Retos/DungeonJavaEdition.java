package programacion.Tema1.ActividadesU1Java.Retos;

import java.util.Scanner;
import java.util.Random;

public class DungeonJavaEdition {
    static void main() {
        System.out.println("Introduce el nombre de tu héroe: ");
        Scanner sc = new Scanner(System.in);
        String nombreHeroe = sc.nextLine();
        int vidaHeroe = 100;
        int energiaHeroe = 20;
        int vidaMonstruo = 80;
        System.out.println(+vidaHeroe + "HP, " + energiaHeroe + "MP");
        do {
            System.out.println("1. Ataque Básico: No consume energía, daño entre 7 y 12");
            System.out.println("2. Ataque Especial: Consume 5 puntos de energía, daño entre 15 y 25. (Solo si tiene energía suficiente).");
            System.out.println("3. Curar: Consume 8 de energía y recupera 20 de vida.");
            System.out.println("Introduce una opción: ");
            int opcion = sc.nextInt();
            Random random = new Random();
            switch (opcion) {
                case 1: {
                    int daño = random.nextInt(7, 12);
                    vidaMonstruo -= daño;
                    System.out.println("Vida y energía de tu Héroe: " + vidaHeroe + "HP y " + energiaHeroe + "MP");
                    System.out.println("Vida del monstruo: " + vidaMonstruo + "HP");
                    break;
                }
                case 2: {
                    int daño = random.nextInt(15, 25);
                    vidaMonstruo -= daño;
                    energiaHeroe -= 5;
                    System.out.println("Vida y energía de tu Héroe: " + vidaHeroe + "HP y " + energiaHeroe + "MP");
                    System.out.println("Vida del monstruo: " + vidaMonstruo + "HP");
                    break;
                }
                case 3: {
                    energiaHeroe -= 8;
                    vidaHeroe += 20;
                    System.out.println("Vida y energía de tu Héroe: " + vidaHeroe + "HP y " + energiaHeroe + "MP");
                    System.out.println("Vida del monstruo: " + vidaMonstruo + "HP");
                }
            }
            if (vidaHeroe < 0) {
                System.out.println("Han matado a tu héroe. Game Over");
            } else if (vidaMonstruo < 0) {
                System.out.println("Has matado al monstruo. Has Ganado!!!!");
            }
        }
        while (vidaHeroe > 0 && vidaMonstruo > 0);
    }
}