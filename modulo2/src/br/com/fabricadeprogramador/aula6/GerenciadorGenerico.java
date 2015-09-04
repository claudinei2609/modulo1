package br.com.fabricadeprogramador.aula6;


public class GerenciadorGenerico<T> {
	public void cadastrar(T ob){
		System.out.println(ob.getClass().getSimpleName() 
				+ " Cadastrado com Sucesso!");
	}
}
