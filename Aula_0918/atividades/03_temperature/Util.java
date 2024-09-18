public class Util {

    public static double toCelsius(double value) throws FahrenheitException{
        if(value < -459.67)
            throw new FahrenheitException("2C => Temperatura de zero absoluta alcançado: "+ value);
        double c = 5* (value-32) / 9;        
        return c;
    }
    
    public static double toFahrenheit(double value) throws FahrenheitException{
        double f = (9*value/5) + 32;
        if(f < -459.67)
            throw new FahrenheitException("2F => Temperatura de zero absoluta alcançado: "+ value);
        return f;
    }
    
}
