import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {
        // crio a janela
        JFrame frame = new JFrame("Hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // defino o layout da janela
        Container cpane = frame.getContentPane();
        cpane.setLayout(new FlowLayout());

        // adiciono componentes/containers à janela
        JLabel lbl = new JLabel("Uma saudação");
        cpane.add(lbl);
        JButton btn = new JButton("OK");
        cpane.add(btn);

        // mostra a janela
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    
}