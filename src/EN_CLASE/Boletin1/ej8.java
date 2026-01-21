package EN_CLASE.Boletin1;

import java.util.Scanner;

public class ej8 {
    public static void main(String[]args){
        ej8 referencia = new ej8();

        int numero = referencia.pido_numero("Introduce un número: ");
        int resultado = referencia.hago_bucle_n("De 0--> numero: ",numero);
        System.out.println("El último es: "+ resultado); // puedo NO PONER esto
    }
    int pido_numero(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    int hago_bucle_n(String mensaje,int numero){
        System.out.println(mensaje);

        int ultimo = 0; // declaro antes

        if (numero < 0){
            System.out.println("Inválido");
        }
        else{
            for (int i=0; i<=numero;i++){
                System.out.println(i);
                ultimo = i;
            }
        }
        return ultimo;
    }
}
