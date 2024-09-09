import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(2,3);
        System.out.println(listaNumeros);
        System.out.println(listaNumeros.get(0));
        System.out.println(listaNumeros.remove(3));
        System.out.println("Iterando via for com get:");
        for (int i=0; i<listaNumeros.size(); i++) {
            int numero = listaNumeros.get(i);
            System.out.println(numero);
        }
        System.out.println("Iterando via for each:");
        for (int numero : listaNumeros) {
            System.out.println(numero);
        }
        System.out.println("Iterando via iterador explicito:");
        Iterator<Integer> iterador = listaNumeros.iterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            System.out.println(numero);
        }
    }
}
