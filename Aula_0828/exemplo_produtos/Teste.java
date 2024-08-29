import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("produto1", 1.99);
        System.out.println(p1);
        ProdutoPerecivel p2 = new ProdutoPerecivel("produto2", 2.5, LocalDate.of(2018,9,20));
        System.out.println(p2);

        System.out.println(p1 instanceof Produto);
        System.out.println(p1 instanceof ProdutoPerecivel);
        System.out.println(p2 instanceof  Produto);
        System.out.println(p2 instanceof  ProdutoPerecivel);


    }
}
