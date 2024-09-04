public class Retangulo extends FiguraBidimensional{
    private int base;
    private int altura;

    public Retangulo(int centrox, int centroy, int base, int altura) {
        super(centrox, centroy);
        this.base=base;
        this.altura=altura;        
    }

    public int getBase(){
        return base;        
    }

    public int getAltura(){
        return altura;
    }

    @Override
    public double area() {
        return base*altura;
    }
    
}
