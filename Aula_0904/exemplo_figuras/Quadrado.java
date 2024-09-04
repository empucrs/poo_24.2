public class Quadrado extends Retangulo{

    public Quadrado(int centrox, int centroy, int lado) {
        super(centrox, centrox, lado, lado);
    }

    public int getLado(){
        return getBase();
    }
    
}
