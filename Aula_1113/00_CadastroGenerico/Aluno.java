public class Aluno extends Pessoa{

    private int matricula;
    private String curso;

    public Aluno(String n, int i, int m, String c) {
        super(n, i);
        this.matricula=m;
        this.curso=c;
    }

}
