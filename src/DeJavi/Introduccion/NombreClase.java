package programacion.Tema1.ActividadesU1Java.Introduccion;

public class NombreClase {
    static void main() {
        int numero1 = 8;
        int numero2 = 4;

        if (numero1 > 10 && numero2 > 10) {
            System.out.println("Ambos números son mayores que 10");
        } else {
            if (numero1 > numero2) {
                System.out.println("El primero es mayor que el segundo");
            } else if (numero2 < numero1) {
                System.out.println("El segundo es mayor que el primero");
            } else {
                System.out.println("Son iguales");
            }
        }

    }
}

