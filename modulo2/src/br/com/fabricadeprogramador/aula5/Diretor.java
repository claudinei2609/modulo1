package br.com.fabricadeprogramador.aula5;

import br.com.fabricadeprogramador.aula2.Funcionario;

public class Diretor  extends Funcionario{

	public Diretor() {
	}
	public Diretor(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}

	@Override
	public double calcularSalario() {
		return getSalario() + (getSalario()*10/100);
	}

}
