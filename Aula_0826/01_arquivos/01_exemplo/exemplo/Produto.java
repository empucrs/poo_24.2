public class Produto{
    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo,String umaDescr,double umPreco){
        this.codigo = codigo;
        descricao = umaDescr;
        preco = umPreco;
    }

    public int getCodigo(){
        return(codigo);
    }

    public String getDescricao(){
        return(descricao);
    }

    public double getPrecoUnitario(){
        return(preco);
    }

    public void setPrecoUnitario(double novoValor){
        if (novoValor < 0){
            return;
        }else{
            preco = novoValor;
        }
    }

    public String toString(){
        return(getCodigo()+": "+getDescricao()+", R$ "+getPrecoUnitario());
    }
}
