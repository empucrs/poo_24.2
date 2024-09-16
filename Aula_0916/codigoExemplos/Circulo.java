public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;

    public Circulo(int centrox, int centroy, int raio) {
        if (centrox < 0) {
            throw new IllegalArgumentException("Valor de centrox negativo");
        }
        if (centroy < 0) {
            throw new IllegalArgumentException("Valor de centroy negativo");
        }
        if (raio <= 0) {
            throw new IllegalArgumentException("Valor de raio não positivo");
        }
        this.centrox = centrox;
        this.centroy = centroy;
        this.raio = raio;
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public int getRaio() {
        return raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public void copia(Circulo umCirculo) throws CirculoInvalidoException {
        //if (umCirculo == null) {
        //    throw new CirculoInvalidoException("Circulo não pode ser nulo");
        //}
        this.centrox = umCirculo.centrox;
        this.centroy = umCirculo.centroy;
        this.raio = umCirculo.raio;
    }
}
