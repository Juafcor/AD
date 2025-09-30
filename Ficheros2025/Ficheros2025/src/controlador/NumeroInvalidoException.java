package controlador;

public class NumeroInvalidoException extends RuntimeException {
    public NumeroInvalidoException(String message) {
        super("Inserte un valor numérico. " + message);
    }
}
