import java.util.*;
import java.util.stream.Collectors;

public class CadastroFuncionarios extends CadastroFuncionariosOriginal {

	public CadastroFuncionarios() {
		super();
	}

	public List<Funcionario> getFuncionarios() {
		List<Funcionario> lista = lstf.stream().toList();
		return Collections.unmodifiableList(lstf);
	}

	@Override
	public String toString() {
		return "CadastroFuncionarios [lstf=" + lstf + "]";
	}

	// 2a
	public List<Funcionario> getInsalubridadeDependentes() {
		return lstf.stream().filter(f -> ((f.getInsalubridade()) && (f.getNroDependentes()>0))).toList();
	}

	// 2b
	public long quantidadeFuncionariosComDependentes() {
		return lstf.stream().filter(f -> f.getNroDependentes()>0).count();
	}

	// 2c
	public double somatorioSalarioBruto() {
		return lstf.stream().filter(f-> f.getSalarioBruto()>5000).mapToDouble(f -> f.getSalarioBruto()).sum();
	}

	// 2d
	public void aumentaSalarioInsalubres() {
		lstf.stream().filter(f-> f.getInsalubridade()).forEach(f -> f.aumentaSalBase(1.2));
	}

	// 2e
	public List<String> getNomeMatriculaSalarioBrutoMaiorQueBase() {
		return lstf.stream().filter(f -> f.getSalarioBase()*1.1<f.getSalarioBruto()).map(f -> f.getMatricula()+": "+f.getNome()).collect(Collectors.toList());
	}

	// 2f
	public double mediaSalarialDosQueNaoTemInsalubridade() {
		return lstf.stream().filter(f-> !f.getInsalubridade()).mapToDouble( f-> f.getSalarioBruto()).average().orElse(0);
	}

	// 2g
	public List<String> nomesDosQueTemMatriculaMenorQue500() {
		return lstf.stream().filter(f -> f.getMatricula()<500).map(f -> f.getNome()).toList();
	}

	// 2h
	public double getSalarioLiquido(int matricula) {
		Funcionario fnc = lstf.stream().filter( f -> f.getMatricula()==matricula).findFirst().orElse(null);
		return ((fnc!=null))?fnc.getSalarioLiquido():-1;
	}
}
