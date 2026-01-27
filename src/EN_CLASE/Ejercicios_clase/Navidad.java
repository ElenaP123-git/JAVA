package EN_CLASE.Ejercicios_clase;

import java.util.Scanner;
import java.util.Random;

public class Navidad {
        public static void main (String[]args) {
            int hpHeroe = 100;
            int mpHeroe = 20;
            int hpMonstruo = 80;
            Scanner sc = new Scanner(System.in);
            System.out.println(("Dime el nombre de tu héroe: "));
            String nombreHeroe = sc.nextLine(); // por si pones palabras separadas "capitan america"


            while (hpHeroe > 0 && hpMonstruo > 0) {
                System.out.println("Hp y Mp de heroe y monstruo: " + hpHeroe + ", " + mpHeroe + ", " + hpMonstruo);
                System.out.println("Menú:");
                System.out.println("Opción 1: Ataque Básico: No consume energía. El daño será un valor aleatorio entre 7 y 12.");
                System.out.println("Opción 2: Ataque Especial: Consume 5 puntos de energía. El daño será un valor aleatorio entre 15 y 25.");
                System.out.println("Opción 3: Curar: Consume 8 de energía y recupera 20 de vida.");


                Random random = new Random();
                System.out.println("Elige una opción: ");
                int opcion = sc.nextInt();


                switch (opcion) {
                    case 1:
                        if (hpHeroe > 0) {
                            int daño = random.nextInt(7, 13); // 7-12
                            System.out.println("Daño: " + daño);
                            hpMonstruo = hpMonstruo - daño;
                            if (hpMonstruo > 0) {
                                int contraataque = random.nextInt(5, 16); // 5-15
                                hpHeroe = hpHeroe - contraataque;
                                System.out.println("El hp del monstruo se reduce a: " + hpMonstruo);
                                System.out.println("El enemigo coontraataca y tu hp se reduce a: " + hpHeroe);
                            } else {
                                System.out.println("Enemigo eliminado!");
                            }
                        } else {
                            System.out.println("Has sido eliminado!");                }
                        break;


                    case 2:
                        if (mpHeroe >= 5) {
                            mpHeroe = mpHeroe - 5;
                            System.out.println("Tu mp se reduce a: " + mpHeroe);
                            int daño = random.nextInt(15, 26); // 15-25
                            hpMonstruo = hpMonstruo - daño;
                            System.out.println("Daño: " + daño);
                            System.out.println("La vida del enemigo se reduce a: " + hpMonstruo);
                            if (hpMonstruo > 0) {
                                int contraataque = random.nextInt(5, 16); // 5-15
                                hpHeroe = hpHeroe - contraataque;
                                System.out.println("El enemigo contraataca y tu hp se reduce a: "+ hpHeroe);
                                if (hpHeroe < 0) {
                                    System.out.println("Has sido eliminado!!");
                                }
                            } else {
                                System.out.println("Enemigo eliminado!!");
                            }
                        } else {
                            System.out.println("No puedes hacer el ataque, insuficiente mp");
                        }
                        break;


                    case 3:
                        if (mpHeroe >= 8) {
                            mpHeroe = mpHeroe - 8;
                            hpHeroe = hpHeroe + 20;
                            if (hpHeroe > 100){
                                hpHeroe = 100;
                            }
                            System.out.println("Se han restablecido 20 puntos de hp");
                            System.out.println("Has gastado 8 de energía, tu vida actual es: " + hpHeroe);
                        } else {
                            System.out.println("Insuficiente mp para hacer este ataque");
                        }
                        break;
                }


            }

        }
    }