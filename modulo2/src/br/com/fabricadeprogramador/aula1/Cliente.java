package br.com.fabricadeprogramador.aula1;

public class Cliente {
	private String nome;
	private String rg;
	private String cpf;
	private Cidade cidade;
	
	private static int qtdCliente=0;
	
	public Cliente() {
		qtdCliente++;
	}
	public static int getQtdCliente(){
		return qtdCliente;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public String getNomeCidade(){
		return cidade.getNome();
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
