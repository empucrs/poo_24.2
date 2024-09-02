public class Passagem {
    private String cpf;
    private String nome;
    private String assento;
    private double custoPassagem;
    private double custoDaBagagem;

    public Passagem(String _cpf, String _nome, double _custoPassagem) {
        this.cpf=_cpf;
        this.nome=_nome;
        this.custoPassagem=_custoPassagem;
    }

    public double custoBagagem(int qtdeBagagens, int [] pesoBagagens){
        // tratando inconsistencia
        // se qtdeBagagens for <1 ou qtdeBagagens != tamanho PesoBagagens
        if((qtdeBagagens<1)||(pesoBagagens==null)||(qtdeBagagens!=pesoBagagens.length))
            return -1;
        // se algum peso for menor ou igual a zero
        for(int peso: pesoBagagens)
            if(peso<=0) return -1;

        // a partir daqui está tudo ok-=-=-=-
        int pesoTotal=0;
        for(int peso: pesoBagagens)
            pesoTotal+=peso;

        custoDaBagagem=pesoTotal*0.5;

        return custoDaBagagem;
    }

    public double defineAssento(String _assento){
        this.assento=_assento;
        if(this.assento!=null) return 5;
        else return 0;
    }

    public String toString() {
        StringBuilder st = new StringBuilder();
        st.append("Detalhes sobre a passagem\n");
        st.append("  Nome: "+this.nome+"\n");
        st.append("  CPF: "+this.cpf+"\n");
        st.append("  Custo da Passagem: "+this.custoPassagem+"\n");
        st.append("  Assento: "+((this.assento==null)?"Não definido":this.assento)+"\n");
        st.append("  Custo da bagagem: "+custoDaBagagem+"\n");

        return st.toString();
    }

    protected void setCustoDaBagagem(double _custoDaBagagem){
        if(_custoDaBagagem>=0)
            this.custoDaBagagem=_custoDaBagagem;
    }

    public double getCustoPassagem(){
        return this.custoPassagem;
    }

}