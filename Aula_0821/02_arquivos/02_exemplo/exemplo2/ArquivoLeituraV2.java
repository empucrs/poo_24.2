import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArquivoLeituraV2 {
    public static void main(String[] args) {
        //Ler um arquivo "exemplo.txt"
        try {
            List<String> linhas = Files.readAllLines(Paths.get("exemplo.txt"));
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            System.out.println("Problema de acesso ao arquivo!");
            e.printStackTrace();
        }
    }
}