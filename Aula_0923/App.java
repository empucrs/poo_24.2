public class App {

    public static void main(String[] args) {
        Imovel [] ims = new Imovel[10];

        ims[0] = new Residencial("Edson Moreno", 190, new Geo(101, 102), 500);
        ims[1] = new Residencial("Silvia Casonato", 590, new Geo(201, 203), 800);
        ims[2] = new ResidencialLocavel("Francisco Moreno", 150, new Geo(1020, 1000), 1200);
        ims[3] = new Residencial("Antonio Moreno", 800, new Geo(130, 108), 2000);
        ims[4] = new ResidencialLocavel("Bruno Gomes", 800, new Geo(130, 108), 2000);
        ims[5] = new Residencial("Thiago Maia", 800, new Geo(130, 108), 2000);
        ims[6] = new ResidencialLocavel("Dalessandro", 800, new Geo(130, 108), 2000);

        Imovel.setVR(1);
        for (Imovel im : ims) {
            if(im!=null){
                System.out.println(im);
                System.out.println("\n-=-=-=-=-=-=-=-=-=-\n");
            }
        }

        System.out.println("\n\n\nxXxXxXxXxXxXxXxXxXxXxXxXxX");
        Imovel.setVR(1000);

        for (Imovel im : ims) {
            if(im!=null){
                System.out.println(im);
                System.out.println("\n-=-=-=-=-=-=-=-=-=-\n");
            }
        }

        System.out.println("\n\n\nxXxXxXxXxXxXxXxXxXxXxXxXxX");
        System.out.println("Lista locaveis");

        for (Imovel im : ims) {
            if((im!=null)&&(im instanceof Locavel)){
                System.out.println(im);
                System.out.println("Valor do aluguel: "+((Locavel) im).valorDoAluguel() );
                System.out.println("\n-=-=-=-=-=-=-=-=-=-\n");
            }
        }


    }
    
}
