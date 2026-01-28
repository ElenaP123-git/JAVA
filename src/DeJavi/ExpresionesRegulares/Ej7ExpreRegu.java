package DeJavi.ExpresionesRegulares;

public class Ej7ExpreRegu {
    static void main() {
        String[] dnis = {"12345678A", "1234B", "87654321Z"};
        for (int i=0;i<dnis.length;i++) {
            if (dnis[i].matches("^\\d{8}[A-Za-z]$")) {
                System.out.println(dnis[i]);
            }
            else{
                System.out.println("No cumple con los parámetros");
            }
        }
    }
}
