public class App {

    public static void main(String[] args) {
        Lampada l = new Lampada();
        int count=0;
        do{
            if(l.estado()=="ligada")
                l.desligar();
            else
                l.ligar();
            count++;
            System.out.println(count+" - A lampada está "+l.estado());

        }while(l.estado()!="queimada");
    }
    
}
