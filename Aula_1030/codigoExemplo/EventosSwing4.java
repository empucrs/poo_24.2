import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosSwing4 extends JFrame {
    private JTextField campoTexto;
    private JButton botaoOK, botaoLimpa;
    private JLabel mensagem;
    
    public EventosSwing4() {
        super("Eventos Swing 4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        campoTexto = new JTextField(30);
        botaoOK = new JButton("OK");
        botaoLimpa = new JButton("Limpa");
        mensagem = new JLabel();
        botaoOK.addActionListener(e -> {
            String texto = campoTexto.getText();
                mensagem.setForeground(Color.BLUE);
                mensagem.setText("Texto digitado: " + texto);
        });
        botaoLimpa.addActionListener(e -> {
            campoTexto.setText("");
        });
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(campoTexto);
        getContentPane().add(botaoOK);
        getContentPane().add(botaoLimpa);
        getContentPane().add(mensagem);
    }
}