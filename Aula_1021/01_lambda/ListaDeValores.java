import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaDeValores {
    
    private List<Integer> lista;
    public ListaDeValores(int nElementos){
        if(nElementos<=0)
            lista = new ArrayList<>();
        else{
            lista = new ArrayList<>(nElementos);
            Random r = new Random();
            for(int i=0; i<nElementos; i++)
                lista.add(r.nextInt(100));
        }
    }

    public int contaImpares(IImpar i){
        int val=0;
        for(Integer v: lista)
            val+=i.ehImpar(v);
        return val;
    }

}
