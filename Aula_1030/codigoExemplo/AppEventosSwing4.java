import javax.swing.SwingUtilities;

public class AppEventosSwing4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppEventosSwing4::criarGui);
    }
    public static void criarGui() {
        EventosSwing4 janela = new EventosSwing4();
        janela.setSize(700, 100);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
