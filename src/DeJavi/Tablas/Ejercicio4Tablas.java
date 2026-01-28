package programacion.Tema1.ActividadesU1Java.Tablas;

import java.util.Scanner;

public class Ejercicio4Tablas {
    static void main(String[] args) {
        int [] tabla={1,2,3,4,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que desees buscar: ");
        int numEncontrar = sc.nextInt();
        boolean encontrado=false;
        int b=0;
        while (b < tabla.length && !encontrado) {
            if (numEncontrar==tabla[b]){
                System.out.println(b);
                encontrado = true;
            }
            else {
                b++;
            }
        }
        if(encontrado){
            System.out.println(b);
        }
        else{
            System.out.println("-"+(b-1));
        }
    }
}
