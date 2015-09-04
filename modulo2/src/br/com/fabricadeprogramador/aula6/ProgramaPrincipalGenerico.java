package br.com.fabricadeprogramador.aula6;

import br.com.fabricadeprogramador.aula1.Cidade;
import br.com.fabricadeprogramador.aula2.Cliente;


public class ProgramaPrincipalGenerico {

	public static void main(String[] args) {
		
		GerenciadorCliente gcli = new GerenciadorCliente();
		gcli.cadastrar(new Cliente());
		
		GerenciadorCidade gcid =  new GerenciadorCidade();
		gcid.cadastrar(new Cidade());
		
	}
}
