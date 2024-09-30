public abstract class Imovel {

    // atributo de instancia
    private String proprietario;
    protected int areaConstruida;
    private Geo localilizacao;

    // atributo de classe
    private static double VR; 

    // metodo de classe
    public static double getVR(){
        return VR;
    }

    public static void setVR(double value){
        if(value>=0)
            VR=value;
    }


    public Imovel(String proprietario, int area, Geo local){
        this.proprietario=proprietario;
        this.areaConstruida=area;
        localilizacao=new Geo(local.getLatitude(), local.getLongitude());
    }

    public String getProprietario(){
        return this.proprietario;
    }

    public abstract double calculaImposto();

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("{\n");
        sb.append("  Proprietatio: "+this.proprietario+",\n");
        sb.append("  AreaConstruida: "+this.areaConstruida+"\n");
        sb.append("  Localização:{\n");
        sb.append("    Latitude:"+localilizacao.getLatitude()+",\n");
        sb.append("    Longitude:"+localilizacao.getLongitude()+"\n");
        sb.append("  }\n");
        sb.append("}\n");
        return sb.toString();
    }
    
}