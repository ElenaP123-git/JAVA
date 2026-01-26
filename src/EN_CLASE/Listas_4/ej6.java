package EN_CLASE.Listas_4;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) { // psvm
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        boolean encontrado = false;
        int pos = -1; // se pone para definirla pero -1 es "no existe" y no sirve de nada

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Introduce un número: "); // soutp
            numeros[i] = sc.nextInt();
        }
        System.out.print("Dime el número que quieres buscar: ");
        int num = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                encontrado = true;
                pos = i +1; // guardamos la posición (he puesto +1 para que sea del 1-5) --> si fuera un String, podríamos usar el .indexOf
            }
        }
        if (encontrado) {
            System.out.println("Hemos encontrado el número " + num + " en la posición " + pos);
        }
        else {
            System.out.println("El número " + num + " no está en la lista.");
        }

    }

}

