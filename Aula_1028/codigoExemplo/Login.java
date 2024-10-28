import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    public static void main(String[] args){
     JFrame frame = new JFrame("User login");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     JPanel linha1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
     JLabel lbUser = new JLabel("Usuario: ");
     JTextField tfUser = new JTextField(20);
     linha1.add(lbUser);
     linha1.add(tfUser);

     JPanel linha2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
     JLabel lbPass = new JLabel("Senha:   ");
     JPasswordField pfPass = new JPasswordField(20);
     linha2.add(lbPass);
     linha2.add(pfPass);

     JPanel linha3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
     JButton btClean = new JButton("Limpar");
     JLabel lbEmpty = new JLabel("  ");
     JButton btLogin = new JButton("Login");
     linha3.add(btLogin);
     linha3.add(lbEmpty);
     linha3.add(btClean);
     
     Container contentPane = frame.getContentPane();
     contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
     contentPane.add(linha1);
     contentPane.add(linha2);
     contentPane.add(linha3);

     frame.pack();
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);
   }
}
