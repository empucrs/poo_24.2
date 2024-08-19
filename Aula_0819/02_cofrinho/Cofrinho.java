public class Cofrinho {

    /*
    Insere uma moeda no cofrinho. Como um “cofrinho” tem 
        capacidade limitada, deve retornar true se conseguiu 
        inserir a moeda e false caso contrário.
    */
    public boolean insere(Moeda moeda){
        return false;
    }

    /*
    Retira do cofrinho a última moeda inserida (se esta operação
        for chamada várias vezes deve ir retirando todas as 
        moedas na ordem inversa em que foram inseridas). Deve
        retornar a moeda retirada ou “null” caso o cofrinho 
        esteja vazio
    */
    public Moeda retira(){
        return null;
    }

    /*
    Informa quantas moedas estão guardadas no cofrinho
    */
    public int getQtdadeMoedas(){
        return 0;
    }

    /*
    Informa quantas moedas de um certo tipo estão guardadas 
        no cofrinho
    */
    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda){
        return 0;
    }

    /*
    Informa o valor total armazenado no cofrinho (em centavos)
    */
    public int getValorTotalCentavos(){
        return 0;
    }

    /*
    Informa o valor total armazenado no cofrinho (em reais)
   */    
    public double getValorTotalReais(){
        return 0.0;
    }

}