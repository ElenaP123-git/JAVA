package EN_CLASE.Boletin1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args){ // esto es más correcto
        ej1 referencia = new ej1(); // para poder llamar funciones
        int x = referencia.pido_numeros("Dime un número (144): "); // la llamo
        int y = referencia.pido_numeros("Dime otro número (999): ");
        int total = referencia.suma_nums(x,y);
        System.out.println("La suma es: " + total);

    }
    int pido_numeros(String mensaje){ //para que imprima el mensaje de cuando se llama
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }

    int suma_nums(int x,int y){
        int suma = x + y;
        return suma;
    }
}
