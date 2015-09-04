package br.com.fabricadeprogramador.aula6;

import java.util.Scanner;

public class ProgramaPrincipalFor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("0 -sair");
		
		
		
		for (int n=-1 ; n!=0 ; ){
			System.out.println("Digite um Numero:");
			n = leitor.nextInt();
		}	
		
		
		System.out.println("Programa encerrado!");
		leitor.close();

	}

}
