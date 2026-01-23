package EN_CLASE.Boletin3;

import java.util.Scanner;

public class ej2 {
    static void main(String[]args) {
        ej2 ref = new ej2();
        String tipo = ref.tipo_arbol("Introduce el tipo(A/B): ");
    }
    String tipo_arbol(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        return sc.nextLine().toUpperCase();
    }
    int calculo_dia_alt(String tipo){
        switch (tipo){
            case"A":
                break;
        }
    }
}
