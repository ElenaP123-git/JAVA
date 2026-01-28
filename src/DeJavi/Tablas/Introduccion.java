package programacion.Tema1.ActividadesU1Java.Tablas;

public class Introduccion {
    static void main() {
        int [] tabla2 = {1,2,3,4};
        int [] tabla;

        tabla=tabla2;
        tabla2[3]=8;
        System.out.println(tabla[3]);
        System.out.println(tabla2[3]);
    }
}
