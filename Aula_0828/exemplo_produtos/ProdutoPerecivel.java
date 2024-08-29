import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
        //this.nome=nome;
        //this.preco=preco;
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + "[validade=" + dataValidade;
    }
}
