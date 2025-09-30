package repositorio;

import modelo.Incidencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Fichero {

    private String ruta;

    public Fichero(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Fichero: " +
                "ruta='" + ruta + '\'';
    }

    public void addDato(String Dato){

        //Añadir la linea al fichero

    }

    public String buscarDato(String Dato){

        String nombreFichero = "datos/incidencia.txt"; // ruta del fichero a leer

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // escribir por consola
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero: " + e.getMessage());
        }
        //Añadir la linea al fichero
        return "";
    }

    public String buscarDato(LocalDate fechaInicial, LocalDate fechaFinal){

        //Añadir la linea al fichero
        return "";
    }
    public String buscarDato(String Dato, int columna){
        String cadena="2025-09-18;17:01:53;excepción test3;usuario1";

        String[] datos=cadena.split(";");
        datos = cadena.split(";");


        System.out.println(Arrays.toString(datos));

        Incidencia fallo= new Incidencia(LocalDate.parse(datos[0]), LocalTime.parse(datos[1]),datos[2], datos[3]);

        return "";
    }

    public ArrayList<String> leerFichero(String dato){

        return null;
    }
}
