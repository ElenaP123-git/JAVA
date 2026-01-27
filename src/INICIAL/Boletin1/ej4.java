package INICIAL.Boletin1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        ej4 referencia = new ej4();
        String usser; // tengo que definir la variable fuera del while para que lo tome el do{}
        int password;
        do {
            usser = referencia.pido_usuario("Introduce el usuario: ");
            password = referencia.pido_contraseña("Introduce contraseña: ");

            if (!usser.equalsIgnoreCase("admin") || password != 123) {
                System.out.println("Incorrecto, inténtalo de nuevo");
            }
        } while (!usser.equalsIgnoreCase("admin") || password != 123); // en Strings se pone "si no" --> (!variable.equals) "si si" --> (variable.equals) IgnoreCase para ignorar MAY y MIN
        System.out.println("Bienvenido :)"); //         || es OR
    }

    String pido_usuario(String mensaje){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje);
        String usuario = sc.nextLine();
        return usuario;
    }
    int pido_contraseña(String mensaje2){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensaje2);
        int contraseña = sc.nextInt();
        return contraseña;
    }

}
