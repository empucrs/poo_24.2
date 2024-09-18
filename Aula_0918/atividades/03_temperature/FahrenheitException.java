public class FahrenheitException extends TemperatureException{

    public FahrenheitException() {
        super();
    }

    public FahrenheitException(String msg) {
        super(msg);
    }

    public FahrenheitException(Throwable th) {
        super(th);
    }

    public FahrenheitException(String msg, Throwable th) {
        super(msg, th);
    }

    
}
