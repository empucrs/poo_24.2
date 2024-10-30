import java.awt.*;
import javax.swing.*;

public class Exercicio01 extends JFrame{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Exercicio01::criarGui);
    }
    public static void criarGui() {
        Exercicio01 janela = new Exercicio01();
        janela.setSize(700, 100);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private JTextField campoTexto;
    private JButton botaoOK, botaoLimpa;
    private JLabel mensagem;
    
    public Exercicio01() {
        super("Modificação do exemplo de aula");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        campoTexto = new JTextField(30);
        botaoOK = new JButton("OK");
        botaoLimpa = new JButton("Limpa");
        mensagem = new JLabel();

        botaoOK.addActionListener(e -> {
            String texto = campoTexto.getText();
            mensagem.setForeground(Color.BLUE);
            mensagem.setText(mensagem.getText()+"Texto digitado: " + texto+"\n");
        });

        botaoLimpa.addActionListener(e -> {
            campoTexto.setText("");
            mensagem.setText("");
        });

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(campoTexto);
        getContentPane().add(botaoOK);
        getContentPane().add(botaoLimpa);
        getContentPane().add(mensagem);
    }

    
    
}
