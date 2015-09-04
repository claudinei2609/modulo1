package br.com.fabricadeprogramador.aula3.lista10;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Cidade cidade; //tem um
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "Nome:"+ nome;
	}
	
	
}
