import java.util.Scanner;

public class ejemplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejemplo ref = new ejemplo();
        String tipoArbol = "";

        System.out.println("Dime el numero de arboles: ");
        int numArboles = sc.nextInt();

        int [] diametro = new int[numArboles];
        int [] altura = new int[numArboles];
        int [] edad = new int[numArboles];

        ref.datoarboles(tipoArbol, sc, diametro, altura, edad, numArboles);

        int mediaA = 0;
        int mediaE = 0;
    }

    void datoarboles(String tipoArbol, Scanner sc, int [] diametro, int [] altura, int[] edad, int numArboles) {
        for (int i = 0; i < numArboles; i++) {
            if (tipoArbol.equals("A") || tipoArbol.equals("B")) {
                System.out.println("Dime diametro");
                diametro[i] = sc.nextInt(); // en la posicion i de la tabla diametro, se añade lo que introduzca

                System.out.println("Dime altura");
                altura[i] = sc.nextInt();

                if (tipoArbol.equals("B")) {
                    System.out.println("Dime edad");
                    edad[i] = sc.nextInt();
                } else {
                    System.out.println("Valor incorrecto");
                }
            }
        }
    }

    void muestraFinal(int mediaE, int[] altura, int [] diametro, int [] edad, int mediaA){

        // media altura
        int total = 0;

        for (int i = 0; i < altura.length; i++) {
            total += altura[i];
        }
        mediaA = total / altura.length;
        System.out.println("La media de altura es: " + mediaA + ".");

        // Altura máxima y minima
        int mayorA = altura[0];
        int menorA = altura[0];

        for (int i = 0; i < altura.length; i++) {
            if (mayorA < altura[i]){
                mayorA = altura[i];
            }
            else if (menorA > altura[i]){
                menorA = altura[i];
            }
        }

        // Diametro maximo y minimo
        int mayorD = diametro[0];
        int menorD = diametro[0];

        for (int i = 0; i < diametro.length; i++) {
            if (mayorD < diametro[i]){
                mayorD = diametro[i];
            }
            else if (menorD > diametro[i]) {
                menorD = diametro[i];
            }
        }

        // media edad
        int totalE = 0;

        for (int i = 0; i < edad.length; i++) {
            totalE += edad[i];
        }
        mediaE = totalE / edad.length;
        System.out.println("La media de altura es: " + mediaE + ".");
    }
}