package programacion.Tema1.ActividadesU1Java.Switch;
import java.util.Scanner;

public class Ejercicio1Switch {
    static void main() {
        System.out.println("Dime un número: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        switch (num){
            case 0:
                // para valor 0
                System.out.println("CERO");
                //break;
            case 1:
                // para valor 1.
                System.out.println("UNO");
                //break;
            case 2 :
                // para valor 2.
                System.out.println("DOS");
                break;
            default:
                //para el resto
                System.out.println("OTRAS");
        }
    }
}
