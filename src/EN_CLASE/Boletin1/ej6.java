package EN_CLASE.Boletin1; // NO DEVUELVO EN FUNCIÓN BUCLE

import java.util.Scanner;

public class ej6 {
    public static void main(String[]args){
    ej6 referencia = new ej6();

    int numero = referencia.pido_numero("Tabla que quieres ver: ");
    referencia.hago_bucle("La tabla es: ",numero); // sin variable, porque no devuelvo nada

    }
    int pido_numero(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    void hago_bucle(String mensaje,int numero) { // función que no devuelve nada

        if (numero < 0) {
            System.out.println("Número inválido");
        } else {
            System.out.println(mensaje);
            for (int i = 0; i <= 10; i++) {
                int multi = numero * i;
                System.out.println(numero + "x" + i + "=" + multi);
            }

        }

    }

}
