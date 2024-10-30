import javax.swing.SwingUtilities;

public class AppEventosSwing1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppEventosSwing1::criarGui);
    }
    public static void criarGui() {
        EventosSwing1 janela = new EventosSwing1();
        janela.setSize(700, 100);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
