package programacion.Tema1.ActividadesU1Java.Retos;

import java.util.Scanner;

public class JavaRacingTeam {
    static void main() {
        Scanner sc = new Scanner(System.in);
        JavaRacingTeam referencia = new JavaRacingTeam();
        int option = 0;
        String[] nombres = new String[100];
        double[] tiempos = new double[100];
        String [] identificadores= new String[100];
        int numP = 0;
        do {
            option = referencia.pintoMenu();
            if (option == 1) {
                numP = referencia.inicializarEscuderia(nombres, tiempos);
            } else if (option == 2) {
                referencia.formatearPilotos(nombres, numP);
            } else if (option == 3) {
                referencia.obtenerEstadisticas(nombres, tiempos, numP);
            } else if (option == 4) {
                System.out.println("Introduce el nombre del piloto: ");
                String nombreP = sc.next();
                nombreP = nombreP.toUpperCase();
                Double nombrePiloto = referencia.buscarPiloto(nombres, nombreP, tiempos, numP);
            } else if (option == 5) {
                identificadores=referencia.generarIdPiloto(nombres, numP);
            }
        } while (option != 6);
    }

    int pintoMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Cargar/Reiniciar Datos:");
        System.out.println("2) Formatear Nombres:");
        System.out.println("3) Ver Estadísticas:");
        System.out.println("4) Buscar Piloto:");
        System.out.println("5) Generar IDs de Carrera:");
        System.out.println("6) Salir.");
        System.out.println("Introduce una opcion: ");
        int opcion = sc.nextInt();

        return opcion;
    }

    int inicializarEscuderia(String[] nombres, double[] tiempos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos pilotos vas a registrar: ");
        int rep = sc.nextInt();
        for (int i = 0; i < rep; i++) {
            System.out.println("Introduce el nombre del piloto que vayas a registrar vas a registrar: ");
            nombres[i] = sc.next();
            System.out.println("Introduce el tiempo de " + nombres[i] + " : ");
            tiempos[i] = sc.nextDouble();
        }

        return rep;
    }

    void formatearPilotos(String[] nombres, int numP) {
        for (int i = 0; i < numP; i++) {
            nombres[i] = nombres[i].toUpperCase();
            nombres[i] = nombres[i].trim();
            if (nombres[i].length() >= 10) {
                nombres[i] = nombres[i].substring(0, 9);

            }
            System.out.println(nombres[i] + ".");
        }
    }

    void obtenerEstadisticas(String[] nombres, double[] tiempos, int numP) {
        double suma = 0;
        for (int i = 0; i < numP; i++) {
            suma = +tiempos[i];
        }
        double tiempoMedio = 0;
        tiempoMedio = suma / numP;

        double mejorTiempo = 0;
        String mejorPiloto = "";
        for (int i = 0; i < numP; i++) {
            if (tiempos[i] < tiempos[-i]) {
                mejorTiempo = tiempos[i];
                mejorPiloto = nombres[i];
            }
        }
        System.out.println("El tiempo medio de: " + tiempoMedio);
        System.out.println("El mejor tiempo registrado es: " + mejorTiempo);
        System.out.println("El piloto con mejor tiempo ha sido " + mejorPiloto + " con " + mejorTiempo + "s");
    }

    double buscarPiloto(String[] nombres, String nombreP, double[] tiempos, int numP) {
        boolean encontrado = false;
        int i = 0;
        double tiempoEnc = 0;
        while (i < numP && !encontrado) {
            nombres[i] = nombres[i].toUpperCase();
            if (nombreP.equals(nombres[i])) {
                tiempoEnc = tiempos[i];
                System.out.println("Piloto encontrado");
                System.out.println("Su tiempo registrado es de " + tiempoEnc + "s");
                encontrado = true;
            }
            else {
                i++;
                System.out.println("-1");
            }
        }
        return tiempoEnc;
    }

    String[] generarIdPiloto(String[] nombres, int numP) {
        String [] identificadores=new String[100];
        for (int i = 0; i < numP; i++) {
            identificadores[i] = nombres[i].substring(0, 3)+"-"+i;
            System.out.println("Piloto en la posicion " + i + " ID: " + identificadores[i]);
        }
        return identificadores;
    }
}