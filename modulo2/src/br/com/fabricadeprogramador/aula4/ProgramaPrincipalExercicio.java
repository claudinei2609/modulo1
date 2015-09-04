package br.com.fabricadeprogramador.aula4;

import br.com.fabricadeprogramador.aula2.Funcionario;
import br.com.fabricadeprogramador.aula5.Analista;

public class ProgramaPrincipalExercicio {

	public static void main(String[] args) {
		//nome, cpf, rg, cargo
	Funcionario f1 = new Analista("Jão", "999", "000099090/ssp-ms", "Motorista",5000.0);
	System.out.println(f1);
	}

}
