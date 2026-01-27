package INICIAL.Cadenas;

import java.util.Scanner;

public class apuntes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /***********************
         *      2. STRINGS
         ***********************/

/*
 Un String es un texto. En Java es un objeto.
 Tiene métodos para trabajar con él.
*/

// Longitud del texto
        String texto = "Hola Mundo";
        int longitud = texto.length();   // devuelve 10

// Pasar a mayúsculas o minúsculas
        texto.toUpperCase();  // "HOLA MUNDO"
        texto.toLowerCase();  // "hola mundo"

        // Comprobar si contiene una palabra
        boolean contiene = texto.contains("Mundo"); // true

// Comparar textos
        texto.equals("Hola Mundo");          // true
        texto.equalsIgnoreCase("hola mundo"); // true (ignora mayúsculas)

        // Extraer parte del texto
        String sub = texto.substring(0, 4); // "Hola"

        // Buscar posición de un carácter o palabra
        int pos = texto.indexOf("M"); // devuelve 5

        // Reemplazar texto
        String nuevo = texto.replace("Mundo", "Helen"); // "Hola Helen"

        /***********************
         *  LIMPIAR BUFFER DEL SCANNER
         ***********************/

/*
 Cuando usas nextInt() y luego nextLine(), hay que limpiar
 el salto de línea pendiente para que no se salte la lectura.
*/

        int edad = sc.nextInt();
        sc.nextLine(); // limpia el buffer antes de pedir un String

        String nombre = sc.nextLine(); // ahora sí funciona bien

/****************************************************
 * FIN DE LOS APUNTES
 ****************************************************/

    }
}
