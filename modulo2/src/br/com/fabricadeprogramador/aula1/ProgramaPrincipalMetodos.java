package br.com.fabricadeprogramador.aula1;

public class ProgramaPrincipalMetodos {

	public static void main(String[] args) {
		//Instancia de Calculadora
		Calculadora c1 = new Calculadora();
		
		//Atribuicao de valor em uma propriedade
		c1.marca="x";
		
		//Retorno - Invocação de métodos com passagem de parametros e atribuição do retorno
		double s = c1.somar(10, 20);
	
		//Saída
		System.out.println(s);
		
	}

}