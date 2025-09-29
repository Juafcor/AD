package vista;

import java.util.Scanner;

public class Escaner {
    private static Scanner sc = new Scanner(System.in);

    public static String pedirString(String mensaje) {
        Consola.mostrarString(mensaje);
        return sc.nextLine();
    }
    public String pedirInt(int mensaje) {
        Consola.mostrarInt(mensaje);
        return sc.nextLine();
    }
}
