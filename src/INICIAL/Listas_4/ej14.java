package INICIAL.Listas_4; // recorro letras de los nombres introducidos en lista

public class ej14 {
    public static void main(String[] args) {

        String[] nombres = {"elena", "alicia", "joaquin", "marisabel", "coco", "chinchan"};

        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];

            System.out.println("Letras de " + nombre + ":");

            for (int j = 0; j < nombre.length(); j++) { // nombre es un String, por tanto, uso length() en lugar de .length (en Array)
                String letra = nombre.substring(j, j + 1); // letra 0, letra 1...
                System.out.println(letra);
            }

            System.out.println(); // después de finalizar el bucle de letras, se imprime un espacio para separarlas
        }

    }

}
