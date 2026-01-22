package EN_CLASE.Boletin1;

import java.util.Scanner;
import java.util.Random;

public class ej10 {
    public static void main(String[]args){
        ej10 referencia = new ej10();

        int genero_num;
        int numero;
        int contador = 0;

        do {
            genero_num = referencia.num_aleatorio();
            numero = referencia.adivina_num(genero_num);
            contador += 1;

            if (genero_num != numero) {
                System.out.println("Fallaste, intenta de nuevo.");
            }

        } while (genero_num != numero);
        System.out.println("Coincidiste!!! Fin del programa!!!");
        System.out.println("Intentos totales: " + contador);
    }
    int num_aleatorio(){
        Random random = new Random();
        int aleatorio = random.nextInt(1,5);
        return aleatorio;
    }
    int adivina_num(int genero_num){
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un número: ");
        int num = sc.nextInt();
        return num;
    }
}
