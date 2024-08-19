import java.util.Random;

public class Lampada {
    private boolean ligada; //true=ligada; false=desligada;
    private boolean queimada; //true=está queimada; false=está funcionando ;

    public Lampada() {
        ligada=false;
        queimada=false;        
    }

    public void ligar(){
        if((! queimada)&&(! ligada)){
            Random r = new Random();
            if(r.nextInt(100)<30)// chance de 30%
                queimada=true;
            else
                ligada=true;
            
        }
    }

    public void desligar(){
        if((! queimada)&&(ligada)){
            ligada=false;            
        }
    }

    public String estado(){

        if(queimada)
            return "queimada";
        else if(ligada)
            return "ligada";
        else
            return "desligada";

    }

}