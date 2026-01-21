package EN_CLASE.Boletin1; // DEVUELVO EN FUNCIÓN CON LISTA

import java.util.Scanner;

public class ej6_c {
    public static void main(String[]args){
        ej6_c referencia = new ej6_c();

        int numero = referencia.pido_numero("Tabla que quieres ver: ");
        int[] lista = referencia.hago_bucle("La tabla es:",numero);
        for (int valor : lista) {
            System.out.println(valor);
        }

    }
    int pido_numero(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    int[] hago_bucle(String mensaje,int numero) {
        System.out.println(mensaje);

        int[] resultados = new int[10];

        for (int i = 0; i < 10; i++) {
            int contador = i + 1;
            resultados[i] = numero * contador;
        }

        return resultados;
    }

}
