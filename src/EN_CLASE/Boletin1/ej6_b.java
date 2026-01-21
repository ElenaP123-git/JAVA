package EN_CLASE.Boletin1; // DEVUELVO EN FUNCIÓN COMO STRING

import java.util.Scanner;

public class ej6_b {
    public static void main(String[]args){
        ej6_b referencia = new ej6_b();

        int numero = referencia.pido_numero("Tabla que quieres ver: ");
        String tabla = referencia.hago_bucle("La tabla es:", numero);
        System.out.println(tabla);

    }
    int pido_numero(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    String hago_bucle(String mensaje, int numero) {
        String tabla = mensaje + "\n"; // para que el mensaje se imprima arriba de la tabla (si no hubiera mensaje, se pondría: String tabla = "")

        for (int i = 1; i <= 10; i++) {
            tabla += numero + " x " + i + " = " + (numero * i) + "\n"; // /n es para que se imprima cada cosa bajpo otra
        }

        return tabla;
    }

}
