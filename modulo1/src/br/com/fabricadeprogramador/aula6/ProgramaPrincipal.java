package br.com.fabricadeprogramador.aula6;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int n;
		System.out.println("0 -sair");
		// objeto de leitura de dados
		do {										// faça
			System.out.println("Digite um Numero:");// pede pra usuario digitar numero
			n = leitor.nextInt();//arribui o valor digitado  a variavel
			
		}while(n!=0);
		
		System.out.println("Programa encerrado!");
		leitor.close();


	
		
	}
}
