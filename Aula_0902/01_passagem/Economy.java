public class Economy extends Passagem{

    public Economy(String _cpf, String _nome, double _custoPassagem) {
        super(_cpf, _nome, _custoPassagem);
    }

    public double custoBagagem(int qtdeBagagens, int[] pesoBagagens) {
        double papito=super.custoBagagem(qtdeBagagens, pesoBagagens);
        if(papito<0){
            System.out.println("Há erro nos parametros informados");
            return papito;
        }
        double custo = papito+qtdeBagagens*10;
        setCustoDaBagagem(custo);
        return custo;
    }
    
}
