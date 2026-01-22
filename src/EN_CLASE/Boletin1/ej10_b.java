package EN_CLASE.Boletin1; // CONTADOR EMPIEZA EN 0 Y FUNCIÓN NO TOMA NADA
                           // MÁS SENCILLO
import java.util.Scanner;
import java.util.Random;

public class ej10_b {

    public static void main(String[]args){
        ej10_b ref = new ej10_b();

        int resultado = ref.adivino_numero();
        System.out.println("El número era: " + resultado);
    }

    int pido_num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        return sc.nextInt(); // se puede poner así o devolver el número como ej10_a
    }

    int adivino_numero(){
        Random random = new Random();
        int aleatorio = random.nextInt(1,5);
        int contador = 0;
        int intento;

        do {
            intento = pido_num();   // primer intento y todos los demás
            contador++;

            if (intento != aleatorio){
                System.out.println("Fallaste...");
            }

        } while (intento != aleatorio);

        System.out.println("Acertaste!!");
        System.out.println("Intentos: " + contador);

        return aleatorio;
    }
}

