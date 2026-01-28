package programacion.Tema1.ActividadesU1Java.Matrices;

import java.util.Scanner;

public class Ejercicio2Matrices {
    static void main() {
        Ejercicio2Matrices referencia=new Ejercicio2Matrices();
        boolean [][]matriz=new boolean[3][4];
        int opcion=referencia.mostrarMenu();
    }

    int mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Registrar espectadores");
        System.out.println("2) Contar público por fila");
        System.out.println("3) Validar aforo");
        System.out.println("4) Salir");
        System.out.println("Introduce una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    void registrarEspectadores(boolean[][]matriz){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fila: ");
        int fila = sc.nextInt();
        if (fila>0){
            System.out.println("Introduce la columna: ");
            int columna = sc.nextInt();

        }
    }
}
