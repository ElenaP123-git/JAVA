package EN_CLASE.Boletin3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        ej3 ref = new ej3();
        Scanner sc = new Scanner (System.in);

        ref.menu();
        int opcion = ref.pido_región(sc);
        int calculo_votos = ref.calculo_votos(opcion, sc);
        System.out.println("Los votos totales en la región" + opcion + "son:" + calculo_votos);

    }

    void menu(){
        System.out.println("Región nº1--> 10 provincias");
        System.out.println("Región nº2--> 4 provincias");
        System.out.println("Región nº3--> 6 provincias");
        System.out.println("Región nº4--> 1 provincia");
    }
    int pido_región(Scanner sc){
        System.out.println("Escoge una región (1-4): ");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    int calculo_votos(int opcion, Scanner sc){

        int total_votos = 0;
        int votosA = 0;
        int votosB= 0;
        int abstenciones = 0;
        String nombre_prov = "";

        if (opcion == 1){
            int contador = 0;
            for (int i = 0; i < 10; i++){
                contador += 1;

                System.out.println("Nombre provincia" + contador + ": ");
                nombre_prov = sc.nextLine();
                System.out.println("Número de votos A: ");
                votosA = sc.nextInt();
                System.out.println("Número de votos B: ");
                votosB = sc.nextInt();
                System.out.println("Abstenciones: ");
                abstenciones = sc.nextInt();
            }
        }
        else if (opcion == 2){
            int contador2 = 0;

            for (int i = 0; i < 4; i++){
                contador2 += 1;

                System.out.println("Nombre provincia" + contador2 + ": ");
                nombre_prov = sc.nextLine();
                System.out.println("Número de votos A: ");
                votosA = sc.nextInt();
                System.out.println("Número de votos B: ");
                votosB = sc.nextInt();
                System.out.println("Abstenciones: ");
                abstenciones = sc.nextInt();
            }
        }
        else if (opcion == 3){
            int contador3 = 0;

            for (int i = 0; i < 6; i++){
                contador3 += 1;
                System.out.println("Nombre provincia" + contador3 + ": ");
                nombre_prov = sc.nextLine();
                System.out.println("Número de votos A: ");
                votosA = sc.nextInt();
                System.out.println("Número de votos B: ");
                votosB = sc.nextInt();
                System.out.println("Abstenciones: ");
                abstenciones = sc.nextInt();
            }
        }
        else if(opcion ==4){

            System.out.println("Nombre provincia: ");
            nombre_prov = sc.nextLine();
            sc.nextLine(); // salto de línea
            System.out.println("Número de votos A: ");
            votosA = sc.nextInt();System.out.println("Número de votos B: ");
            votosB = sc.nextInt();
            System.out.println("Abstenciones: ");
            abstenciones = sc.nextInt();

        }
        else{
            System.out.println("Opción inválida");
        }
        total_votos = votosA +  votosB;

        if (votosA > votosB){
            System.out.println("Hay más votos en el partido A desde: " + nombre_prov);
        }
        else{
            System.out.println("Hay más votos en el partido B desde: " + nombre_prov);
        }

        if (abstenciones > 100000){
            System.out.println("ALTA ABSTENCIÓN");
        }

        System.out.println("Votos A: " + votosA);
        System.out.println("Votos B: " + votosB);
        System.out.println("Abstenciones: " + abstenciones);

        return total_votos;
    }
}
