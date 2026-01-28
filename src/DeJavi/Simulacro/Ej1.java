package programacion.Tema1.ActividadesU1Java.Simulacro;

import java.util.Random;
import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random aleatorio=new Random();
        Ej1 referencia=new Ej1();
        int opcion=0;
        int rep=0;
        String [] historial=new String[100];
        do{
            opcion=referencia.pintoMenu(sc);
            if(opcion==1){
                rep++;
                historial=referencia.apostar(sc, aleatorio, rep);
            }
            if(opcion==2){
                referencia.mostrarHistorial(rep, historial);
            }
            else if(opcion==3){
                referencia.retirarse(historial);
            }
        } while(opcion!=4);
    }

    int pintoMenu(Scanner sc) {
        System.out.println("1) Apostar:");
        System.out.println("2) Mostrar Historia:");
        System.out.println("3) Registrarse:");
        System.out.println("4) Salir:");
        System.out.println("Introduce una opcion: ");
        int opcion = sc.nextInt();

        return opcion;
    }

    String [] apostar(Scanner sc, Random aleatorio, int rep){
        System.out.println("Introduce el número de la apuesta del 1 al 6: ");
        int numApuesta = sc.nextInt();
        String [] historial=new String[20];
        if(numApuesta>6 || numApuesta<=0){
            System.out.println("Denegado");
        }
        else{
            System.out.println("Introduce la cantidad de la apuesta: ");
            int cantApuesta = sc.nextInt();
            int numGanador= aleatorio.nextInt(6)+1;
            int [] dineroGanado=new int[20];
            int [] dineroPerdido=new int[20];
            if (numApuesta==numGanador){
                dineroGanado[rep]=cantApuesta*2;
                System.out.println("Ha salido su num. La cantidad ganada es: "+dineroGanado[rep]);
                historial[rep]="En la"+rep+"º jugada apostó al valor" +numApuesta+ " y sumó "+numGanador+" , ganando "+cantApuesta;
            }
            else{
                dineroPerdido[rep]=cantApuesta;
                dineroGanado[rep]=dineroPerdido[rep]-cantApuesta;
                System.out.println("Num salido: "+numGanador);
                System.out.println("Total dinero: "+dineroGanado[rep]);
                historial[rep]="En la"+rep+"º jugada apostó al valor" +numApuesta+ " y sumó "+numGanador+" , perdiendo "+cantApuesta;
            }
        }
        return historial;
    }

    void mostrarHistorial(int rep, String[] historial){
        for(int i=0;i<rep;i++){
            System.out.println(historial[i]);
        }
    }

    void retirarse(String[]historial){

    }
}
