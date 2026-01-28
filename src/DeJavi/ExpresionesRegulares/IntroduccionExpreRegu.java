package DeJavi.ExpresionesRegulares;

public class IntroduccionExpreRegu {
    static void main() {
        String matricula1="Hola esto es una matricula: 1234ABC";
        String matricula2="123A5W";
        String matricula3="1234A";
        String matricula4="1234ABZXPPPPPPPP";

        String patron=".*\\d{4}[A-Z]{3}";
        System.out.println(matricula1.matches(patron));
        System.out.println(matricula2.matches(patron));
        System.out.println(matricula3.matches(patron));
        System.out.println(matricula4.matches(patron));


        String correo="yumalay123@gmail.com";
        String patronCorreo=".*@.*\\.com$";
        System.out.println(correo.matches(patronCorreo));
    }
}
