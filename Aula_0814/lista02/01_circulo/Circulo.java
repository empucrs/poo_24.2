public class Circulo {
    private int x, y, raio;

    public Circulo(int x, int y, int r){
        if(x<0) this.x=0;
        else this.x=x;

        this.y=(y<0)?0:y;

        this.raio=(r<0)?0:r;
    }
    // metodo muda posicao
    public void setX(int x){
        if(x>=0) this.x=x;
    }
    public void setY(int y){
        if(y>=0) this.y=y;
    }

    public void setPosition(int x, int y){
        if(x>=0) this.x=x;
        if(y>=0) this.y=y;
    }

    //metodo para a area
    public double area(){
        // formula da area do circulo
        //double areaDoCirculo = Math.PI * this.raio * this.raio;
        double areaDoCirculo = Math.PI * Math.pow(raio, 2);
        return areaDoCirculo;
    }

    // metodos circunferencia
    public double circunferencia(){
        double resultado = 2 * Math.PI * this.raio;
        return resultado;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo(1, 2, 3);
        System.out.println("Area do circulo: "+c.area());
        System.out.println("Circunferencia do circulo: "+c.circunferencia());
    }
}