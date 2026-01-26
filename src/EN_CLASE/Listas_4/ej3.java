package EN_CLASE.Listas_4;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        ej3 ref = new ej3();
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int [5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++ ){
            System.out.println("Introduce un número: ");
            numeros[i] = sc.nextInt();
            suma = suma + numeros[i];
        }
        System.out.println("La suma es: " + suma);

        double media = ref.hago_media(suma, numeros); // ojo, que se pone double
        System.out.println("La media es:"+ media);
    }
    double hago_media(int suma,  int [] numeros){
        int num_list = numeros.length;
        int media = suma/num_list;
        return media;
    }
}
