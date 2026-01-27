package INICIAL.Boletin2;

import java.util.Scanner;

public class ej8_a {
    public static void main(String[]args){
        ej8_a referencia = new ej8_a();

        int edad = referencia.pido_edad_precio("Introduce tu edad: ");
        int precio  = referencia.pido_edad_precio("Introduce precio: ");

        int descuento = referencia.calculo_descuento(edad, precio);

        System.out.println("Descuento aplicado: " + descuento + "€");
        System.out.println("Precio final: " + (precio - descuento) + "€");
    }

    int pido_edad_precio(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        return sc.nextInt();
    }

    int calculo_descuento(int edad, int precio){
        // Si edad >= 60 → 30%, si no → 10% (porcentaje)
        double porcentaje = (edad >= 60) ? 0.30 : 0.10;

        System.out.println("Su descuento es del " + (int)(porcentaje * 100) + "%");

        return (int)(precio * porcentaje);
    }
}