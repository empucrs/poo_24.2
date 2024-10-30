import javax.swing.SwingUtilities;

public class AppEventosSwing3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppEventosSwing3::criarGui);
    }
    public static void criarGui() {
        EventosSwing3 janela = new EventosSwing3();
        janela.setSize(700, 100);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
