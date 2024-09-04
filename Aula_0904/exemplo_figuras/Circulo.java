public class Circulo extends FiguraBidimensional{
    private int raio;

    public Circulo(int centrox, int centroy, int raio) {
        super(centrox, centroy);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
