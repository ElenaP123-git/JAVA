package INICIAL.Boletin2; // 2 RETURNS

import java.util.Scanner;

public class ej8 {
    public static void main(String[]args){
        ej8 referencia = new ej8();

        int edad = referencia.pido_edad_precio("Introduce tu edad: ");
        int precio  = referencia.pido_edad_precio("Introduce precio: ");
        int solucion = referencia.calculo_descuento(edad, precio);
        System.out.println("Descuento aplicado: " + solucion + "€");
        System.out.println("Precio final: " + (precio - solucion) + "€"); // precio total
    }
    int pido_edad_precio(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        return sc.nextInt();
    }

    int calculo_descuento(int edad, int precio){
        if (edad >= 60){
            System.out.println("Su descuento es del 30%");
            int descuento = (int) (precio * 0.3);
            return descuento;
        }
        else{
            System.out.println("Su descuento es del 10%");
            int descuento = (int) (precio * 0.1);
            return descuento;
        }
    }
}
