public class ResidencialLocavel extends Residencial implements Locavel{

    public ResidencialLocavel(String dono, int area, Geo local, int terreno) {
        super(dono, area, local, terreno);
    }

    @Override
    public double valorDoAluguel() {
        return 2*areaConstruida+getAreaTerreno();
    }

    
}