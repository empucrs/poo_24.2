public class FuncB extends Funcionario{

    public FuncB(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double salarioReal() {
        return getSalario()*1.1;
    }
    
}
