package INICIAL.Boletin1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args){
        ej3 referencia = new ej3();
        int altura = referencia.pido_alt_base("Dime la altura del triángulo: ");
        int base = referencia.pido_alt_base("Dime la base del triángulo: ");
        int area = referencia.area_triangulo(altura,base);
        System.out.println("El área del triángulo es: " + area);
    }
    int pido_alt_base(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje); // si no pongo esto, no se imprime el mensaje de arriba
        int dato = sc.nextInt();
        return dato;
    }
    int area_triangulo(int altura, int base){
        int multi = altura * base;
        int area = multi / 2;
        return area;
    }
}
