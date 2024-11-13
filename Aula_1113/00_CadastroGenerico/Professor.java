public class Professor extends Pessoa{
    private String departamento, titulacao;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Professor(String n, int i, String d, String t) {
        super(n, i);
        this.departamento=d;
        this.titulacao=t;
    }
    
}
