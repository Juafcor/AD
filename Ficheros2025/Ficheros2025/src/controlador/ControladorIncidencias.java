package controlador;
import modelo.Incidencia;
import modelo.Pokemon;
import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Escaner;
import vista.Consola;

public class ControladorIncidencias {
    private static boolean salir = false;
    private static String usuario;
    private static String numero;
    private static String eleccion;

    public static void iniciar() {
        Consola.mostrarTitulo("Gestor de Excepciones");

        usuario = Escaner.pedirString("Introduce el nombre de usuario:");
        Consola.mostrarExito("Usuario recibido: " + usuario);

        do {
            eleccion = Escaner.pedirString(
                    "Menú principal:\n" +
                            "1. Pedir número\n" +
                            "2. Buscar por usuario\n" +
                            "3. Buscar por fecha\n" +
                            "0. Salir\n" +
                            "Elige una opción: "
            );

            switch (eleccion) {
                case "1":
                    numero = Escaner.pedirString("Introduce un número (1-5):");
                    Integer n = traducirStringInt(numero);

                    if (n != null && n >= 1 && n <= 5) {
                            Consola.mostrarExito("Número válido: " + n);
                        } else {
                            Consola.mostrarError("Número fuera de rango (1-5): " + n);
                        }

                    break;

                case "2":
                    String busquedaUsuario = Escaner.pedirString("Introduce el usuario a buscar:");
                    Consola.mostrarString("Buscando incidencias del usuario: " + busquedaUsuario);
                    break;
                case "3":
                    String fecha = Escaner.pedirString("Introduce la fecha (dd/mm/yyyy):");
                    Consola.mostrarString("Buscando incidencias en la fecha: " + fecha);
                    break;
                case "0":
                    Consola.mostrarString("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    Consola.mostrarError("Por favor, introduce una opción válida.");
                    break;
            }

        } while (!salir);
    }

    private static Integer traducirStringInt(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            Consola.mostrarError("Valor inválido, no es un número: " + valor);
            return null;
        }
    }


    private static void ValidarRangoNum(){

    }



}
