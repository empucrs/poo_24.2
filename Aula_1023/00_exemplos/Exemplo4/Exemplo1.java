import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Estudante 1",2015,8.5));
        estudantes.add(new Estudante("Estudante 2",2017,7.0));
        estudantes.add(new Estudante("Estudante 3",2015,9.5));

        double maiorNota = 0.0;
        for (Estudante estudante : estudantes) {
            if (estudante.getAnoGraduacao() == 2015) {
                if (estudante.getNota() > maiorNota) {
                    maiorNota = estudante.getNota();
                }
            }
        }

        System.out.println(maiorNota);
    }
}
