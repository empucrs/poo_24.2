public class Estudante {
    private String nome;
    private int anoGraduacao;
    private double nota;

    public Estudante(String nome, int anoGraduacao, double nota) {
        this.nome = nome;
        this.anoGraduacao = anoGraduacao;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoGraduacao() {
        return anoGraduacao;
    }

    public double getNota() {
        return nota;
    }

}
