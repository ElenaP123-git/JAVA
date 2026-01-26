package EN_CLASE.Listas_4; // cuando quiero returnear una misma variable "contador" tengo que definirlas dentro de cada función
                           // que sino, tengo que poner sumaP y sumaI fuera (un poco mas lío)
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        ej4 ref = new ej4();

        int[] numeros = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número: ");
            numeros[i] =sc.nextInt();
        }

        int pares = ref.num_pares(numeros);
        System.out.println("Hay " + pares + " números pares");

        int impares = ref.num_impares(numeros);
        System.out.println("Hay " + impares + " números impares");

    }

    int num_pares(int[] numeros) {
        int contador = 0; // ves
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador += 1;
            }
        }
        return contador;
    }

    int num_impares(int[] numeros ){
        int contador = 0; // ves
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contador += 1;
            }
        }
        return contador;
    }
}
