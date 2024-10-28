import java.util.ArrayList;
import java.util.List;

public class Exemplo2 {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Estudante 1",2015,8.5));
        estudantes.add(new Estudante("Estudante 2",2017,7.0));
        estudantes.add(new Estudante("Estudante 3",2015,9.5));

        double maiorNota = estudantes.stream()
                .filter(e -> e.getAnoGraduacao() == 2015)
                .mapToDouble(Estudante::getNota)
                .max()
                .getAsDouble();

        System.out.println(maiorNota);
    }
}
