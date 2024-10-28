import java.util.Arrays;
import java.util.Comparator;

public class Exemplo3 {
    public static void main(String[] args) {
        String[] strings = "O rato roeu a roupa do Rei de Roma".split(" ");
        Comparator<String> comp = (String first, String second) -> Integer.compare(first.length(), second.length());
        Arrays.sort(strings, comp);
        System.out.println(Arrays.toString(strings));
    }    
}
