package programacion.Tema1.ActividadesU1Java.Tablas;

public class Ejercicio2Tablas {
    static void main() {
        String []tabla={"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        for (int i=0;i<tabla.length;i++){
            if (i<5) {
                System.out.println(tabla[i]+" es laborable");
            }
            else{
                System.out.println(tabla[i]+" es festivo");
            }
        }
    }
}
