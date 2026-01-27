package INICIAL.Ejercicios_clase;

public class matches {
    public static void main(String[]args){
        String frase = "Hola, esto es una matrícula: 1234ABC";
        String frase2 = "123A5W";
        String frase3 = "1234A";
        String frase4 = "1234ABZXPPPPPP";

        String s = ".*\\d{4}[A-Z]{3}"; // "lo que sea y luego una matrícula"
        System.out.println(frase.matches(s));
        System.out.println(frase2.matches(s));
        System.out.println(frase3.matches(s));
        System.out.println(frase4.matches(s));

        String correo = "yangheren12@gmail.com";
        String x = "^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$"; // .*@.*\\.com$*
        System.out.println(correo.matches(x));
    }
}
