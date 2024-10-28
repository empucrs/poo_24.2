import java.util.Arrays;
import java.util.Comparator;

public class Exemplo2 {

    public static void main(String[] args) {
        String[] strings = "O rato roeu a roupa do Rei de Roma".split(" ");
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String first, String second) {
                return Integer.compare(first.length(), second.length());
            }
        });
        System.out.println(Arrays.toString(strings));
    }
}
