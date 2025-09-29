package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Incidencia {

    private LocalDate fecha;
    private LocalTime hora;
    private String usuario;
    private String excepcion;

    public Incidencia( LocalDate fecha, LocalTime hora, String usuario, String excepcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.usuario = usuario;
        this.excepcion = excepcion;
    }

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }



    @Override
    public String toString() {
        return "Incidencia: " + fecha + '\'' + hora + '\'' + usuario + '\'' +
                ", excepcion='" + excepcion + '\'';
    }
}
