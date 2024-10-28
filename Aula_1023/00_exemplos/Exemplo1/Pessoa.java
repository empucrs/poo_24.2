public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String n, int i) {
        nome = n;
        idade = i;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "[nome = " + nome + ", idade = " + idade + "]";
    }
}