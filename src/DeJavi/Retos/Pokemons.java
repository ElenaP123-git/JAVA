package programacion.Tema1.ActividadesU1Java.Retos;

import java.util.Scanner;

public class Pokemons {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Pokemons referencia=new Pokemons();
        int option=0;
        String [] pokemons = new String[15];
        int [] niveles = new int [15];

        do{
            option=referencia.pintoMenu();
            int rep=0;
            if (option==1){
                System.out.println("--CAPTURANDO POKEMONS--");
                rep = referencia.capturaPokemon(sc, rep, pokemons,niveles );
            } else if(option==2){
                System.out.println("--COMENZANDO BATALLA--");
            } else if (option==3) {
                System.out.println("--MOSTRANDO POKEDEX--");
                referencia.mostrarPokedex(pokemons,niveles,rep);
            }
            else{
                System.out.println("ERROR");
            }
        }
        while(option<4);
    }

    //APARTADO 1

    int pintoMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1)Capturar Pókemon");
        System.out.println("2)Realizar batalla");
        System.out.println("3)Mostrar Pokédex");
        System.out.println("4)Finalizar batalla");
        System.out.println("Introduce una opcion: ");
        int opcion=sc.nextInt();

        return opcion;
    }

    //APARTADO 2

    int capturaPokemon(Scanner sc, int rep,  String [] pokemon, int [] nivel){
            System.out.println("Introduce el nombre del Pokemon: ");
            pokemon[rep]=sc.next();
            System.out.println("Introduce el nivel del Pokemon: ");
            nivel[rep]=sc.nextInt();
            return rep+1;

    }

    //APARTADO 3

    void mostrarPokedex(String [] pokemons, int [] niveles, int rep){
        String [] tabla={"Pokemons","Niveles"};
        System.out.println(tabla);
        for(int i=0;i<rep;i++){
            System.out.println(pokemons[i]+" , "+niveles[i]);
            i++;
        }
    }
}
