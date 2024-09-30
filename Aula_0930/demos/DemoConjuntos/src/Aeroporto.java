

public class Aeroporto {
	private String codigo;
	private String nome;

	//private Geo loc;
	
	public Aeroporto(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		//this.loc = loc;
	}

	public Aeroporto(String codigo, String nome, double lat, double lon) {
		this.codigo = codigo;
		this.nome = nome;
		//this.loc = new Geo(lat, lon);
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aeroporto{" +
				"codigo='" + codigo + '\'' +
				", nome='" + nome + '\'' +
				'}';
	}

    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Aeroporto aeroporto = (Aeroporto) o;

		if (!codigo.equals(aeroporto.codigo)) return false;
		return nome.equals(aeroporto.nome);
	}

	@Override
	public int hashCode() {
		int result = codigo.hashCode();
		result = 31 * result + nome.hashCode();
		return result;
	}
}
