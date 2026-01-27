package INICIAL.Boletin1; // aquí me di cuenta de la importancia de los nombres...

import java.util.Scanner;

public class ej7 {
    public static void main(String[]args){
        ej7 papasfritas = new ej7();

        int numero = papasfritas.pido_numero("Dame un número: ");
        int multiplos = papasfritas.imprimeMultiplos("Múltiplos:",numero);
        System.out.println("El último es: " + multiplos);
    }
    int pido_numero(String mensaje){
        Scanner huevo = new Scanner (System.in);
        System.out.println(mensaje);
        int num = huevo.nextInt();
        return num;
    }
    int imprimeMultiplos (String mensaje,int numero){
        System.out.println(mensaje);

        int resultado = 0;

        if (numero < 0){
            System.out.println("Inválido");
        }
        else{
            for (int i = 1; i<=10; i++){
                resultado = numero * i; // la tabla de multiplicar, vaya
                System.out.println(resultado);
                }
            }
        return resultado;
    }
}

