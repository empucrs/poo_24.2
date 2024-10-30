import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosSwing1 extends JFrame {
    private JTextField campoTexto;
    private JButton botaoOK, botaoLimpa;
    private JLabel mensagem;
    
    public EventosSwing1() {
        super("Eventos Swing 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        campoTexto = new JTextField(30);
        botaoOK = new JButton("OK");
        botaoLimpa = new JButton("Limpa");
        mensagem = new JLabel();
        TratadorEventos tradadorEventos = new TratadorEventos();
        botaoOK.addActionListener(tradadorEventos);
        botaoLimpa.addActionListener(tradadorEventos);
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(campoTexto);
        getContentPane().add(botaoOK);
        getContentPane().add(botaoLimpa);
        getContentPane().add(mensagem);
    }

    private class TratadorEventos implements ActionListener {
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
}