public class Executive extends Passagem{

    public Executive(String _cpf, String _nome, double _custoPassagem) {
        super(_cpf, _nome, _custoPassagem);
    }

    public double custoBagagem(int qtdeBagagens, int[] pesoBagagens) {
        double custo=super.custoBagagem(qtdeBagagens, pesoBagagens);
        if(custo<0){
            System.out.println("Há erro nos parametros informados");
            return custo;
        }
        if(qtdeBagagens<=2)
            custo=0;
        else{
            int desconto=0;
            for(int i=0; i<2; i++)
                desconto+=pesoBagagens[i]*0.5;
            custo-=desconto;
        }
        
        setCustoDaBagagem(custo);
        return custo;        

    }

    public int getMilhas(){
        return (int)(getCustoPassagem()*0.1);
    }

    @Override
    public String toString() {
        String texto = super.toString();
        texto += "  Milhas: "+getMilhas()+"\n";
        return texto;
    }
    
}