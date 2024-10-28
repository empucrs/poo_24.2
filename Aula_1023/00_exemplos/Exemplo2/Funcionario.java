public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBase;
	private int nroDependentes;
	private boolean insalubridade;

	public Funcionario(int matricula, String nome, double salarioBase, int nroDependentes, boolean insalubridade) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nroDependentes = nroDependentes;
		this.insalubridade = insalubridade;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public int getNroDependentes() {
		return nroDependentes;
	}

	public boolean getInsalubridade() {
		return insalubridade;
	}

	public void aumentaSalBase(double taxa){
		salarioBase *= taxa;
	}
	
	public double inss() {
		if (getSalarioBase() <= 5000.0){
		return (getSalarioBase() * 0.045);
		}else{
			return 5000.0 * 0.045;
		}
	}

	public double irpf() {
		if (getSalarioBase() <= 2000) {
			return 0.0;
		} else if (getSalarioBase() <= 5000) {
			return ((getSalarioBase() - 2000) * 0.12);
		} else {
			double p1 = 3000 * 0.12;
			double p2 = (getSalarioBase() - 5000) * 0.275;
			return (p1 + p2);
		}
	}

	public double getSalarioBruto() {
		double adicInsalubridade = 0.0;
		double adicDep = 0.0;

		if (getInsalubridade()) {
			adicInsalubridade = getSalarioBase() * 0.1;
		}

		adicDep = getNroDependentes() * (getSalarioBase() * 0.01);

		return (getSalarioBase() + adicInsalubridade + adicDep);
	}

	public double getSalarioLiquido() {
		return (getSalarioBruto() - inss() - irpf());
	}

	@Override
	public String toString() {
		return "[matr=" + matricula + ", nome=" + nome + ", salBase=" + salarioBase
				+ ", nroDep=" + nroDependentes + ", insal=" + insalubridade + "]";
	}
}
