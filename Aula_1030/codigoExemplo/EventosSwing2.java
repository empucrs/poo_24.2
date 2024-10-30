import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class EventosSwing2 extends JFrame implements ActionListener {
    private JTextField campoTexto;
    private JButton botaoOK, botaoLimpa;
    private JLabel mensagem;
    
    public EventosSwing2() {
        super("Eventos Swing 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        campoTexto = new JTextField(30);
        botaoOK = new JButton("OK");
        botaoLimpa = new JButton("Limpa");
        mensagem = new JLabel();
        botaoOK.addActionListener(this);
        botaoLimpa.addActionListener(this);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(campoTexto);
        getContentPane().add(botaoOK);
        getContentPane().add(botaoLimpa);
        getContentPane().add(mensagem);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoOK) {
            String texto = campoTexto.getText();
            mensagem.setForeground(Color.BLUE);
            mensagem.setText("Texto digitado: " + texto);
        } else if (e.getSource() == botaoLimpa) {
            campoTexto.setText("");
        }
    }
    
}
