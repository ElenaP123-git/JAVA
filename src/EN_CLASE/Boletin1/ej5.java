package EN_CLASE.Boletin1;

import java.util.Scanner;

public class ej5 {
    public static void main(String[]args){
        ej5 referencia = new ej5();

        String member = referencia.pido_membresia("Tienes membresía premium?? (si/no): ");
        int dinero = referencia.pido_dinero_edad("Dinero gastado: ");
        int edad = referencia.pido_dinero_edad("Dime tu edad: ");

        if ((member.equals("si") && dinero > 50) || edad > 65){
            System.out.println("Tienes descuento!!!");
        }
        else{
            System.out.println("No tienes descuento");
        }
    }

    String pido_membresia(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        String membresia = sc.nextLine();
        return membresia;
    }
    int pido_dinero_edad(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        int dato = sc.nextInt();
        return dato;
    }
}
