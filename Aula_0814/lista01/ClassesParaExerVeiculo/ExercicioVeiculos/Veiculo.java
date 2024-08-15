public class Veiculo{
    private final double consumoPorLitro = 10;
    private Placa placa;
    private double combustivel;
    
    public Veiculo(Placa placa){
        this.placa = placa;
        combustivel = 0;
    }

    public void setPais(String pais){
        placa.setPais(pais);
    }

    public Placa getPlaca(){
        return placa;
    }

    public double getCombustivelNoTanque(){
        return combustivel;
    }

    public double abastece(double litros){
        if (litros > 0.0){
            combustivel += litros;
        }
        return combustivel;
    }

    // Simula o deslocamento do carro por uma determinada distancia em Km:
    //  - Diminui a quantidade de combustivel gasto do tanque
    //  - Retorna a distancia efetivamente percorrida (com o combustivel disponivel)
    public double dirige(double distancia){
        // Para distancias impossíveis retorna 0
        if (distancia <= 0){
            return 0.0;
        }
        // Calcula o consumo para a distancia
        double consumo = distancia / consumoPorLitro;
        // Diminui o combustivel gasto e retorna a distancia percorrida
        if (combustivel >= consumo){
            combustivel -= consumo;
            return distancia;
        }else{
            double distPossivel = combustivel * consumoPorLitro;
            combustivel = 0.0;
            return distPossivel;
        }
    }

    public String toString(){
        return "Placa: "+getPlaca()+", combustivel no tanque: "+getCombustivelNoTanque();
    }
}