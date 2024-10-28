import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {

    public static <T> Double somatorio(List<T> lst, Condicao<T> condicao, Operacao<T> operacao) {
        Double somatorio = 0.0;
        for(T obj : lst){
            if (condicao.verifica(obj)) {
                somatorio += operacao.calcula(obj);
            }
        }
        return somatorio;
    }

    public static void main(String[] args) throws Exception {
        // Cria uma lista de funcionarios
        int TAM = 100;
        List<Funcionario> lstf = new LinkedList<>();
		Random r = new Random();
		for (int i = 0; i < TAM; i++) {
			int matricula = r.nextInt(300) + 100;
			String nome = "Fulano" + i;
			boolean insalubridade = r.nextBoolean();
			int nroDep = r.nextInt(4);
			double salBase = (r.nextDouble() * 15000) + 500;
			Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
			lstf.add(f);
		}

        //Calcula o total gasto com impostos com os funcionários insalubres
        Condicao<Funcionario> condicao = f -> f.getInsalubridade();
        Operacao<Funcionario> impostos = f -> f.inss() + f.irpf();
        Double gastosComImpostos = somatorio(lstf, condicao, impostos);
        System.out.println("Gastos com impostos dos insalubres: " + gastosComImpostos);

        // Calcula somatório dos salários dos funcionários com mais de dois dependentes
        Condicao<Funcionario> condicao2 = f->f.getNroDependentes() > 2;
        Operacao<Funcionario> impostos2 = f->f.getSalarioLiquido();

        Double gastosComSalarios = somatorio(lstf, condicao2, impostos2);
        System.out.println("Gastos com salarios: "+gastosComSalarios);
    }
}
