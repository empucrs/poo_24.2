import java.security.SecureRandom;

public class Lampada{
    public enum Estado {LIGADA, DESLIGADA, QUEIMADA}

    private Estado estado;
    private SecureRandom gerador;

    public Lampada() {
        estado = Estado.DESLIGADA;
        gerador = new SecureRandom();
    }

    public void ligar() {
        if (estado == Estado.DESLIGADA) {
            //Lampada tem 30% de chance de queimar ao ser ligada
            if (gerador.nextInt(100) < 30) {
                estado = Estado.QUEIMADA;
            }
            else {
                estado = Estado.LIGADA;
            }
        }
    }

    public void desligar() {
        if (estado == Estado.LIGADA) {
            estado = Estado.DESLIGADA;
        }
    }

    public boolean isLigada() {
        return estado == Estado.LIGADA;
    }

    public boolean isQueimada() {
        return estado == Estado.QUEIMADA;
    }
}
