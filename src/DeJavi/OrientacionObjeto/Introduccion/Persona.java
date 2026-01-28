package programacion.Tema1.ActividadesU1Java.OrientacionObjeto;

public class Persona {

    //Atributos
    int edad;
    String nombre;
    String lugarNacimiento;
    String deporteFav;
    String peliFav;

    //Constructor
    //Constructor por parámetros
    public Persona(int edad, String nombre, String lugarNacimiento, String deporteFav, String peliFav) {
        this.edad = edad;
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.deporteFav = deporteFav;
        this.peliFav = peliFav;
    }

    //Constructor por defecto
    public Persona() {
        this.edad=0;
        this.nombre="";
        this.lugarNacimiento ="";
        this.deporteFav ="";
        this.peliFav ="";

    }

    //Metodos
    void hablar(){
        System.out.println("Hablando: "+nombre);
    }
    boolean aRobado(){
        return false;
    }
    void comer(){
        System.out.println("Comiendo: "+nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", deporteFav='" + deporteFav + '\'' +
                ", peliFav='" + peliFav + '\'' +
                '}';
    }
}
