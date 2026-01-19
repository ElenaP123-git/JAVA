/*
package EN_CLASE.Ejercicios_clase;

import java.util.Scanner;

public class RETO_POKEMON {
    static void main() {
        RETO_POKEMON referencia = new RETO_POKEMON(); // para llamar a la función
        int option = referencia.menú(); // también :)

        do {
            if (option == 1) {
                System.out.println("---CAPTURANDO POKEMONS----");
                String capturoPok = referencia.capturaPokemon();
            } else if (option == 2) {
                System.out.println("---COMIENZA BATALLA---");
            } else if (option == 3) {
                System.out.println("---MOSTRANDO POKEDEX---");
            } else {
                System.out.println("ERROR");
            }
        } while (option != 4);
    }
    int menú() {
        System.out.println("Opción 1: Capturar pokemon");
        System.out.println("Opción 2: Realizar batalla");
        System.out.println("Opción 3: Mostrar pokedex");
        System.out.println("Opción 4: Finalizar batalla");

        Scanner sc = new Scanner (System.in);
        System.out.println("Elige la opción que quieras: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    String lista_pokemon = "";
    String lista_niveles = "";

    String capturaPokemon(String lista_pokemon,String lista_niveles){
        System.out.println("---CAPTURA TU POKEMON---");
        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < 15; i++){ // empieza en 0, mientras i <15, incrementa i = i + 1
            System.out.println("Introduce el nombre de tu pokemon: ");
            String nombre = sc.nextLine();

            System.out.println("Introduce el niveñ de tu pokemon: ");
            int nivel = sc.nextInt();

    /*        String lista_pokemon += nombre;
            String lista_niveles += nivel;

            return lista_pokemon, lista_niveles

        }
    }
}
*/