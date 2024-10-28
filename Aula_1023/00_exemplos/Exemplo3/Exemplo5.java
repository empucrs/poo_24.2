import java.util.Arrays;

public class Exemplo5 {
public static void main(String[] args) {
        String[] strings = "O rato roeu a roupa do Rei de Roma".split(" ");
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }    
}
