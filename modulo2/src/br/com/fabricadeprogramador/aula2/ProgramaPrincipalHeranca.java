package br.com.fabricadeprogramador.aula2;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula1.Estado;

public class ProgramaPrincipalHeranca {

	public static void main(String[] args) {
		
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		Cidade cg = new Cidade();
		cg.setNome("Campo Grande");
		cg.setEstado(ms);
		
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Jão"); //Pessoa
		cliente.setRg("909090909");
		cliente.setCpf("9090");
		cliente.setCidade(cg); //Pessoa
		
	}

}
