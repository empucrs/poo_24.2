import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class CadastroProdutos{
    //private static final int MAXPROD = 1000;
    private ArrayList<Produto> produtos;
    private int contProd;
    private static final String fName = "produtos.txt";

    public CadastroProdutos(){
        produtos = new ArrayList<>();
        contProd = 0;
    }

    public void carregaProdutos(){
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+fName;
        Path path = Paths.get(nameComplete);
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
           while (sc.hasNext()){
               String linha = sc.nextLine();
               //System.out.println(linha);
               String dados[] = linha.split(";");
               /*
               for(int i=0;i<dados.length;i++){
                   System.out.println(dados[i]);
               }
               System.out.println("---");
               */
               int codigo = Integer.parseInt(dados[0]);
               String descricao = dados[1];
               double preco = Double.parseDouble(dados[2]);
               Produto p = new Produto(codigo,descricao,preco);
               produtos.add(p);
               contProd++;
           }
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }

    public void gravaProdutos(){
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+fName;
        Path path = Paths.get(nameComplete);
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
          for(int i=0;i<produtos.size();i++){
                String linha = produtos.get(i).getCodigo()+";"+
                               produtos.get(i).getDescricao()+";"+
                               produtos.get(i).getPrecoUnitario();
                System.out.println(">"+linha);
                writer.println(linha);
            }
        }catch (IOException x){
          System.err.format("Erro de E/S: %s%n", x);
      }
    }

    public void inflacionaProdutos(){
        /*
        for(int i=0;i<produtos.size();i++){
            double novoValor = produtos.get(i).getPrecoUnitario() * 1.1;
            produtos.get(i).setPrecoUnitario(novoValor);
        }
        */

        for(Produto p:produtos){
            double novoValor = p.getPrecoUnitario() * 1.1;
            p.setPrecoUnitario(novoValor);
        }
    }

    public String toString(){
        String str = "";
        for(int i=0;i<contProd;i++){
            str = str + produtos.get(i)+"\n";
        }
        return str;
    }
}
