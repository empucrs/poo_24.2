import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CadastroFuncionariosOriginal {
	private List<Funcionario> lstf;

	public CadastroFuncionariosOriginal() {
		lstf = new LinkedList<>();

		Random r = new Random();

		for (int i = 0; i < 40; i++) {
			int matricula = r.nextInt(1000) + 100;
			String nome = "Fulano" + i;
			boolean insalubridade = r.nextBoolean();
			int nroDep = r.nextInt(3) + 1;
			double salBase = (r.nextDouble() * 15000) + 500;
			Funcionario f = new Funcionario(matricula, nome, salBase, nroDep, insalubridade);
			lstf.add(f);
		}
	}

	public List<Funcionario> getFuncionarios() {
		return Collections.unmodifiableList(lstf);
	}

	@Override
	public String toString() {
		return "CadastroFuncionarios [lstf=" + lstf + "]";
	}

	// 2a
	public List<Funcionario> getInsalubridadeDependentes() {
		return new ArrayList<Funcionario>();
	}

	// 2b
	public long quantidadeFuncionariosComDependentes() {
		return 0;
	}

	// 2c
	public double somatorioSalarioBruto() {
		return 0;
	}

	// 2d
	public void aumentaSalarioInsalubres() {
	}

	// 2e
	public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase() {
		return new ArrayList<String>();
	}

	// 2f
	public double mediaSalarialDosQueNaoTemInsalubridade() {
		return 0;
	}

	// 2g
	public List<String> nomesDosQueTemMatriculaMenorQue500() {
		return new ArrayList<String>();
	}

	// 2h
	public double getSalarioLiquido(int matricula) {
		return 0;
	}
}
