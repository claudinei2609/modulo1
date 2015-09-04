package br.com.fabricadeprogramador.aula6;

import java.util.Scanner;

public class ProgramaPrincipalArray {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantidade:");
		int qtd= leitor.nextInt();
		
		int n[] = new int[qtd]; 
		//Carga no vetor
		for (int i=0; i<n.length; i++ ){
			System.out.println("Digite N"+(i+1) +":");
			n[i] = leitor.nextInt();
		}
		
		//Impressao do vetor
		for (int i=0; i<n.length ;i++){
			System.out.println(n[i]);
		}
		
		leitor.close();
	}

}
