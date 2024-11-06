public class FuncA extends Funcionario{

    public FuncA(String nome, double Salario){
        super(nome, Salario);
    }

    public double salarioReal(){
        return getSalario();
    }
    
}
