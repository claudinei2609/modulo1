package br.com.fabricadeprogramador.aula1;

public class Estado {
	private String nome;
	private String uf;

	public Estado() {
		// TODO Auto-generated constructor stub
	}
	
	public Estado(String uf) {
		setUf(uf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Estado [nome=" + nome + ", uf=" + uf + "]";
	}

}
