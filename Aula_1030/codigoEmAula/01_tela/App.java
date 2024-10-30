import javax.swing.*;
import java.awt.*;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::run);
    }

    public static void run() {
        App app = new App();        
    }

    public App(){
        JFrame janela = new JFrame("Exercícios - Swing");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());

        // CONTAINER DA ESQUERDA
        JPanel jpLeft = new JPanel();
        jpLeft.setLayout(new BoxLayout(jpLeft, BoxLayout.Y_AXIS));

        JLabel jl1 = new JLabel("Detalhes Funcionario");
        jpLeft.add(jl1);

        JPanel jp01 = new JPanel(new FlowLayout());
        jp01.add(new JLabel("ID"));
        jp01.add(new TextField(20));
        jpLeft.add(jp01);

        JPanel jp02 = new JPanel(new FlowLayout());
        jp02.add(new JLabel("Nome"));
        jp02.add(new TextField(20));
        jpLeft.add(jp02);

        JPanel jp03 = new JPanel(new FlowLayout());
        jp03.add(new JLabel("Status"));
        JRadioButton jrAtivo = new JRadioButton("Ativo");
        JRadioButton jrInativo = new JRadioButton("Inativo");
        ButtonGroup bgStatus = new ButtonGroup();
        bgStatus.add(jrInativo);
        bgStatus.add(jrAtivo);
        jp03.add(jrInativo);
        jp03.add(jrAtivo);
        jpLeft.add(jp03);


        janela.setContentPane(jpLeft);

        janela.pack();
        janela.setVisible(true);

    }

}