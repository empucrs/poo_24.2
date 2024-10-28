import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questao01 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta",
"echo", "foxtrot");

        // Item a
        // tradicionalmente
        //for(String str: list)
        //    System.out.println(str);
        
        // com Stream
        //list.stream().forEach( str -> System.out.println(str));
        //list.stream().forEach( System.out::println );
        //System.out.println(list.stream().collect(Collectors.joining(", ")));
        String [] resultado = list.stream().collect(Collectors.joining(",")).split(",");
        Stream fluxo = Stream.of(resultado);
        fluxo.forEach(System.out::println);
        
    }
    
}
