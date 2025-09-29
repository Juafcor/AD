package vista;

public class Consola {

    private static final String SEPARADOR = "=====================================";

    /**
     * Muestra un mensaje simple en consola
     * @param mensaje el texto a mostrar
     */
    public static void mostrarString(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarInt(int mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Muestra un título con separadores
     * @param titulo el texto a resaltar
     */
    public static void mostrarTitulo(String titulo) {
        System.out.println("\n" + SEPARADOR);
        System.out.println(" " + titulo.toUpperCase());
        System.out.println(SEPARADOR);
    }

    /**
     * Muestra un mensaje de error
     * @param error el mensaje de error
     */
    public static void mostrarError(String error) {
        System.out.println("[ERROR] " + error);
    }

    /**
     * Muestra un mensaje de confirmación/éxito
     * @param mensaje el texto de éxito
     */
    public static void mostrarExito(String mensaje) {
        System.out.println("[OK] " + mensaje);
    }

    /**
     * Muestra un separador en la consola
     */
    public static void mostrarSeparador() {
        System.out.println(SEPARADOR);
    }


}
