package EN_CLASE.Boletin3;

import java.util.Scanner;

public class ej1 {
    static void main(String[] args) {
        ej1 ref = new ej1();

        String grupo = ref.pedir_grupo();
        int alumnos = ref.pido_por_grupos(grupo);
        ref.hago_bucle_resultado (alumnos);
    }
    String pedir_grupo(){
        Scanner sc = new Scanner (System.in);
        System.out.println("GRUPOS: A,B,C,D");
        System.out.println("Escoge un grupo: ");
        String opcion = sc.nextLine().toUpperCase(); //para que pille las minusculas tmb
        return opcion;
    }

    int pido_por_grupos(String grupo) {

        int total_alumnos = 0;

        switch (grupo) {
            case "A":
                total_alumnos = 25;
                break;
            case "B":
                total_alumnos = 28;
                break;
            case "C":
                total_alumnos = 31;
                break;
            case "D":
                total_alumnos = 29;
                break;
            default:
                System.out.println("Opción inválida");
        }
            return total_alumnos;
    }
        void hago_bucle_resultado(int alumnos) {
            Scanner sc = new Scanner(System.in);

            String nombre;
            int nota1;
            int nota2;
            int nota3;
            double total;
            double media = 0;

            int contador_suspensos = 0;
            int contador_sobresalientes = 0;

            double mayor_media = -1; // por si la media es 0
            String nombre_mayor_media = "";

            for (int i = 1; i <= alumnos; i++){
                System.out.println("Nombre: ");
                nombre = sc.next();
                System.out.println("Nota 1º Trimestre: ");
                nota1 = sc.nextInt();
                System.out.println("Nota 2º Trimestre");
                nota2 = sc.nextInt();
                System.out.println("Nota 3º Trimestre");
                nota3 = sc.nextInt();

                total = (nota1 + nota2 + nota3);
                media = total / 3;

                if (media < 5){
                    contador_suspensos++;
                }
                if (media >= 9){
                    contador_sobresalientes++;
                }
                if (media > mayor_media){ // BUSCAR EL MAYOR
                    mayor_media = media;
                    nombre_mayor_media = nombre;
                }
            }
            System.out.println("--- RESULTADOS ---");
            System.out.println("Alumno con mayor media: " + nombre_mayor_media + " (" + mayor_media + ")");
            System.out.println("Número de suspensos: " + contador_suspensos);

            if (contador_sobresalientes > 0) {
                System.out.println("Existen sobresalientes: " + contador_sobresalientes);
            }
    }
}
