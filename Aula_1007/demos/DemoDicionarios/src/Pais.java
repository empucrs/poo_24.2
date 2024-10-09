public class Pais {
    private int codigo;
    private String nome;
    private int area;
    //...

    public Pais(int umCodigo, String umNome, int umaArea) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.area = umaArea;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", area=" + area +
                '}';
    }
}
