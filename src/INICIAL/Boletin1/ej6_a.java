package INICIAL.Boletin1; // DEVUELVO EN FUNCIÓN BUCLE (INT)

import java.util.Scanner;

public class ej6_a {
    public static void main (String[] args){
        ej6_a referencia = new ej6_a();
        int numero = referencia.pido_numero("Tabla que quieres ver: ");
        int resultado = referencia.hago_bucle("La tabla es: ", numero);
        System.out.println("El último valor es: " + resultado);

    }
    int pido_numero(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    int hago_bucle(String mensaje, int numero) {
        int multi = 0; // la declaro fuera del for y if para que la tomen

        if (numero < 0) {
            System.out.println("Número inválido");
        } else {
            System.out.println(mensaje);
            for (int i = 1; i <= 10; i++) { // empieza en 1 y mientras que i sea <= 10 (+1)
                multi = numero * i;
                System.out.println(numero + " x " + i + " = " + multi);
            }
        }

        return multi; // devuelve el último valor calculado
    }
}
