public class Residencial extends Imovel{

    private int areaTerreno;

    public Residencial(String dono, int area, Geo local, int terreno) {
        super(dono, area, local);
        this.areaTerreno=terreno;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if(this.areaConstruida<=200)
            imposto=0;
        else
            imposto=(areaConstruida-200)*getVR();
        
        if(areaTerreno>1000)
            imposto+=100*getVR();
    
        return imposto;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("{\n");
        sb.append("  AreaDoTerreno: "+this.areaTerreno+",\n");
        sb.append("  Imposto: "+this.calculaImposto()+"\n");
        sb.append("}\n");
        return sb.toString();
    }

    public double getAreaTerreno(){
        return areaTerreno;
    }
    
}
