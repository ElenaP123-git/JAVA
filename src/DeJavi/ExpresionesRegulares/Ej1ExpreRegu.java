package DeJavi.ExpresionesRegulares;

public class Ej1ExpreRegu {
    public static void main(String[] args) {

    String patron="^\\d+$";

    String cadena="Hola caracola";
    boolean soloNumeros = cadena.matches(patron);

    String cadena2="123456";
    boolean soloNumeros2=cadena2.matches(patron);
    }
}