package programacion.Tema1.ActividadesU1Java.Retos;

import java.util.Scanner;

public class Reto2 {
    static void main(String[] args) {
        Reto2 ref = new Reto2();
        boolean resultado = ref.hayDevolucion();
        if(resultado)
        {
            System.out.println("Devolución");
        }
        else {
            System.out.println("No hay devolucion");
        }

        System.out.println(resultado);

    }
    boolean hayDevolucion(){
        boolean hay = false;
        int numLuces =0;

        for(int i =0; i <10; i++){
            Scanner escaner = new Scanner(System.in);
            System.out.println(" Dime si las luces estan estan apagadas: ");
            String luces = escaner.nextLine();
            if(luces.equals( "S")){
                //    System.out.println("La luz esta apagada");
                numLuces = numLuces +1;

            }
            if(numLuces > 5){
                hay = true;
            }
        }
        return hay;
    }
}
