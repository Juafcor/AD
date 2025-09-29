package controlador;
import modelo.Incidencia;
import modelo.Pokemon;
import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Escaner;
import vista.Consola;

 public class ControladorIncidencias {
    private static boolean salir=false;
    private static String usuario;
    private static String numero;
    private static int eleccion;


    public static void iniciar() {
        Consola.mostrarTitulo("Gestor de Excepciones");
        Escaner.pedirString("Introduce el nombre de usuario:");
        Consola.mostrarExito("Usuario recibido: " + usuario);
        do {
            Escaner.pedirString("1. Pedir número. | 2. Buscar por usuario. | 3. Buscar por fecha");
            switch (eleccion) {
                case 1:
                    Escaner.pedirString("1. Pedir número");
                    break;
                case 2:
                    Escaner.pedirString("2. Buscar por usuario");
                    break;
                case 3:
                    Escaner.pedirString("3. Buscar por fecha");
                    break;
                default:
                    Escaner.pedirString("Por favor, introduce una opción válida");

            }
//        String tipo = Escaner.pedirString("Tipo pokemon:");
//        Consola.mostrarExito("Tipo recibido: " + tipo);
//        String nombre = Escaner.pedirString("nombre pokemon: ");
//
//        ServicioFichero.guardar(tipo,nombre);
//        ServicioFichero.guardar(new Pokemon(tipo,nombre));
        }while(salir=false);
    }
}
