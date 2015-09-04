package br.com.fabricadeprogramador.aula3.sobrescrita;

import br.com.fabricadeprogramador.aula2.Pessoa;

public class ProgramaPrincipalSobrescrita {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
	
		p1.setNome("JAO");
		
		Pessoa p2= new Pessoa();
		p2.setNome("JAO");
		
		System.out.println(p2.equals(p1));
		System.out.println("HasCode p1:"+  p1.hashCode());
		
		System.out.println("HasCode p2:"+  p2.hashCode());
		
	}

}
