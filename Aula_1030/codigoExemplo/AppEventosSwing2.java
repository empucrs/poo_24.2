import javax.swing.SwingUtilities;

public class AppEventosSwing2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppEventosSwing2::criarGui);
    }
    public static void criarGui() {
        EventosSwing2 janela = new EventosSwing2();
        janela.setSize(700, 100);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
