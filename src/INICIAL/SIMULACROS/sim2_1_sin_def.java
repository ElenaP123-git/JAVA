package INICIAL.SIMULACROS; // redondear numeros

import java.util.Scanner;

public class sim2_1_sin_def {

    public static void main(String[] args) {

        sim2_1_sin_def ref = new sim2_1_sin_def();
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos números quieres introducir?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] lista = new String[n];
        String[] listaRedondeada = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Número " + (i + 1) + ":");
            lista[i] = sc.nextLine();

            boolean valido = ref.esValido(lista[i]);

            if (!valido) {
                listaRedondeada[i] = "ERROR";
            } else {
                listaRedondeada[i] = ref.redondear(lista[i]);
            }
        }

        System.out.println("Lista redondeada:");
        for (int i = 0; i < n; i++) {
            System.out.println(listaRedondeada[i]);
        }
    }

    // ------------------ FUNCIONES SIN STATIC ------------------

    boolean esValido(String numero) {

        int puntos = numero.length() - numero.replace(".", "").length();

        if (puntos > 1) {
            return false;
        }

        String sinPunto = numero.replace(".", "");

        for (int i = 0; i < sinPunto.length(); i++) {
            String letra = sinPunto.substring(i, i + 1);

            if (letra.compareTo("0") < 0 || letra.compareTo("9") > 0) {
                return false;
            }
        }

        return true;
    }

    String redondear(String numero) {

        if (!numero.contains(".")) {
            return numero + ".00";
        }

        String[] partes = numero.split("\\.");
        String entera = partes[0];
        String decimal = partes[1];

        while (decimal.length() < 3) {
            decimal = decimal + "0";
        }

        String d1 = decimal.substring(0, 1);
        String d2 = decimal.substring(1, 2);
        String d3 = decimal.substring(2, 3);

        if (d3.compareTo("5") >= 0) {

            if (d2.equals("9")) {
                d2 = "0";

                if (d1.equals("9")) {
                    d1 = "0";
                    entera = sumarUno(entera);
                } else {
                    d1 = sumarUno(d1);
                }

            } else {
                d2 = sumarUno(d2);
            }
        }

        return entera + "." + d1 + d2;
    }

    String sumarUno(String digito) {
        String todos = "0123456789";
        int pos = todos.indexOf(digito);
        return todos.substring(pos + 1, pos + 2);
    }
}


