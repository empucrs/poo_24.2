import java.io.PrintWriter;

public class ArquivoEscrita {
    public static void main(String[] args) {
        try (PrintWriter saida = new PrintWriter("exemplo2.txt")) {
            saida.println("Uma linha de texto.");
            saida.println("Mais outra linha de texto.");
            saida.println("Última linha de texto.");
        } catch (Exception e) {
            System.out.println("Falha de acesso ao arquivo!");
            e.printStackTrace();
        }
    }
}
