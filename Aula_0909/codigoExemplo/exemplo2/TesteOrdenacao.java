import java.util.Arrays;

public class TesteOrdenacao {
    public static void main(String[] args) {
        /*
        String[] letras = {"c","a","b"};
        System.out.println("Antes da ordenação:");
        imprimeArray(letras);
        Arrays.sort(letras);
        System.out.println("Depois da orndenação:");
        imprimeArray(letras);
        */

        /*
        PessoaV1[] pessoas = new PessoaV1[3];
        pessoas[0] = new PessoaV1("John Doe", 22);
        pessoas[1] = new PessoaV1("Mary Doe", 20);
        pessoas[2] = new PessoaV1("Charles Xavier", 50);
        System.out.println("Antes da ordenação:");
        imprimeArray(pessoas);
        Arrays.sort(pessoas);
        System.out.println("Depois da ordenação:");
        imprimeArray(pessoas);
        */

        PessoaV2[] pessoas = new PessoaV2[3];
        pessoas[0] = new PessoaV2("John Doe", 22);
        pessoas[1] = new PessoaV2("Mary Doe", 20);
        pessoas[2] = new PessoaV2("Charles Xavier", 50);
        System.out.println("Antes da ordenação:");
        imprimeArray(pessoas);
        Arrays.sort(pessoas);
        System.out.println("Depois da orndenação:");
        imprimeArray(pessoas);
    }

    public static void imprimeArray (Object[] array) {
        for(Object elemento : array) {
            System.out.println(elemento);
        }
    }
}
