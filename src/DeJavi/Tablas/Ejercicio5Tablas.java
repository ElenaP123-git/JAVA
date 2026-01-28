package programacion.Tema1.ActividadesU1Java.Tablas;

public class Ejercicio5Tablas {
    static void main(String[] args) {
        int[] tabla1 = {1, 2, 3, 4, 5};
        int[] tabla2 = {1, 2, 3, 4, 5};

        boolean iguales = true;

        // Primero comprobamos si tienen la misma longitud
        if (tabla1.length != tabla2.length) {
            iguales = false;
        } else {
            // Comparamos elemento a elemento
            int i = 0;
            while (i < tabla1.length && iguales) {
                if (tabla1[i] != tabla2[i]) {
                    iguales = false;
                }
                i++;
            }
        }

        if (iguales) {
            System.out.println("Las dos tablas tienen los mismos valores.");
        } else {
            System.out.println("Las tablas NO tienen los mismos valores.");
        }
    }
}
