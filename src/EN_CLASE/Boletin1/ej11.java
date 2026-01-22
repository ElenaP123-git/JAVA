package EN_CLASE.Boletin1;

import java.util.Scanner;

public class ej11 {
    public static void main(String[]args){
        ej11 referencia = new ej11();

        referencia.formo_triangulo(); // lo pongo así porque solo imprime, no devuelve nada
    }
    int pido_num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        return sc.nextInt(); // se puede poner así o devolver el número como ej10_a
    }

    void formo_triangulo(){
        int numero = pido_num();
        for (int i = 0; i <= numero; i++){
            String estrella = "*".repeat(i);
            System.out.println(estrella);
        }
    }
}
