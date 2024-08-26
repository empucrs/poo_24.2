public class App{
    public static void main(String[] args){
        CadastroProdutos cp = new CadastroProdutos();
        System.out.println("Lendo arquivo");
        cp.carregaProdutos();
        System.out.println("\nProdutos carregados:");
        System.out.println(cp);
        System.out.println("\nInflacionando ...");
        cp.inflacionaProdutos();
        System.out.println("\nGravando produtos inflacionados ...");
        cp.gravaProdutos();
        System.out.println("Fim");
    }
}