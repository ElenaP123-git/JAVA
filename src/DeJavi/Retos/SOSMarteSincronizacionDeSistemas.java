package programacion.Tema1.ActividadesU1Java.Retos;

import java.util.Arrays;
import java.util.Scanner;

public class SOSMarteSincronizacionDeSistemas {
    static void main() {
        SOSMarteSincronizacionDeSistemas referencia = new SOSMarteSincronizacionDeSistemas();
        String[] tabla = {"Recurso", "Cantidad", "Nivel Crítico"};
        String[] recursos = new String[3];
        int[] cantidades = new int[3];
        int[] limites_alerta = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de recursos que deseas introducir: ");
        int rep = sc.nextInt();

        for (int i = 0; i < rep; i++) {
            System.out.println("Introduce el nombre del recurso: ");
            recursos[i] = sc.next();
            System.out.println("Introduce la cantidad: ");
            cantidades[i] = sc.nextInt();
            System.out.println("Introduce el nivel crítico: ");
            limites_alerta[i] = sc.nextInt();
        }
        referencia.imprime(rep, tabla, recursos, cantidades, limites_alerta);


        String mensaje1 = "ERR_SISTEMA::agua::-15++FIN";
        String mensaje=mensaje1.split("\\+\\+")[0];
        int lecturaBBDD = referencia.extraerDatos(mensaje,recursos);
        System.out.println(recursos[lecturaBBDD] + " : " + cantidades[lecturaBBDD] + " : " + limites_alerta[lecturaBBDD]);
        int valor=referencia.dameValorDesdeMensaje(mensaje);
        if (valor<limites_alerta[lecturaBBDD]){
            System.out.println("¡ALERTA CRÍTICA EN "+recursos[lecturaBBDD]+"!");
        }
        else{
            System.out.println("VALIDADO EL RECURSO "+recursos[lecturaBBDD]);
        }
    }

    void imprime(int contador, String[] tabla, String[] recursos, int[] cantidades, int[] limites_alerta) {
        System.out.println(Arrays.toString(tabla));
        for (int a = 0; a < contador; a++) {
            System.out.println(recursos[a] + " , " + cantidades[a] + " , " + limites_alerta[a]);
        }
    }

    //APARTADO 2

    String dameNombreRecursoDesdeMensaje(String mensaje) {
        String nombreRecurso = "";
        String[] mensajeSeparado = mensaje.split("::");
        nombreRecurso = mensajeSeparado[1];
        return nombreRecurso;
    }

    int extraerDatos(String mensaje, String[] recursos) {
        String resultado = "";
        String nombre = dameNombreRecursoDesdeMensaje(mensaje);
        boolean encontrado = false;
        int b = 0;
        while (b < recursos.length && !encontrado) {
            if (nombre.equals(recursos[b])) {
                encontrado = true;
            }
            else {
                b++;
            }
        }
        return b;
    }

    //APARTADO 3

    int dameValorDesdeMensaje(String mensaje) {
        String[] mensajeSeparado = mensaje.split("::");
        int cantidadValor = Integer.parseInt(mensajeSeparado[2]);
        return cantidadValor;
    }
}
