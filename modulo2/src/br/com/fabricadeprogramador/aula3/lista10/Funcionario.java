package br.com.fabricadeprogramador.aula3.lista10;

public class Funcionario extends PessoaFisica {
	private String cargo;
	private Double salario;
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
