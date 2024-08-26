import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArquivoLeitura {
    public static void main(String[] args) {
        //Ler um arquivo "exemplo.txt"
        try (BufferedReader leitor = Files.newBufferedReader(Paths.get("exemplo.txt"))) {
            String linha = leitor.readLine();
            while(linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
        } catch (Exception e) {
            System.out.println("Problema de acesso ao arquivo!");
            e.printStackTrace();
        }
    }
}