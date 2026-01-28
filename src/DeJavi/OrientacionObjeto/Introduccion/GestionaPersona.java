package programacion.Tema1.ActividadesU1Java.OrientacionObjeto;

public class GestionaPersona {
    public static void main(String[] args) {
        Persona paula=new Persona(21, "Paula", "Cuenca", "Gimnasia Rítmica", "Avatar");
        System.out.println(paula.toString());
        paula.hablar();

        Persona pepe=new Persona();
        pepe.nombre="Pepe";
        System.out.println(pepe.toString());
        pepe.comer();
    }
}
