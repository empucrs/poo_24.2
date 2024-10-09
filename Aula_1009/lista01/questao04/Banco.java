import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Banco {

    private Map<String, List<Integer>> filaDeClientes;
    private Integer senha;

    public Banco() {
        senha=1;
        filaDeClientes = new HashMap<>();
    }

    public Integer entradaDeCliente(String categoria){

        // vou estar esperando a categoria "gestante", "idoso", "normal"

        Integer aSenha = senha++;
        List<Integer> senhas = filaDeClientes.get(categoria);
        if(senhas==null)
            senhas=new LinkedList<>();
        senhas.add(aSenha);
        filaDeClientes.put(categoria, senhas);

        return aSenha;

    }

    public Integer proximaSenha(){
        Integer aSenha=null;

        if(filaDeClientes.get("gestante").size()>0){
            System.out.print("Gestante atendida");
            aSenha=filaDeClientes.get("gestante").remove(0);
        }
        else if(filaDeClientes.get("idoso").size()>0){
            System.out.print("Idoso atendida");
            aSenha=filaDeClientes.get("idoso").remove(0);
        }
        else if(filaDeClientes.get("normal").size()>0){
            System.out.print("Normal atendida");
            aSenha=filaDeClientes.get("normal").remove(0);
        }

        if(aSenha!=null){
            System.out.println("Senha "+aSenha);
        }

        return aSenha;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(filaDeClientes.size()==0)
            sb.append("A fila está vazia");
        else{
            for(String s : filaDeClientes.keySet()){
                sb.append("Categoria "+s+"\n");
                sb.append("  => "+filaDeClientes.get(s).toString()+"\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Banco b = new Banco();

        for (int i=0; i<10; i++){
            Random r = new Random();
            switch(r.nextInt(3)){
                case 0: 
                    b.entradaDeCliente("gestante");
                    break;
                case 1: 
                    b.entradaDeCliente("idoso");
                    break;
                default: 
                    b.entradaDeCliente("normal");

            }
            System.out.println(b);
        }

        for (int i=0; i<10; i++){
            System.out.println(b.proximaSenha());
        }


        
    }


    
}