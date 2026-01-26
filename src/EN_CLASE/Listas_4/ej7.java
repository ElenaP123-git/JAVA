package EN_CLASE.Listas_4;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        Scanner sc = new Scanner(System.in);
        int contador = 0;

         for (int i = 0; i < numeros.length; i++){
             System.out.print("Introduce un número: ");
             numeros[i] = sc.nextInt();
         }

        System.out.print("Introduce el número que quieres encontrar: ");
         int num = sc.nextInt();

         for (int i = 0; i < numeros.length; i++) {
             if (numeros[i] == num){
                 contador += 1;
             }
         }
        System.out.print("El número que escogiste ha salido " + contador + " veces");
    }
}
