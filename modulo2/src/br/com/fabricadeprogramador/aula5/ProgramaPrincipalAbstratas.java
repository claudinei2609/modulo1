package br.com.fabricadeprogramador.aula5;

import br.com.fabricadeprogramador.aula2.Funcionario;

public class ProgramaPrincipalAbstratas {

	public static void main(String[] args) {
		
		Funcionario f1 =  new Analista("Jão", 5000.0);
		double salF1 = f1.calcularSalario();
		
		Funcionario f2 =  new Diretor("Maria", 5000.0);
		double salF2 = f2.calcularSalario();
		
		System.out.println(salF1);
		System.out.println(salF2);
	}

}
