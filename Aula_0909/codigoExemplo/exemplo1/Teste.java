public class Teste {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.registrarDispositivo(new Lustre(3));
        controlador.registrarDispositivo(new Lustre(2));
        controlador.ligarTodosDispositivos();
    }
}
