import javax.swing.*;

public class AloMundo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AloMundo::criarMostrar);
    }

    private static void criarMostrar() {
        JFrame janela = new JFrame("AloMundo Swing");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ao não definir um layout, os componentes/containers são sobrepostos
        
        JLabel label = new JLabel("Alô, Mundo!");

        janela.getContentPane().add(new JButton("OK"));
        janela.getContentPane().add(label);

        janela.pack();
        janela.setVisible(true);
    }
}