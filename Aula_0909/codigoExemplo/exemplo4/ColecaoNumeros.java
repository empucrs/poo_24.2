import java.util.Iterator;

// Classe que representa uma coleção de números inteiros
public class ColecaoNumeros implements Iterable<Integer> {
    private Integer[] numeros;

    // Construtor que recebe um array de inteiros e inicializa a coleção
    public ColecaoNumeros(Integer[] numeros) {
        this.numeros = numeros;
    }

    // Implementação do método iterator() da interface Iterable
    @Override
    public Iterator<Integer> iterator() {
        return new NumerosIterator();
    }

    // Classe interna que implementa o Iterator para percorrer os números na coleção
    private class NumerosIterator implements Iterator<Integer> {
        private int index = 0;

        // Método para verificar se ainda há elementos na coleção
        @Override
        public boolean hasNext() {
            return index < numeros.length;
        }

        // Método para obter o próximo elemento na coleção
        @Override
        public Integer next() {
            return numeros[index++];
        }
    }

    // Método principal para teste
    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        ColecaoNumeros colecao = new ColecaoNumeros(numeros);

        // Iterando e imprimindo os números na coleção
        for (Integer numero : colecao) {
            System.out.println(numero);
        }
    }
}
