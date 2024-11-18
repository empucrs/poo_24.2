import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        CadastroFuncionarios cf = new CadastroFuncionarios();        

        // 2a
        System.out.println("Item 2a");
        cf.getInsalubridadeDependentes().stream().forEach(System.out::println);

        // 2b
        System.out.println("Item 2b");
        System.out.println(cf.quantidadeFuncionariosComDependentes());

        // 2c
        System.out.println("Item 2c");
        System.out.println(cf.somatorioSalarioBruto());

        // 2d
        System.out.println("Item 2c");
        System.out.println("Pre aumento");
        cf.getFuncionarios().stream().filter(f -> f.getInsalubridade()).map(f -> f.getNome()+": R$"+f.getSalarioLiquido()).forEach(System.out::println);
        System.out.println("Pos aumento");
        cf.aumentaSalarioInsalubres();
        cf.getFuncionarios().stream().filter(f -> f.getInsalubridade()).map(f -> f.getNome()+": R$"+f.getSalarioLiquido()).forEach(System.out::println);

        // 2e
        System.out.println("Item 2e");
        cf.getNomeMatriculaSalarioBrutoMaiorQueBase().stream().forEach(System.out::println);

        // 2f
        System.out.println("Item 2f");
        System.out.println(cf.mediaSalarialDosQueNaoTemInsalubridade());

        // 2g
        System.out.println("Item 2f");
        cf.nomesDosQueTemMatriculaMenorQue500().stream().forEach(System.out::println);
        
        // 2h
        System.out.println("Item 2h");
        System.out.println(cf.getSalarioLiquido(500));
       
    }
}
