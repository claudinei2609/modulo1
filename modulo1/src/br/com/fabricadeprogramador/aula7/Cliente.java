package br.com.fabricadeprogramador.aula7;

public class Cliente {
	private String nome;
	private char sexo;
	private int idade;
	//Atribuição 
	public void setNome(String nome){
		this.nome =nome.toUpperCase();
	}
	//Retorno
	public String getNome(){
		return nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
