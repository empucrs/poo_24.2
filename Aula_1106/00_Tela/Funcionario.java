/**
 * Funcionario
 */
public abstract class Funcionario{

    private String Nome;
    private double Salario;
    private int matricula;
    private static int sequencia=0;

    public Funcionario(String nome, double salario){
        this.Nome=nome;
        this.Salario=salario;
        this.matricula=++sequencia;
    }

    public String getNome(){
        return this.Nome;
    }

    public double getSalario(){
        return this.Salario;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public abstract double salarioReal();

    public String toString(){
        return "{mat: "+this.matricula+"; nome: "+this.Nome+"; salario: R$"+salarioReal()+"}\n";
    }

    
}