public abstract class FiguraBidimensional {
    private int centrox;
    private int centroy;

    public FiguraBidimensional(int centrox, int centroy) {
        this.centrox = centrox;
        this.centroy = centroy;
    }

    public int getX() {
        return centrox;
    }

    public int getY() {
        return centroy;
    }

    public abstract double area();
}
