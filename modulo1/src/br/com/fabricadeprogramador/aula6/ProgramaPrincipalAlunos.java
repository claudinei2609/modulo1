package br.com.fabricadeprogramador.aula6;

import java.util.Scanner;

public class ProgramaPrincipalAlunos {

	public static void main(String[] args) {

		// Criacao da Sala
		Sala s1 = new Sala();
		s1.capacidade = 2;
		s1.numero = 1;
		s1.alunos = new Aluno[2];

		// Criando os alunos

		Scanner leitor = new Scanner(System.in);
		//Leitura
		for (int i=0; i<s1.alunos.length; i++){
			
			System.out.println("Nome:");
			s1.alunos[i].nome =leitor.next();
			System.out.println("Email:");
			s1.alunos[i].email = leitor.next();
		}
		//Impressao
		for (int i = 0; i < s1.alunos.length; i++) {
			System.out.println(s1.alunos[i].nome);
			System.out.println(s1.alunos[i].email);
		}

	}

}
