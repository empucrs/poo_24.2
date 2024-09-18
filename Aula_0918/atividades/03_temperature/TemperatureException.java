/**
 * TemperatureException
 */
public class TemperatureException extends Exception{
    public TemperatureException() {
        super();
    }
    
    public TemperatureException(Throwable th) {
        super(th);
    }
    
    public TemperatureException(String msg) {
        super(msg);
    }

    public TemperatureException(String msg, Throwable th) {
        super(msg, th);
    }
    

    
}