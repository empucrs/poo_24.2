public class PessoaV2 implements Comparable<PessoaV2>{
    private String nome;
    private int idade;

    public PessoaV2(String nome, int idade) {
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

    @Override
    public int compareTo(PessoaV2 o) {
        //Comparacao por idade
        if (idade < o.idade) return -1;
        if (idade > o.idade) return 1;
        return 0;
    }
}
