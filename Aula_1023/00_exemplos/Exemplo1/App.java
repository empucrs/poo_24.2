import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pessoa> lst = new ArrayList<>();
        lst.add(new Pessoa("John Doe", 22));
        lst.add(new Pessoa("Mary Doe", 20));
        lst.add(new Pessoa("Joan Doe", 12));
        //imprimir pessoas maiores de 15 anos
        System.out.println("Código estilo imperativo:");
        for (Pessoa p : lst) {
            if (p.getIdade() > 15) {
                System.out.println(p);
            }
        }
        //imprimir pessoas maiores de 15 anos
        System.out.println("Código estilo funcional:");
        lst.stream()
           .filter(p -> p.getIdade() > 15)
           .forEach(System.out::println);
    }
}
