package EN_CLASE.Boletin1;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args){
        ej2 referencia = new ej2();
        int num1 = referencia.pido_num("Dime un número: ");
        int num2 = referencia.pido_num("Dime otro número: ");
        int mul = referencia.multiplicacion(num1,num2);
        System.out.println("El resultado es: " + mul);
    }
    int pido_num(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int num = sc.nextInt();
        return num;
    }
    int multiplicacion(int num1,int num2){
        int multi = num1 * num2;
        return multi;
    }
}
