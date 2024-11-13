public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String n, int i, String c, double s) {
        super(n, i);
        this.cargo=c;
        this.salario=s;
    }
}
