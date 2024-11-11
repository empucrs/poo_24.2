public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String n, int i) {
        nome=n;
        idade=i;
    }

    public String toString(){
        return "{nome: "+nome+", idade:"+idade+"}\n";
    }
    
}
