public class App{
    public static void main(String args[]){

        if(args.length!=3){
            System.out.println("Erro na passagem dos parâmetros");
            System.out.println("Informe os parametros na seguinte ordem:");
            System.out.println("  Código da placa");
            System.out.println("  Quantidade de combustivel");
            System.out.println("  Distância a ser percorrida");
            System.exit(0);
        }

        String codigoDaPlaca = args[0].toUpperCase();
        double combustivel = Double.parseDouble(args[1]);        
        double distancia = Double.parseDouble(args[2]);        

        Placa p1 = new Placa("Brasil",codigoDaPlaca);
        
        Veiculo v = new Veiculo(p1);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.abastece(combustivel);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.dirige(distancia);
        System.out.println("Dados do veiculo depois de percorrer "+distancia+"Km:");
        System.out.println(v);
        System.out.println("----------------");
        }
}