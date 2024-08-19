public class Moeda {
    private NomeMoeda nome;

    public Moeda(NomeMoeda nome) {
        this.nome = nome;
    }

    public NomeMoeda getNomeMoeda() {
        return nome;
    }

    public int getValorCentavos() {
        switch (nome) {
            case UmReal:
                return 100;
            case Cinquenta:
                return 50;
            case VinteCinco:
                return 25;
            case Dez:
                return 10;
            case Cinco:
                return 5;
            case Um:
                return 1;
            default:
                return 0;
        }
    }

    public double getValorReais() {
        switch (nome) {
            case UmReal:
                return 1.0;
            case Cinquenta:
                return 0.5;
            case VinteCinco:
                return 0.25;
            case Dez:
                return 0.1;
            case Cinco:
                return 0.05;
            case Um:
                return 0.01;
            default:
                return 0.0;
        }
    }

    public String toString() {
        return nome.toString();
    }
}