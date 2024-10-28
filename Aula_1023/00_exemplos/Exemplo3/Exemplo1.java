import java.util.Arrays;
import java.util.Comparator;

public class Exemplo1 {

    private static class LengthComparator implements Comparator<String> {
        public int compare(String first, String second) {
            return Integer.compare(first.length(), second.length());
        }
    }

    public static void main(String[] args) {
        String[] strings = "O rato roeu a roupa do Rei de Roma".split(" ");
        Comparator<String> comp = new LengthComparator();
        Arrays.sort(strings, comp);
        System.out.println(Arrays.toString(strings));
    }
}
