public class PessoaV1 {
    private String nome;
    private int idade;

    public PessoaV1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "[nome="+nome+" ,idade="+idade+"]";
    }
}
