package INICIAL.SIMULACROS;

import java.util.Scanner;

public class sim1 {
    public static void main(String[] args) {
        sim1 referencia = new sim1();

        Scanner sc = new Scanner(System.in);

        System.out.println("Número de libros que quieres guardar: ");
        int cantidad_libros = sc.nextInt();
        sc.nextLine();

        String [] nombres = new String[cantidad_libros];
        String [] sexo = new String[cantidad_libros];
        String [] titulo_lib = new String[cantidad_libros];
        int [] precio = new int[cantidad_libros];
        int [] uds_vendidas = new int[cantidad_libros];

        String opcion= "";

        do {
            referencia.menú();
            System.out.println("Elige una opción: ");
            opcion = sc.nextLine().toUpperCase();
            referencia.ejecuto_opciones(opcion, sc, nombres, sexo, titulo_lib, precio, uds_vendidas);
        } while (!opcion.equals("S"));

    }

    void menú(){
        System.out.println("R - Registrar Libros");
        System.out.println("% - Mostrar % libros por sexo del autor");
        System.out.println("P - Mostrar libro más barato y más caro");
        System.out.println("V - Mostrar libro más vendido");
        System.out.println("S - Salir");

    }

    void ejecuto_opciones(String opcion,
                          Scanner sc,
                          String[] nombres,
                          String[] sexo,
                          String[] titulo_lib,
                          int[] precio,
                          int[] uds_vendidas){
        switch (opcion) {
            case "R":
            registrar_libros(sc, nombres.length, nombres, sexo, titulo_lib, precio, uds_vendidas);
            break;
            case "%":
                int[] porcentajes = porcentaje_m_h(sexo);
                System.out.println("Mujeres: " + porcentajes[0] + "%");
                System.out.println("Hombres: " + porcentajes[1] + "%");
                break;
            case "P":
                mostrar_caro_barato(precio, titulo_lib);
                break;
            case "V":
                String libro = libro_mas_vendido(nombres, precio, titulo_lib, uds_vendidas);
                System.out.println("Libro más vendido: " + libro);
                break;
            case "S":
                System.out.println("Finalizado. Gracias");
                break;
        }
    }

    void registrar_libros(Scanner sc, int cantidad_libros, String [] nombres, String [] sexo, String [] titulo_lib, int [] precio, int [] uds_vendidas){
        for (int i = 0; i < cantidad_libros; i++){
            System.out.println("Introduce nombre del autor/a: ");
            nombres[i] = sc.nextLine().toLowerCase();

            System.out.println("Introduce el sexo (H/M): ");
            sexo[i] = sc.nextLine().toUpperCase();

            System.out.println("Introduce el título del libro: ");
            titulo_lib[i] = sc.nextLine().toUpperCase();

            System.out.println("Introduce el precio: ");
            precio[i] = sc.nextInt();
            sc.nextLine(); // poner esto detrás de cada sc.nextInt(); para evitar el buffer

            System.out.println("Introduce las unidades vendidas: ");
            uds_vendidas[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    int[] porcentaje_m_h(String [] sexo){ // si no quiero usar lista, puedo usar void
        int contadorM = 0;
        int contadorH = 0;
        int porcentajeM = 0;
        int porcentajeH = 0;

        for (int i = 0; i < sexo.length; i++){
            if (sexo[i].equals("M")){
                contadorM++;
            }
            else if (sexo[i].equals("H")){
                contadorH++;
            }
        }
        int total = sexo.length;
        porcentajeM = (contadorM/total) * 100;
        porcentajeH = (contadorH/total) * 100;
        return new int[]{porcentajeM, porcentajeH};
    }

    void mostrar_caro_barato(int [] precio,String [] titulo_lib){
        int max = precio[0];
        int min = precio[0];
        String libro_mas_caro = "";
        String libro_menos_caro = "";

        for (int i = 0; i < precio.length; i++){
            if(max < precio[i]){
                max = precio[i];
                libro_mas_caro = titulo_lib[i];
            }
            if (min > precio[i]){
                min = precio[i];
                libro_menos_caro = titulo_lib[i];
            }
        }
        System.out.println("El libro más caro es " + libro_mas_caro + " y cuesta: " + max + " €");
        System.out.println("El libro más barato es " + libro_menos_caro + " y cuesta: " + min + " €");
    }

    String libro_mas_vendido(String [] nombres, int [] precio, String [] titulo_lib, int [] uds_vendidas){
        int más_vendido = uds_vendidas[0];
        String libro_más_vendido = "";
        String autor_mas_ventas = "";
        int precio_libro_mas_vendido = 0;

        for (int i = 0; i < uds_vendidas.length; i++){
            if (más_vendido < uds_vendidas[i]){
                más_vendido = uds_vendidas[i];
                libro_más_vendido = titulo_lib[i];
                autor_mas_ventas = nombres[i];
                precio_libro_mas_vendido = precio[i];
            }
        }
        System.out.println("Se han vendido " + más_vendido + " unidades del autor " + autor_mas_ventas + " al precio de " + precio_libro_mas_vendido + " €");
        System.out.println("El libro con más ventas es: ");
        return libro_más_vendido; // si no quiero tanto lio, también uso void
    }

}
