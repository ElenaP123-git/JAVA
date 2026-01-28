package programacion.Tema1.ActividadesU1Java.Funciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10Funciones {
    static void main() {
        Random r = new Random();
        int numeroAdivinar=r.nextInt(0,10);
        Ejercicio10Funciones ref=new Ejercicio10Funciones();
        ref.adivinaNum(numeroAdivinar);
    }
    void adivinaNum(int numeroA) {
        Scanner sc = new Scanner(System.in);
        boolean adivinado=false;
        int rep=0;
        while (!adivinado) {
            System.out.println("Introduce el tu apuesta de número: ");
            int num1 = sc.nextInt();
            if (num1==numeroA){
                System.out.println("Número adivinado");
                System.out.println("El número a adivinar era el " +numeroA+ ". Felicidades!!");
                System.out.println("Has tenido " +rep+ " repeticiones");
                adivinado=true;
            }
            else{
                System.out.println("Intentalo de nuevo");
                rep=rep +1;
            }
        }
    }
}
