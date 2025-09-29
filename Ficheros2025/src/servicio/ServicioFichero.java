package servicio;

import modelo.Incidencia;
import modelo.Pokemon;
import repositorio.Fichero;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ServicioFichero {

    public static void guardar(LocalDate fecha, LocalTime hora, String usuario, String excepcion){

        Incidencia incidencia1 = new Incidencia(fecha, hora, usuario, excepcion);
        Fichero log= new Fichero("datos/incidencia.txt");
        log.addDato(log.toString());

    }
    public static void guardar(Incidencia miIncidencia){

        Fichero log = new Fichero("datos/incidencia.txt");
        log.addDato(log.toString());

    }


}
