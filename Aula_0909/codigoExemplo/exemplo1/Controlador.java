import java.util.ArrayList;

public class Controlador {
    private ArrayList<Controlavel> dispositivos;

    public Controlador() {
        dispositivos = new ArrayList<>();
    }

    public void registrarDispositivo(Controlavel dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void ligarTodosDispositivos() {
        for (Controlavel dispositivo : dispositivos) {
            dispositivo.ligar();
        }
    }

    public void desligarTodosDispositivos() {
        for (int i = 0; i < dispositivos.size(); i++) {
            dispositivos.get(i).desligar();
        }
    }
}
