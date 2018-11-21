package teste;

public class Material<X, Y, Z> implements Volumavel<X, Y, Z>{

	private String nome;
	private Double densidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDensidade() {
		return densidade;
	}

	public void setDensidade(Double densidade) {
		this.densidade = densidade;
	}

	@Override
	public Double valorDoEixoX() {
		return null;
	}

	@Override
	public Double valorDoEixoY() {
		return null;
	}

	@Override
	public Double valorDoEixoZ() {
		return null;
	}

	@Override
	public String definirCentroEspacial() {
		return null;
	}
}
