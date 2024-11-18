import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solucao {

    public static void main(String[] args) {
        List <String> list = Arrays.asList("alpha", "bravo", "charlie", "delta","echo", "foxtrot");

        //item A
        System.out.println("Item A");
        //Alternativa A de operação
        //list.stream().forEach(System.out::println);
        //Alternativa B de operação
        list.forEach(System.out::println);
        

        //item B
        System.out.println("\nItem B");
        String result = list.stream().map(s -> String.valueOf(s.charAt(0))).reduce("", String::concat);
        System.out.println(result);

        //item c
        System.out.println("\nItem C");
        // Alternativa A de operação
        //list.replaceAll(String::toUpperCase);
        //System.out.println(list);
        // Alternativa B de operação
        //list.stream().map(s -> s.toUpperCase()).forEach(System.out :: println);
        // Alternativa C de operação
        list.stream().map(s -> String.valueOf(s.toUpperCase())).forEach(System.out::println);

        //item d
        System.out.println("\nItem D");
        //// Alternativa A de operação
        List<String> novaMaiuscula  = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(novaMaiuscula);
        //// Alternativa B de operação
        List<String>list3= list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list3);

        //item e
        System.out.println("\nItem E");
        // Alternativa A de operação
        long count = list.stream().filter(s -> s.length() >= 6).count();
        System.out.println(count);        

    }
    
}