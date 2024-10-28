import java.util.Arrays;

public class Exemplo4 {

    public static void main(String[] args) {
        String[] strings = "O rato roeu a roupa do Rei de Roma".split(" ");
        Arrays.sort(strings, (first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println(Arrays.toString(strings));
    }
}
