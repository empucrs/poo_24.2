import javax.swing.*;
import java.awt.FlowLayout;

public class AloMundoV2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AloMundoV2::criarMostrar);
    }

    private static void criarMostrar() {
        JFrame janela = new JFrame("AloMundo Swing");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JLabel label = new JLabel("Alô, Mundo!");

        JButton botao = new JButton("Oi");

        janela.getContentPane()
              .setLayout(new FlowLayout());
        janela.getContentPane()
              .add(label);
        janela.getContentPane()
              .add(botao);

        janela.pack();
        janela.setVisible(true);
    }
}