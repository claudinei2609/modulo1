package br.com.fabricadeprogramador.aula4;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula1.Estado;
import br.com.fabricadeprogramador.aula2.Pessoa;

public class ProgramaPrincipalConstrutores {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jão", new Cidade("Bonito",new Estado("MS") ) );
		
		Pessoa p2 = new Pessoa("Maria");
		
		Pessoa p3 = new Pessoa("Virmerson", new Cidade("Campo Grande", new Estado("MS")));
		System.out.println(p3);
		
		
		new Integer(10);
		new String();
		new Double(10.4);
		
		
	}

}
