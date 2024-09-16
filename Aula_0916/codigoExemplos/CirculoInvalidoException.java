public class CirculoInvalidoException extends Exception{
    public CirculoInvalidoException() {
    }

    public CirculoInvalidoException(String message) {
        super(message);
    }

    public CirculoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CirculoInvalidoException(Throwable cause) {
        super(cause);
    }
}
