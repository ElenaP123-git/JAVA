package INICIAL.Exp_Regulares;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class apuntes {
    public static void main(String[] args) {

        // ============================================================
        // APUNTES DE EXPRESIONES REGULARES EN JAVA
        // ============================================================

        /* ------------------------------------------------------------
           1. String.matches()
           ------------------------------------------------------------
           - Valida si TODO el texto cumple el patrón.
           - Ideal para comprobar formatos completos.
           - Devuelve true o false.
        */

        System.out.println("=== matches() ===");

        String texto = "12345";
        System.out.println(texto.matches("[0-9]+"));   // true → solo números

        System.out.println("Hola".matches("[a-zA-Z]+")); // true → solo letras

        String email = "usuario@correo.com";
        System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
        // true → email válido


        /* ------------------------------------------------------------
           2. Pattern + Matcher
           ------------------------------------------------------------
           - Se usa para buscar dentro del texto.
           - m.find() encuentra coincidencias.
           - m.start() devuelve la posición.
        */

        System.out.println("=== Pattern + Matcher ===");

        String texto2 = "hola mundo hola planeta";
        Pattern p = Pattern.compile("hola");
        Matcher m = p.matcher(texto2);

        while (m.find()) {
            System.out.println("Encontrado 'hola' en posición: " + m.start());
        }


        /* ------------------------------------------------------------
           3. SINTAXIS BÁSICA DE REGEX
           ------------------------------------------------------------

           CLASES DE CARACTERES:
           [abc]       → a, b o c
           [a-z]       → letras minúsculas
           [A-Z]       → letras mayúsculas
           [0-9]       → dígitos
           [a-zA-Z]    → cualquier letra
           [^a-z]      → NO minúsculas

           CUANTIFICADORES:
           +            → una o más veces
           *            → cero o más veces
           ?            → cero o una vez
           {n}          → exactamente n veces
           {n,}         → al menos n veces
           {n,m}        → entre n y m veces

           METACARACTERES:
           .            → cualquier carácter
           \\d          → dígito
           \\D          → no dígito
           \\w          → letra, número o _
           \\W          → lo contrario
           \\s          → espacio
           \\S          → no espacio

           IMPORTANTE:
           En Java hay que escapar las barras → \d se escribe \\d
        */


        /* ------------------------------------------------------------
           4. EJEMPLOS TÍPICOS DE EXAMEN
           ------------------------------------------------------------ */

        System.out.println("=== Ejemplos típicos ===");

        System.out.println("-123".matches("-?[0-9]+"));  // entero con signo
        System.out.println("Hola".matches("[a-zA-Z]+")); // solo letras

        System.out.println("test@mail.com"
                .matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));

        System.out.println("12345678A".matches("[0-9]{8}[A-Za-z]")); // DNI español


        /* ------------------------------------------------------------
           5. BUSCAR TODAS LAS APARICIONES DE UNA PALABRA
           ------------------------------------------------------------ */

        System.out.println("=== Buscar todas las apariciones ===");

        String texto3 = "El coche rojo es más rápido que el coche azul";
        Pattern p2 = Pattern.compile("coche");
        Matcher m2 = p2.matcher(texto3);

        while (m2.find()) {
            System.out.println("Encontrado 'coche' en índice: " + m2.start());
        }


        /* ------------------------------------------------------------
           6. CONSEJOS
           ------------------------------------------------------------
           1) Si quieres VALIDAR → matches()
           2) Si quieres BUSCAR → Pattern + Matcher
           3) Recuerda escapar barras: \\d, \\s, \\w
           4) Empieza por patrones simples
           5) regex101.com es muy útil para probar patrones
        */

    }
}
